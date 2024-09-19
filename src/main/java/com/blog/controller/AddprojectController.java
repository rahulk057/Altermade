package com.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.entity.AddProject;
import com.blog.entity.Client;
import com.blog.payloads.ProviderDto;
import com.blog.repository.AddProjectrepository;
import com.blog.service.AddProjectService;

@RestController
@RequestMapping("/api/project")
@CrossOrigin("*")
@Validated
public class AddprojectController {
	
	@Autowired
	AddProjectrepository addProjectrepository;
	
	@Autowired
	AddProjectService addProjectService;

	 @PostMapping("/addProject")
	    public ResponseEntity<AddProject> createClient(@RequestBody AddProject addProject) {
		 AddProject savedClient =addProjectService.addProject(addProject);
	        return ResponseEntity.ok(savedClient);
	    }


	 @GetMapping("/getAllProject")
	 public ResponseEntity<List<AddProject>> getAllProject() {
	     List<AddProject> providerDTOs = addProjectService.getAllProject();
	     return new ResponseEntity<>(providerDTOs, HttpStatus.OK);
	 }
}
