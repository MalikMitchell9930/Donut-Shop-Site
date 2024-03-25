package com.inn.donut.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class DonutUtils {

    private DonutUtils(){

    }

    public static ResponseEntity<String> getResponseEntity(String responseMessage, HttpStatus httpStatus){
        return new ResponseEntity<String>("{\"message\":\""+responseMessage+"\"}", httpStatus);
    }
}
