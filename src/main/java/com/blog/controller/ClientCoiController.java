package com.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.entity.ClientCOI;
import com.blog.entity.Location;
import com.blog.service.ClientCoiService;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")

public class ClientCoiController {
	
	@Autowired
	private ClientCoiService clientCoiService;
	
	@PostMapping("/insertClientCoi")
	public ResponseEntity<ClientCOI> insertClientCoi(@RequestBody ClientCOI clientCOI){
		
		ClientCOI createCLientCOi=clientCoiService.createClientCoi(clientCOI);
		return ResponseEntity.ok(createCLientCOi);
		
	}
	
	@PutMapping("/updateClientCoi/{id}")
    public ResponseEntity<ClientCOI> updateClientCoi(
            @PathVariable Long id,
            @RequestBody ClientCOI clientCOI) {

		ClientCOI updatedClientCoi = clientCoiService.updateClientClientCoi(id, clientCOI);
        return ResponseEntity.ok(updatedClientCoi);
    }

	

}
