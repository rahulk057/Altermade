package com.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
		
		 @GetMapping("/getLocation/{id}")
		    public ResponseEntity<Location> getClientById(@PathVariable Long id) {
			 Location location = locationService.getLocationById(id);
		        if (location != null) {
		            return new ResponseEntity<>(location, HttpStatus.OK);
		        } else {
		            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		        }
		    }
		    
		    @GetMapping("/getLocation")
		    public ResponseEntity<List<Location>> getAllproviderTraining() {
		        List<Location> locations = locationService.getLocation();
		        return new ResponseEntity<>(locations, HttpStatus.OK);
		    }
		    
		    

}
