package com.servlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class FooterServlet extends HttpServlet {

    @Override
    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws ServletException, IOException {


        ServletContext context = getServletContext();
        context.removeAttribute("message");
        String message = (String) context.getAttribute("message");

        response.getWriter().println("""
                <h3>%s</h3>
                <hr>
                <p>© 2026 My Servlet App</p>
                """.formatted(message));


    }
}