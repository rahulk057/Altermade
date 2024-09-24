package com.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.entity.ProviderCOI;
import com.blog.repository.ProviderCOIRepository;

@Service
public class ProviderCOIServiceImpl implements ProviderCOIService {
	
	@Autowired
	ProviderCOIRepository providerCOIRepository;

	@Override
	public ProviderCOI saveProvidercoi(ProviderCOI providerCOI) {
		// TODO Auto-generated method stub
		return providerCOIRepository.save(providerCOI);
	}

}
