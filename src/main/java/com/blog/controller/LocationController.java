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

import com.blog.entity.ClientLicense;
import com.blog.entity.Location;
import com.blog.service.LocationService;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")

public class LocationController {
	
	@Autowired
	private LocationService locationService;
	
	 @PostMapping("/saveLocation")
	    public ResponseEntity<Location> createClient(@RequestBody Location location) {
		 Location savedLocation =locationService.savelocation(location);
	        return ResponseEntity.ok(savedLocation);
	    }
	 

		@PutMapping("/updateClientLocation/{id}")
	    public ResponseEntity<Location> updateClientLicense(
	            @PathVariable Long id,
	            @RequestBody Location location) {

			Location updatedClientLicense = locationService.updateClientLocation(id, location);
	        return ResponseEntity.ok(updatedClientLicense);
	    }

}
