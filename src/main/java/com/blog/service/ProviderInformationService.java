package com.blog.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.blog.entity.ProviderInformation;

@Service
public interface ProviderInformationService {
	
	ProviderInformation saveProviderInformation( ProviderInformation providerInformation);
    ProviderInformation updateProviderInformation(Long id, ProviderInformation providerInformation);
    List<ProviderInformation> getInformations();

}
