package com.example.demo2.controller;

import com.example.demo2.aop.UserService;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/getuserById")
    public String getUserById(Integer id){
        return userService.getUserById(id);
    }
    @GetMapping("/deleteUserById")
    public void deleteUserById(Integer id){
        userService.deleteUserService(id);
    }
}
