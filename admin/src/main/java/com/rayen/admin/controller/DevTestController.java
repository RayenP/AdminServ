package com.rayen.admin.controller;

import com.rayen.admin.exception.ServerException;
import com.rayen.admin.mongo.MongoDevTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevTestController {

    Logger logger = LoggerFactory.getLogger(DevTestController.class);

    @Autowired
    private MongoDevTest mongoDevTest;

    @GetMapping("/exception")
    public ResponseEntity<Object> testServerException(){
        throw new ServerException();
    }

    @GetMapping("/unknown")
    public ResponseEntity<Object> testUnknownException(){
        int num = 5/0;
        return new ResponseEntity<>("test" + num, HttpStatus.OK);
    }


    @GetMapping("/logger")
    public ResponseEntity<Object> testLogger(){
        logger.info("Logger info is working!!!");
        logger.warn("Logger warn is working!!!");
        logger.error("Logger error is working!!!");
        return new ResponseEntity<>("Check logsp...", HttpStatus.OK);
    }

    @GetMapping("/db")
    public ResponseEntity<Object> testDb(){
        return new ResponseEntity<>(mongoDevTest.processDevTest(), HttpStatus.OK);
    }
}