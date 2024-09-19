package com.blog.service;

import org.springframework.stereotype.Service;

import com.blog.entity.ClientLicense;
import com.blog.entity.Location;

@Service
public interface LocationService {
	
	Location savelocation(Location location);
	Location updateClientLocation(Long id, Location location);


}
