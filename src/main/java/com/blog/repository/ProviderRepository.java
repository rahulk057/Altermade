package com.blog.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blog.entity.Client;
import com.blog.entity.Provider;

@Repository
public interface ProviderRepository extends JpaRepository<Provider, Long> {

	List<Provider> findByStatus(String string);
	
	


}
