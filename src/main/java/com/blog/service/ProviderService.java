package com.blog.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.blog.entity.Client;
import com.blog.entity.Provider;
import com.blog.payloads.ProviderDto;

@Service
public interface ProviderService {

	Provider saveProviderDetails(Provider provider);	
	List<ProviderDto> getAllProvider();
	List<Provider> getActiveProvider();
	List<Provider> getInactiveProvider();
	Provider getProviderById (Long Id);
}
