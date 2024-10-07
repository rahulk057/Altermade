package com.blog.service;

import java.util.List;

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

	@Override
	public ProviderCOI getProviderCoiById(Long id) {
		// TODO Auto-generated method stub
		return providerCOIRepository.getById(id);
	}

	@Override
	public List<ProviderCOI> getAllProviderCoi() {
		// TODO Auto-generated method stub
		return providerCOIRepository.findAll();
	}

}
