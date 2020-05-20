package com.rayen.admin.mongo.repository;

import com.rayen.admin.mongo.entity.ConfigE;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ConfigRepo extends MongoRepository<ConfigE, String>{
    
}