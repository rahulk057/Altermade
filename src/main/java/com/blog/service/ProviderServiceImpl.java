package com.blog.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.entity.Client;
import com.blog.entity.ClientBillingAddress;
import com.blog.entity.ClientContact;
import com.blog.entity.ClientMailingAddress;
import com.blog.entity.Provider;
import com.blog.entity.ProviderAttestation;
import com.blog.entity.ProviderHomeAddress;
import com.blog.payloads.ProviderDto;
import com.blog.repository.ProviderRepository;

@Service
public class ProviderServiceImpl  implements ProviderService{

	@Autowired
	ProviderRepository providerRepository;
	
	 @Autowired
	    private ClientService clientService;
	
	
	public Provider saveProviderDetails(Provider provider) {
	    // Create a new Provider object to avoid overwriting the input object
	    Provider provider1 = new Provider();
	    provider1.setProviderFullName(provider.getProviderFullName());

	    provider1.setFirstName(provider.getFirstName());
	    provider1.setMiddleName(provider.getMiddleName());
	    provider1.setLastName(provider.getLastName());
	    provider1.setClientName(provider.getClientName());
	    provider1.setStatus(provider.getStatus());
	    provider1.setProviderType(provider.getProviderType());
	    provider1.setProviderSpeciality(provider.getProviderSpeciality());
	    provider1.setBirthDate(provider.getBirthDate());
	    provider1.setBirthPlace(provider.getBirthPlace());
	    provider1.setGender(provider.getGender());
	    provider1.setDriverLicense(provider.getDriverLicense());

	    provider1.setSupervisingPhysician(provider.getSupervisingPhysician());
	    provider1.setSupervisingPhysicianNPI(provider.getSupervisingPhysicianNPI());
	    provider1.setNpiNumber(provider.getNpiNumber());
	    provider1.setSocialSecurity(provider.getSocialSecurity());
	    provider1.setCitizenship(provider.getCitizenship());
	    provider1.setEmail(provider.getEmail());
	    provider1.setSecondaryEmail(provider.getSecondaryEmail());
	    provider1.setCaqhExpirables(provider.getCaqhExpirables());
	    provider1.setTeleHealth(provider.getTeleHealth());
	    provider1.setUpinNumber(provider.getUpinNumber());
	    provider1.setTaxonomyCode(provider.getTaxonomyCode());
	    provider1.setTaxonomyDescription(provider.getTaxonomyDescription());
	    provider1.setUsmleNumber(provider.getUsmleNumber());
	    provider1.setEcfmgNumber(provider.getEcfmgNumber());
	    provider1.setNotes(provider.getNotes());

	    // Handle nested ProviderHomeAddress
	    if (provider.getProviderHomeAddress() != null) {
	        ProviderHomeAddress providerHomeAddress = new ProviderHomeAddress();
	        providerHomeAddress.setCellPhone(provider.getProviderHomeAddress().getCellPhone());

	        providerHomeAddress.setHomeFax(provider.getProviderHomeAddress().getHomeFax());

	        providerHomeAddress.setAddress1(provider.getProviderHomeAddress().getAddress1());
	        providerHomeAddress.setAddress2(provider.getProviderHomeAddress().getAddress2());
	        providerHomeAddress.setCity(provider.getProviderHomeAddress().getCity());
	        providerHomeAddress.setState(provider.getProviderHomeAddress().getState());
	        providerHomeAddress.setZipcode(provider.getProviderHomeAddress().getZipcode());
	        providerHomeAddress.setCountry(provider.getProviderHomeAddress().getCountry());
	        provider1.setProviderHomeAddress(providerHomeAddress);
	    }

	    // Handle nested ProviderAttestation
	    if (provider.getProviderAttestation() != null) {
	        ProviderAttestation providerAttestation = new ProviderAttestation();
	        providerAttestation.setCaqhNumber(provider.getProviderAttestation().getCaqhNumber());

	        providerAttestation.setCaqhAttestationDate(provider.getProviderAttestation().getCaqhAttestationDate());

	        providerAttestation.setCaqhReattestationDate(provider.getProviderAttestation().getCaqhReattestationDate());
	        provider1.setProviderAttestation(providerAttestation);
	    }

	    // Save and return the Provider object
	    return providerRepository.save(provider1);
	}


	@Override
	public List<ProviderDto> getAllProvider() {
        List<Provider> providers = providerRepository.findAll();

        return providers.stream()
            .map(provider -> {
            	ProviderDto dto = new ProviderDto();
                dto.setId(provider.getId());
                dto.setProviderFullName(provider.getProviderFullName());
                dto.setBirthDate(provider.getBirthDate());
                dto.setStatus(provider.getStatus());
                dto.setProviderSpeciality(provider.getProviderSpeciality());
                dto.setNpiNumber(provider.getNpiNumber());
              

                // Fetch the client by ID and set the client name in DTO
                Client client = clientService.getClientById(Integer.parseInt(provider.getClientName()));  // Assuming clientName holds clientId
                if (client != null) {
                    dto.setClientName(client.getClientName());  // Set the client name
                }

                // Other fields as needed
                return dto;
            })
            .collect(Collectors.toList());
    }



	@Override
	public List<Provider> getActiveProvider() {
		// TODO Auto-generated method stub
		return providerRepository.findByStatus("Active");
	}


	@Override
	public List<Provider> getInactiveProvider() {
		// TODO Auto-generated method stub
		  return providerRepository.findByStatus("Inactive");
	}


	@Override
	public Provider getProviderById(Long Id) {
		// TODO Auto-generated method stub
		return providerRepository.getById(Id);
	}

}
