package com.blog.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.blog.entity.Client;
import com.blog.entity.ProviderTraining;
@Service
public interface ProviderTrainingService {

	ProviderTraining savepProviderTraining(ProviderTraining providerTraining);
    ProviderTraining updateProviderTraining(Long id, ProviderTraining providerTraining);
    ProviderTraining getProviderTrainingById(Long providerTrainingId);  // New method to get a client by ID
    List<ProviderTraining> getAllProviderTraining();



}
