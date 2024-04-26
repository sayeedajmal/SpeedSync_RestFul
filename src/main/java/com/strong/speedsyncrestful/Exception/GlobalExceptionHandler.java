package com.strong.speedsyncrestful.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(SpeedSyncException.class)
    
    public ResponseEntity<?> handleSpeedException(SpeedSyncException exception) {
        SpeedRes response = new SpeedRes();
        response.setMessage(exception.getLocalizedMessage());
        response.setStatus(HttpStatus.CONFLICT.value());
        response.setTimeStamp(System.currentTimeMillis());
        return new ResponseEntity<>(response, HttpStatus.CONFLICT);
    }
}