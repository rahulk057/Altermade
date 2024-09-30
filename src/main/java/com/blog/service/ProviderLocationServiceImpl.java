package com.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import com.blog.entity.ProviderLocation;
import com.blog.repository.ProviderLocationRepository;

@Service
public class ProviderLocationServiceImpl implements ProviderLocationservice{

	@Autowired
	private ProviderLocationRepository providerLocationRepository;
	
	@Override
	public ProviderLocation saveProviderLocation(ProviderLocation providerLocation) {
		// TODO Auto-generated method stub
		return providerLocationRepository.save(providerLocation);
	}

	@Override
	public ProviderLocation updateProviderLocation(Long id, ProviderLocation providerLocation) {
		 Optional<ProviderLocation> existingProviderLocation = providerLocationRepository.findById(id);
	        
	        if (existingProviderLocation.isPresent()) {
	            ProviderLocation updateProviderLocation = existingProviderLocation.get();
	            
	            // Update the fields of the existing entity
	            updateProviderLocation.setClientName(providerLocation.getClientName());
	            updateProviderLocation.setProviderName(providerLocation.getProviderName());
	            updateProviderLocation.setLocationList(providerLocation.getLocationList());
	            updateProviderLocation.setEffectiveDate(providerLocation.getEffectiveDate());
	            updateProviderLocation.setPhoneNumber(providerLocation.getPhoneNumber());
	            updateProviderLocation.setFax(providerLocation.getFax());
	            updateProviderLocation.setAddress(providerLocation.getAddress());
	            updateProviderLocation.setAddress2(providerLocation.getAddress2());
	            updateProviderLocation.setCity(providerLocation.getCity());
	            updateProviderLocation.setState(providerLocation.getState());
	            updateProviderLocation.setCountry(providerLocation.getCountry());

	            return providerLocationRepository.save(updateProviderLocation);
	        } else {
	            // You could throw an exception or return null if the id is not found
	            throw new RuntimeException("ProviderLocation not found with id: " + id);
	        }
	    }

	@Override
	public ProviderLocation getProviderLocationById(Long id) {
		// TODO Auto-generated method stub
		return providerLocationRepository.findById(id).orElse(null);
	}

	@Override
	public List<ProviderLocation> getAllProviderLocation() {
		// TODO Auto-generated method stub
		return providerLocationRepository.findAll();
	}
	}


