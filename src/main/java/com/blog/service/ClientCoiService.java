package com.blog.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.blog.entity.ClientCOI;

@Service
public interface ClientCoiService {
	
	ClientCOI createClientCoi( ClientCOI clientCOI);
	ClientCOI updateClientClientCoi(Long id, ClientCOI clientCOI);
	ClientCOI getClientClientCoiById(Long id);
	List<ClientCOI>getClientCOIs();


}
