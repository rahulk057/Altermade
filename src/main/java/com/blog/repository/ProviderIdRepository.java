package com.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blog.entity.ProviderId;

@Repository
public interface ProviderIdRepository extends JpaRepository<ProviderId, Long> {

}
