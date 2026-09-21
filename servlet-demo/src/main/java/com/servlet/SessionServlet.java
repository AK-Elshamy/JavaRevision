package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

public class SessionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();

        if (session.getAttribute("username") == null) {

            session.setAttribute("username", "ahmed");

            resp.getWriter().println("Session created");

        } else {

            resp.getWriter().println(
                    "Welcome " + session.getAttribute("username")
            );

        }




    }
}
