package com.blog.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.blog.entity.AddProject;
import com.blog.payloads.ProviderDto;

@Service
public interface AddProjectService {

	AddProject addProject(AddProject addProject);
	List<AddProject> getAllProject();
	

}
