package com.blog.service;

import org.springframework.stereotype.Service;

import com.blog.entity.ClientLicense;

@Service
public interface ClientLicenseService {

	ClientLicense saveClientLicense(ClientLicense clientLicense);
    ClientLicense updateClientLicense(Long id, ClientLicense clientLicense);

}
