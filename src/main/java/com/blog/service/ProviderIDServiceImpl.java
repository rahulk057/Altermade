package com.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import com.blog.entity.ProviderId;
import com.blog.repository.ProviderIdRepository;
@Service
public class ProviderIDServiceImpl implements ProviderIdService {

	@Autowired
	private ProviderIdRepository providerIdRepository;
	@Override
	public ProviderId saveProviderID(ProviderId providerId) {
		// TODO Auto-generated method stub
		return providerIdRepository.save(providerId);
	}
	@Override
	public ProviderId updateProviderId(Long id, ProviderId providerId) {
		  Optional<ProviderId> existingProviderOpt = providerIdRepository.findById(id);

	        // If the provider exists, update the necessary fields
	        if (existingProviderOpt.isPresent()) {
	            ProviderId existingProvider = existingProviderOpt.get();
	            
	            // Update the fields from the incoming providerId to the existing one
	            existingProvider.setProviderName(providerId.getProviderName());
	            existingProvider.setLicenseType(providerId.getLicenseType());
	            existingProvider.setState(providerId.getState());
	            existingProvider.setExpiryMonitor(providerId.getExpiryMonitor());
	            existingProvider.setLicenseNumber(providerId.getLicenseNumber());
	            existingProvider.setIssueDate(providerId.getIssueDate());
	            existingProvider.setExpiryDate(providerId.getExpiryDate());
	            existingProvider.setSchedule(providerId.getSchedule());
	            existingProvider.setNotes(providerId.getNotes());

	            // Save the updated entity back to the database
	            return providerIdRepository.save(existingProvider);
	        } else {
	            // Handle the case where the provider with the given ID does not exist
	            throw new RuntimeException("Provider with ID " + id + " not found.");
	        }
	    }
	@Override
	public ProviderId getProviderIdById(Long id) {
		// TODO Auto-generated method stub
		return providerIdRepository.findById(id).orElse(null);
	}
	@Override
	public List<ProviderId> getAlProviderIds() {
		// TODO Auto-generated method stub
		return providerIdRepository.findAll();
	}
	}
	
	


