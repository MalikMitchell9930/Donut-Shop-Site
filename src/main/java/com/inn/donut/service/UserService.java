package com.inn.donut.service;

import org.springframework.http.ResponseEntity;

import java.util.Map;

public interface UserService {

    ResponseEntity<String> signup(Map<String, String> requestMap);
}
