package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

public class Login extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String age = req.getParameter("age");

        if ("Ahmed".equals(username) && "12345".equals(password)){
            HttpSession session = req.getSession();
            session.setAttribute("username", username);
            session.setAttribute("age", age);

            resp.sendRedirect("profile");
        }else{
            resp.sendRedirect("login.html");
        }
    }
}
