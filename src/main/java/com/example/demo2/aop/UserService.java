package com.example.demo2.aop;

import org.springframework.stereotype.Service;

@Service
public class UserService {
public String getUserById(Integer id){
    System.out.println("get....");
    return "user";
}
public void deleteUserService(Integer id){
    System.out.println("delete....");
}
}
