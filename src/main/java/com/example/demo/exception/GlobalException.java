package com.example.demo.exception;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.demo.exception.ValidationException;
import org.springframework.http.HttpStatus;
@RestControllerAdvice
public class GlobalException{
    @ExpertHandler(ValidationException.class)
    public Response
    
}