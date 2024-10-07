package com.blog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.entity.ProviderInformation;
import com.blog.repository.ProviderInformationRepository;

@Service
public class ProviderInformationServiceImpl implements ProviderInformationService {

	@Autowired
	ProviderInformationRepository providerInformationRepository;
	
	@Override
	public ProviderInformation saveProviderInformation(ProviderInformation providerInformation) {
		// TODO Auto-generated method stub
		return providerInformationRepository.save(providerInformation);
	}

	@Override
	public ProviderInformation updateProviderInformation(Long id, ProviderInformation providerInformation) {
		// TODO Auto-generated method stub
		  // Find existing provider information by ID
        ProviderInformation existingProviderInformation = providerInformationRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Provider information not found for id: " + id));

        // Update the fields with the new data
        existingProviderInformation.setProviderName(providerInformation.getProviderName());
        existingProviderInformation.setEffectiveDate(providerInformation.getEffectiveDate());
        existingProviderInformation.setExpirationDate(providerInformation.getExpirationDate());
        existingProviderInformation.setRetroDate(providerInformation.getRetroDate());
        existingProviderInformation.setCarrierName(providerInformation.getCarrierName());
        existingProviderInformation.setPolicyNumber(providerInformation.getPolicyNumber());
        existingProviderInformation.setExpiryMonitor(providerInformation.getExpiryMonitor());
        existingProviderInformation.setOccurrenceLimit(providerInformation.getOccurrenceLimit());
        existingProviderInformation.setAggregateLimit(providerInformation.getAggregateLimit());
        existingProviderInformation.setAddress(providerInformation.getAddress());
        existingProviderInformation.setAddress2(providerInformation.getAddress2());
        existingProviderInformation.setCity(providerInformation.getCity());
        existingProviderInformation.setState(providerInformation.getState());
        existingProviderInformation.setZipCode(providerInformation.getZipCode());
        existingProviderInformation.setCountry(providerInformation.getCountry());
        existingProviderInformation.setNotes(providerInformation.getNotes());

        // Save the updated entity
        return providerInformationRepository.save(existingProviderInformation);
    }

	@Override
	public List<ProviderInformation> getInformations() {
		// TODO Auto-generated method stub
		return providerInformationRepository.findAll();
	}

	@Override
	public ProviderInformation getProviderInformationById(Long id) {
		// TODO Auto-generated method stub
		return providerInformationRepository.getById(id);
	}
	

}
