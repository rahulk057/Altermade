package com.blog.service;

import org.springframework.stereotype.Service;

import com.blog.entity.ClientCOI;

@Service
public interface ClientCoiService {
	
	ClientCOI createClientCoi( ClientCOI clientCOI);
	ClientCOI updateClientClientCoi(Long id, ClientCOI clientCOI);


}
