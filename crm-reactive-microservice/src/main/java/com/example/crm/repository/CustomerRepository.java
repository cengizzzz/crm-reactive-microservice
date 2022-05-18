package com.example.crm.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.example.crm.document.CustomerDocument;

public interface CustomerRepository extends ReactiveMongoRepository<CustomerDocument, String> {
		
}
