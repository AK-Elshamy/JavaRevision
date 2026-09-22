package com.servlet;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;

public class MyListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("START");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("STOP");
    }
}