package com.rayen.admin.request;

import org.springframework.http.ResponseEntity;

public interface GenericRequest {
    public void sanitise();
    public ResponseEntity<Object> process();
}