package com.blog.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.entity.AddProject;
import com.blog.entity.Client;
import com.blog.entity.Provider;
import com.blog.payloads.ProviderDto;
import com.blog.repository.AddProjectrepository;

@Service
public class AddProjectServiceImpl implements AddProjectService{

	@Autowired
	AddProjectrepository addProjectrepository;
	@Autowired
    private ClientService clientService;

	
	@Override
    public AddProject addProject(AddProject addProject) {
        // Implementation code
        return addProjectrepository.save(addProject);
    }

	
	@Override
	public List<AddProject> getAllProject() {
	    List<AddProject> projects = addProjectrepository.findAll();

	    return projects.stream()
	        .map(project -> {
	            AddProject dto = new AddProject();
	            dto.setId(project.getId());
	            dto.setProjectType(project.getProjectType());  // Assuming this is project type, not client name
	            dto.setStartDate(project.getStartDate());
	            dto.setStatus(project.getStatus());
	            dto.setNotes(project.getNotes());
	            dto.setClient_id(project.getClient_id());

	            // Fetch the client by ID and set the client name in DTO
	            if (project.getClient_id() > 0) {  // Assuming clientId is stored in the project
	                Client client = clientService.getClientById(project.getClient_id());
	                if (client != null) {
	                    dto.setClientName(client.getClientName());  // Set the client name
	                }
	            }

	            // Return the DTO with populated fields
	            return dto;
	        })
	        .collect(Collectors.toList());
	}

	
}
