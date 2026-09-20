package com.servlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class ProfileServlet extends HttpServlet {

    @Override
    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();


        ServletContext context = getServletContext();

        String appName = context.getInitParameter("appName");

        String username = (String) context.getAttribute("currentUser");



        out.println("<html>");
        out.println("<body>");

        out.println("<h1>Hi " + username + " 👋</h1>");
        out.println("<h1>Welcome to " + appName + "</h1>");

        out.println("<p>This is your profile.</p>");

        // Include another servlet
        request.getRequestDispatcher("/footer")
                .include(request, response);

        out.println("</body>");
        out.println("</html>");
    }
}