package com.inn.donut.restimpl;

import com.inn.donut.constants.DonutConstants;
import com.inn.donut.rest.UserRest;
import com.inn.donut.service.UserService;
import com.inn.donut.utils.DonutUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserRestImpl implements UserRest {

    @Autowired
    UserService userService;

    @Override
    public ResponseEntity<String> signUp(Map<String, String> requestMap) {
        try{
            return userService.signup(requestMap);

        }catch (Exception ex){
            ex.printStackTrace();
        }
        return DonutUtils.getResponseEntity(DonutConstants.SOMETHING_WENT_WRONG, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
