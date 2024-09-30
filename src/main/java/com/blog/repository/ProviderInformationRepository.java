package com.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blog.entity.ProviderInformation;

@Repository
public interface ProviderInformationRepository extends JpaRepository<ProviderInformation, Long> {

}
