package com.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.entity.ProviderTraining;
import com.blog.repository.ProviderTrainingRepository;

import java.util.List;
import java.util.Optional;


@Service
public class ProviderTrainingServiceimpl implements ProviderTrainingService {
    
	@Autowired
	ProviderTrainingRepository providerTrainingRepository;
	@Override
	public ProviderTraining savepProviderTraining(ProviderTraining providerTraining) {
		// TODO Auto-generated method stub
		return providerTrainingRepository.save(providerTraining);
	}
	@Override
	public ProviderTraining updateProviderTraining(Long id, ProviderTraining providerTraining) {
		// TODO Auto-generated method stub
		
		 Optional<ProviderTraining> existingProviderTraining = providerTrainingRepository.findById(id);
	        
	        if (existingProviderTraining.isPresent()) {
	            ProviderTraining updatedProviderTraining = existingProviderTraining.get();
	            
	            // Update fields from the request body
	            updatedProviderTraining.setProviderName(providerTraining.getProviderName());
	            updatedProviderTraining.setEducationType(providerTraining.getEducationType());
	            updatedProviderTraining.setDegreeName(providerTraining.getDegreeName());
	            updatedProviderTraining.setDegreeAwardedDate(providerTraining.getDegreeAwardedDate());
	            updatedProviderTraining.setStartDate(providerTraining.getStartDate());
	            updatedProviderTraining.setEndDate(providerTraining.getEndDate());
	            updatedProviderTraining.setSpeciality(providerTraining.getSpeciality());
	            updatedProviderTraining.setDirectorName(providerTraining.getDirectorName());
	            updatedProviderTraining.setAddress(providerTraining.getAddress());
	            updatedProviderTraining.setAddress2(providerTraining.getAddress2());
	            updatedProviderTraining.setCity(providerTraining.getCity());
	            updatedProviderTraining.setState(providerTraining.getState());
	            updatedProviderTraining.setZipCode(providerTraining.getZipCode());
	            updatedProviderTraining.setCountry(providerTraining.getCountry());
	            updatedProviderTraining.setDescription(providerTraining.getDescription());

	            return providerTrainingRepository.save(updatedProviderTraining);
	        } else {
	            throw new RuntimeException("ProviderTraining not found with id: " + id);
	        }
		
	}
	@Override
	public ProviderTraining getProviderTrainingById(Long providerTrainingId) {
		// TODO Auto-generated method stub
		return providerTrainingRepository.findById(providerTrainingId).orElse(null);
	}
	@Override
	public List<ProviderTraining> getAllProviderTraining() {
		// TODO Auto-generated method stub
		return providerTrainingRepository.findAll();
	}

}
