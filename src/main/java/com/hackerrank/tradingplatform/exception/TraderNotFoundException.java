package com.hackerrank.tradingplatform.exception;

import org.springframework.http.HttpStatus;  
import org.springframework.web.bind.annotation.ResponseStatus;  

@ResponseStatus(HttpStatus.NOT_FOUND)  
public class TraderNotFoundException extends RuntimeException{

    public TraderNotFoundException(String message)   
    {  
    super(message);  
    }  
}
