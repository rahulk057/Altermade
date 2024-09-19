package com.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.entity.ClientMailingAddress;

public interface ClientMailingAddressRepository extends JpaRepository<ClientMailingAddress, Integer>{

	
	
}
