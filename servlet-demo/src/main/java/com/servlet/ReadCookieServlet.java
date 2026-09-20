package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class ReadCookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookies[] = req.getCookies();
        for(var cookie : cookies){
            if("username".equals(cookie.getName())){
                resp.getWriter().println("<h1>Welcome %s 👋</h1>".formatted(cookie.getValue()));
            }
            break;
        }


    }
}
