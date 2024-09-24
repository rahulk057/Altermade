package com.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blog.entity.ProviderTraining;

@Repository
public interface ProviderTrainingRepository extends JpaRepository<ProviderTraining, Long> {

}
