package com.servlet;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class SecondServlet extends GenericServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("This is servlet using GenericServlet");
        res.setContentType("text/html");
        PrintWriter out= res.getWriter();
        out.println("<h1>This is my second servlet using GenericServlet</h1>");
    }
}
