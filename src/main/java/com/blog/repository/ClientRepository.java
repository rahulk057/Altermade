package com.blog.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Integer> {

	List<Client> findByStatus(String status);
}
