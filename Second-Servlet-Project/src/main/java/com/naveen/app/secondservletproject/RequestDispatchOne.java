package com.naveen.app.secondservletproject;


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/RequestDispatchOne")
public class RequestDispatchOne  extends HttpServlet {

    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("Control in First Servlet");

        String name= request.getParameter("name");
        String city=request.getParameter("City");

        RequestDispatcher reqObj= request.getRequestDispatcher("/RequestDispatchTwo");  //pass from another servlet

        HttpSession session= request.getSession();
        session.setAttribute("name",name);
        session.setAttribute("city",city);  //after creating session we can access the data in anywhere
        session.setMaxInactiveInterval(10000);  //we can set time data  expire time

        reqObj.forward(request,response);
        //reqObj.include(request,response);  //user forward or include

       PrintWriter writer= response.getWriter();
       writer.println("<h1>Response from Servlet One</h1>");
        writer.close();
        System.out.println("Control again in first Servlet");
    }

}
