package com.servlet;

import jakarta.servlet.*;

import java.io.DataInput;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class FirstServlet1 implements Servlet {

    ServletConfig config ;

    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config = config;

        System.out.println("Server Starting Creating Object .....");

    }

    @Override
    public ServletConfig getServletConfig() {
        return this.config;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("Servicing....");
        //set the content type of the response
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h1>This is my output from Servlet Method:</h1>");
        out.println("<h1>Today's date is :"+ new Date().toString()+"</h1>");

    }

    @Override
    public String getServletInfo() {
        return "This is made by Rati Jindal";
    }

    @Override
    public void destroy() {

        System.out.println("Destroying the server object.....");

    }
}
