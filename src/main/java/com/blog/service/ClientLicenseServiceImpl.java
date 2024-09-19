package com.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.entity.ClientLicense;
import com.blog.repository.ClientLicenseRepository;
import java.util.Optional;


@Service
public class ClientLicenseServiceImpl implements ClientLicenseService {

	@Autowired
	ClientLicenseRepository clientLicenseRepository;
	@Override
	public ClientLicense saveClientLicense(ClientLicense clientLicense) {
		// TODO Auto-generated method stub
		return clientLicenseRepository.save(clientLicense);
	}
	@Override
    public ClientLicense updateClientLicense(Long id, ClientLicense clientLicense) {
		Optional<ClientLicense> existingClientLicenseOpt = clientLicenseRepository.findById(id);

        if (existingClientLicenseOpt.isPresent()) {
            ClientLicense existingClientLicense = existingClientLicenseOpt.get();
            
            // Update fields with new values
            existingClientLicense.setClientName(clientLicense.getClientName());
            existingClientLicense.setLicenseType(clientLicense.getLicenseType());
            existingClientLicense.setState(clientLicense.getState());
            existingClientLicense.setExpiryMonitor(clientLicense.getExpiryMonitor());
            existingClientLicense.setLicenseNumber(clientLicense.getLicenseNumber());
            existingClientLicense.setIssueDate(clientLicense.getIssueDate());
            existingClientLicense.setExpiryDate(clientLicense.getExpiryDate());
            existingClientLicense.setSchedule(clientLicense.getSchedule());
            existingClientLicense.setNotes(clientLicense.getNotes());

            return clientLicenseRepository.save(existingClientLicense);  // Save updated entity
        } else {
            throw new RuntimeException("Client License not found with ID: " + id);
        }

	}
}
