package com.springboot.curso.me.springboot_manejo_excepciones.controllers;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpClientErrorException.NotFound;
import org.springframework.web.servlet.NoHandlerFoundException;

import com.springboot.curso.me.springboot_manejo_excepciones.exceptions.GeneralException;

@RestControllerAdvice
public class HandlerExceptionController {



    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity <GeneralException> exceptionArithmetic(ArithmeticException exception){

        GeneralException generalException = new GeneralException();
        generalException.setDate(new Date());
        generalException.setMessage(exception.getMessage());
        generalException.setError("Division por cero");
        generalException.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());

        return ResponseEntity.internalServerError().body(generalException);

    }

    @ExceptionHandler(NoHandlerFoundException.class)
    public ResponseEntity <GeneralException> notFoundException(NoHandlerFoundException exception){

        GeneralException generalException = new GeneralException(exception.getMessage(),"No se encontró el API", HttpStatus.NOT_FOUND.value(), new Date());
        
        return ResponseEntity.status(HttpStatus.NOT_FOUND.value()).body(generalException);
    }

    @ExceptionHandler(NumberFormatException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Map <String,Object> notFoundException (NumberFormatException exception){
        
        Map <String,Object> error = new HashMap();
        error.put("date", new Date());
        error.put("message", exception.getMessage());
        error.put("error", "Valor númerico invalido");
        error.put("status", HttpStatus.INTERNAL_SERVER_ERROR.value());

        return error;


    }

    @ExceptionHandler({NullPointerException.class,HttpMessageNotWritableException.class})
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Map <String,Object> userNotFoundException (NullPointerException exception){
        
        Map <String,Object> error = new HashMap();
        error.put("date", new Date());
        error.put("message", exception.getMessage());
        error.put("error", "El ususario no existe");
        error.put("status", HttpStatus.INTERNAL_SERVER_ERROR.value());

        return error;


    }

}
