package com.example.demo2.web;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyListener implements ServletRequestListener {
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("MyListener>>>requestDestroy");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
            System.out.println("MyListener>>>>requestInitialized");
    }
}
