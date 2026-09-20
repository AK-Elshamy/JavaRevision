package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("ahmed".equals(username) && "1234".equals(password)) {

            request.setAttribute("username", username);

            request.getRequestDispatcher("/profile")
                    .forward(request, response);

        } else {

            response.sendRedirect("login.html");
        }
    }
}