package com.blog.service;

import org.springframework.stereotype.Service;

import com.blog.entity.ProviderId;

@Service
public interface ProviderIdService {
	
	ProviderId saveProviderID(ProviderId providerId);
	
	ProviderId updateProviderId(Long id, ProviderId providerId);
}
