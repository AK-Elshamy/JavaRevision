package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class MyServlet implements Servlet {

    ServletConfig servletConfig;
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        this.servletConfig = servletConfig;
        System.out.println("I'm inside the init method");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String country = servletConfig.getInitParameter("country");
        String age = servletConfig.getInitParameter("Age");

        out.println("<h1 style='color:blue;'>Hello Ahmed</h1>");
        out.println("<p style='color:green;'>Age: " + age + "</p>");
        out.println("<p style='color:red;'>Country: " + country + "</p>");
        System.out.println("Service method ");

    }

    @Override
    public String getServletInfo() {
        return "my first servlet";
    }

    @Override
    public void destroy() {
        System.out.println("Destroy method");
    }

}
