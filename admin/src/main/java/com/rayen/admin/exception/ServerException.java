package com.rayen.admin.exception;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ServerException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    private ErrorMessage errorMessage;
    private HttpStatus httpStatus;

    public ServerException(){
        this.errorMessage = new ErrorMessage(true);
        this.httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
    }
}