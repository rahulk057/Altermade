package com.blog.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.entity.ClientLicense;
import com.blog.entity.Location;
import com.blog.repository.LocationRepository;

@Service
public class LocationServiceImpl implements LocationService {
	
	@Autowired
	private LocationRepository locationRepository; 

	@Override
	public Location savelocation(Location location) {
		// TODO Auto-generated method stub
		return locationRepository.save(location);
	}

	@Override
	public Location updateClientLocation(Long id, Location location) {
		Optional<Location> existingClientLocationOpt = locationRepository.findById(id);

	    if (existingClientLocationOpt.isPresent()) {
	        Location existingClientLocation = existingClientLocationOpt.get();
	        
	        // Update fields with new values
	        existingClientLocation.setClientName(location.getClientName());
	        existingClientLocation.setProviderName(location.getProviderName());
	        existingClientLocation.setLocationList(location.getLocationList());
	        existingClientLocation.setEffectiveDate(location.getEffectiveDate());
	        existingClientLocation.setPhoneNumber(location.getPhoneNumber());
	        existingClientLocation.setFax(location.getFax());
	        existingClientLocation.setAddress(location.getAddress());
	        existingClientLocation.setAddress2(location.getAddress2());
	        existingClientLocation.setCity(location.getCity());
	        existingClientLocation.setState(location.getState());
	        existingClientLocation.setCountry(location.getCountry());

	        return locationRepository.save(existingClientLocation);  // Save updated entity
	    } else {
	        throw new RuntimeException("Client Location not found with ID: " + id);
	    }
	}
}


