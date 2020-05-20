package com.rayen.admin.controller;

import com.rayen.admin.request.GetServerStatusRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerStatusController {
    @GetMapping("/status")
    public ResponseEntity<Object> getServerStatus(){
        return new GetServerStatusRequest().process();
    }
}