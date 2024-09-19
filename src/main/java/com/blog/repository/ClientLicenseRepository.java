package com.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blog.entity.ClientLicense;

@Repository
public interface ClientLicenseRepository extends JpaRepository<ClientLicense, Long> {

}
