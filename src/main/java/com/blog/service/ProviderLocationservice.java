package com.blog.service;

import org.springframework.stereotype.Service;

import com.blog.entity.ProviderLocation;

@Service
public interface ProviderLocationservice {

	ProviderLocation saveProviderLocation(ProviderLocation providerLocation);
    ProviderLocation updateProviderLocation(Long id, ProviderLocation providerLocation);
}
