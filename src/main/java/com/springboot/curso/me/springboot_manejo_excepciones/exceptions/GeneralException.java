package com.springboot.curso.me.springboot_manejo_excepciones.exceptions;

import java.util.Date;

public class GeneralException {

    private String message;
    private String error;
    private int status;
    private Date date;


    

    public GeneralException() {
    }

    
    public GeneralException(String message, String error, int status, Date date) {
        this.message = message;
        this.error = error;
        this.status = status;
        this.date = date;
    }


    //getters and setters
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public String getError() {
        return error;
    }
    public void setError(String error) {
        this.error = error;
    }
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }

    

}
