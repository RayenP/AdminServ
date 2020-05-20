package com.rayen.admin.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class GenericResponse {
    private String timestamp;
    private int status;
    private String path;
    private String message;
}