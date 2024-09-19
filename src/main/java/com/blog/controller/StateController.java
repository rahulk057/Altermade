package com.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.entity.Client;
import com.blog.entity.State;
import com.blog.repository.StateRepository;

@RestController
@RequestMapping("/api/state")
@CrossOrigin("*")
@Validated
public class StateController {

	@Autowired
	StateRepository stateRepository;
	
	@GetMapping("/getAllState")
    public ResponseEntity<List<State>> getAllState() {
        List<State> state = stateRepository.findAll();
        return new ResponseEntity<>(state, HttpStatus.OK);
    }
}
