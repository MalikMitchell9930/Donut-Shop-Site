package com.inn.donut.dao;

import com.inn.donut.POJO.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface UserDao extends JpaRepository<User, Integer> {

    //Query to find by email id
    User findByEmailId(@Param("email") String email);
}
