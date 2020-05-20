package com.rayen.admin.mongo;

import java.util.List;

import com.rayen.admin.mongo.entity.ConfigE;
import com.rayen.admin.mongo.repository.ConfigRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MongoDevTest {
    @Autowired
    private ConfigRepo repo;

    public List<ConfigE> processDevTest(){
        //Clear collection
        repo.deleteAll();

        //Add new documents
        repo.save(new ConfigE("testName", "testType", "testValue"));

        //Fetch and return all documentsß
        return repo.findAll();
    }
}