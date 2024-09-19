package com.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blog.entity.ProviderAttestation;

@Repository
public interface ProviderAttestationRepository extends JpaRepository<ProviderAttestation, Long>{

}
