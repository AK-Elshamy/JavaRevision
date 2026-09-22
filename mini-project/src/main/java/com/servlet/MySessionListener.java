package com.servlet;

import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

public class MySessionListener implements HttpSessionListener {

    private static int activeSessions = 0;

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        activeSessions++;

        System.out.println(
                "Active Sessions: " + activeSessions
        );
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        activeSessions--;

        System.out.println(
                "Active Sessions: " + activeSessions
        );
    }
}