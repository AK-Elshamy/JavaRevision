package com.servlet;
import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

public class MyFilter implements Filter {

    @Override
    public void doFilter(
            ServletRequest request,
            ServletResponse response,
            FilterChain chain
    ) throws IOException, ServletException {

        var HttpRequest = (HttpServletRequest)request;
        var HttpResponse = (HttpServletResponse)response;
        HttpSession session = HttpRequest.getSession(false);
        if(session != null){
            chain.doFilter(request, response);
        }else{
            HttpResponse.sendRedirect("login.html");
        }
    }
}