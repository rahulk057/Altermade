package com.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.entity.ProviderEnrollment;
import com.blog.repository.ProviderEnrollmentRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProviderEnrollmentServiceImpl implements ProviderEnrollmentService {
@Autowired
	ProviderEnrollmentRepository providerEnrollmentRepository;
	@Override
	public ProviderEnrollment saveProviderEnrollment(ProviderEnrollment providerEnrollment) {
		// TODO Auto-generated method stub
		return providerEnrollmentRepository.save(providerEnrollment);
	}
	@Override
	public ProviderEnrollment updateProviderEnrollment(Long id, ProviderEnrollment providerEnrollment) {
      Optional<ProviderEnrollment> existingRecord = providerEnrollmentRepository.findById(id);
        
        if (existingRecord.isPresent()) {
            ProviderEnrollment updatedEnrollment = existingRecord.get();

            // Update the fields with the new values
            updatedEnrollment.setClientName(providerEnrollment.getClientName());
            updatedEnrollment.setPayorName(providerEnrollment.getPayorName());
            updatedEnrollment.setProvider(providerEnrollment.getProvider());
            updatedEnrollment.setLocation(providerEnrollment.getLocation());
            updatedEnrollment.setEnrollmentStatus(providerEnrollment.getEnrollmentStatus());
            updatedEnrollment.setProductList(providerEnrollment.getProductList());
            updatedEnrollment.setState(providerEnrollment.getState());
            updatedEnrollment.setExpiryMonitor(providerEnrollment.getExpiryMonitor());
            updatedEnrollment.setContractType(providerEnrollment.getContractType());
            updatedEnrollment.setGroupId(providerEnrollment.getGroupId());
            updatedEnrollment.setEffectiveDate(providerEnrollment.getEffectiveDate());
            updatedEnrollment.setExpirationDate(providerEnrollment.getExpirationDate());
            updatedEnrollment.setProviderId(providerEnrollment.getProviderId());

            // Save the updated record
            return providerEnrollmentRepository.save(updatedEnrollment);
        } else {
            throw new RuntimeException("Enrollment with id " + id + " not found.");
        }
	}
	@Override
	public ProviderEnrollment getProviderEnrollmentById(Long id) {
		// TODO Auto-generated method stub
		return providerEnrollmentRepository.findById(id).orElse(null);
	}
	@Override
	public List<ProviderEnrollment> getAllProviderEnrollments() {
		// TODO Auto-generated method stub
		return providerEnrollmentRepository.findAll();
	}

}
