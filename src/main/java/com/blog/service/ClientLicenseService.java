package com.blog.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.blog.entity.ClientLicense;

@Service
public interface ClientLicenseService {

	ClientLicense saveClientLicense(ClientLicense clientLicense);
    ClientLicense updateClientLicense(Long id, ClientLicense clientLicense);
    ClientLicense getClientLicenseByID(Long id);
    List<ClientLicense> getAllClientLicenses();

}
