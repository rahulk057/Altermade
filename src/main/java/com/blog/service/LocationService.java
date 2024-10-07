package com.blog.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.blog.entity.ClientLicense;
import com.blog.entity.Location;

@Service
public interface LocationService {
	
	Location savelocation(Location location);
	Location updateClientLocation(Long id, Location location);
	Location getLocationById(Long id);
	List<Location> getLocation();

	


}
