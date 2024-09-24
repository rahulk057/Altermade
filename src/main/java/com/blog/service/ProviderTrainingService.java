package com.blog.service;

import org.springframework.stereotype.Service;

import com.blog.entity.ProviderTraining;
@Service
public interface ProviderTrainingService {

	ProviderTraining savepProviderTraining(ProviderTraining providerTraining);
    ProviderTraining updateProviderTraining(Long id, ProviderTraining providerTraining);

}
