package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class WelcomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();

        out.println("""
            <!DOCTYPE html>
            <html lang="en">
              <head>
                <meta charset="UTF-8">
                <title>Contact Form</title>
                <style>
                  body {
                    font-family: Arial, sans-serif;
                    background-color: #f4f6f9;
                    display: flex;
                    justify-content: center;
                    align-items: center;
                    height: 100vh;
                    margin: 0;
                  }
                  .form-container {
                    background: #ffffff;
                    padding: 28px;
                    border-radius: 10px;
                    box-shadow: 0 4px 12px rgba(0, 0, 0, 0.08);
                    width: 320px;
                  }
                  h2 {
                    margin-top: 0;
                    margin-bottom: 20px;
                    color: #2c3e50;
                    text-align: center;
                  }
                  .form-group {
                    margin-bottom: 15px;
                  }
                  label {
                    display: block;
                    margin-bottom: 6px;
                    color: #333333;
                    font-size: 0.9rem;
                    font-weight: bold;
                  }
                  input[type="text"],
                  input[type="email"],
                  input[type="tel"] {
                    width: 100%;
                    padding: 10px;
                    border: 1px solid #ccc;
                    border-radius: 5px;
                    box-sizing: border-box;
                    font-size: 0.95rem;
                  }
                  input:focus {
                    outline: none;
                    border-color: #3498db;
                  }
                  button {
                    width: 100%;
                    padding: 10px;
                    background-color: #3498db;
                    color: white;
                    border: none;
                    border-radius: 5px;
                    font-size: 1rem;
                    cursor: pointer;
                    margin-top: 10px;
                  }
                  button:hover {
                    background-color: #2980b9;
                  }
                </style>
              </head>
              <body>
                <div class="form-container">
                  <h2>User Form</h2>
                  <form method="post" action="submit">
                    <div class="form-group">
                      <label for="name">Name</label>
                      <input type="text" id="name" name="name" required placeholder="Enter your name">
                    </div>
                    <div class="form-group">
                      <label for="email">Email</label>
                      <input type="email" id="email" name="email" required placeholder="Enter your email">
                    </div>
                    <div class="form-group">
                      <label for="phone">Phone</label>
                      <input type="tel" id="phone" name="phone" required placeholder="Enter your phone">
                    </div>
                    <button type="submit">Submit</button>
                  </form>
                </div>
              </body>
            </html>
            """);
    }
}
