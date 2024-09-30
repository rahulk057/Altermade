package com.blog.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.blog.entity.ProviderLocation;
import com.blog.entity.ProviderTraining;

@Service
public interface ProviderLocationservice {

	ProviderLocation saveProviderLocation(ProviderLocation providerLocation);
    ProviderLocation updateProviderLocation(Long id, ProviderLocation providerLocation);
    ProviderLocation getProviderLocationById(Long id);
    List<ProviderLocation> getAllProviderLocation();

}
