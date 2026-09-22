package com.servlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

public class Profile extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(false);

        if(session != null){
            String username = (String) session.getAttribute("username");
            String age = (String) session.getAttribute("age");
            ServletContext context = getServletContext();

            System.out.println("In profile Servlet process request ");
            context.setAttribute("username", "Ahmed Elshamy");
            req.setAttribute("username", username);
            req.setAttribute("age", age);
            req.getRequestDispatcher("profile.jsp")
                    .forward(req, resp);
        }else{
            resp.getWriter().println("<h1>please login first</h1>");
        }
    }
}
