package com.rayen.admin.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ServerExceptionController {

    @ExceptionHandler(value = ServerException.class)
    public ResponseEntity<Object> handleServerException(ServerException exception) {
        return new ResponseEntity<>(exception.getErrorMessage(), exception.getHttpStatus());
    }

    @ExceptionHandler(value = RuntimeException.class)
    public ResponseEntity<Object> handleRuntimeException(RuntimeException exception) {
        return new ResponseEntity<>(new ErrorMessage(false), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}