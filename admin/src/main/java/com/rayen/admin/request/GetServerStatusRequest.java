package com.rayen.admin.request;

import com.rayen.admin.request.GenericRequest;
import com.rayen.admin.response.GetServerStatusResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class GetServerStatusRequest implements GenericRequest{

    public void sanitise(){}
    
    public ResponseEntity<Object> process(){
        return new ResponseEntity<>(new GetServerStatusResponse(), HttpStatus.OK);
    }
}