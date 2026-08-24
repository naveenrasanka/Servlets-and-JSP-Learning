package com.naveen.app.secondservletproject;

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

@WebServlet("/RequestDispatchTwo")
public class RequestDispatchTwo extends HttpServlet {
    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("control in second Servlet");
       HttpSession session= request.getSession(false);

       String name=(String) session.getAttribute("name");
       String city=(String) session.getAttribute("city");

        PrintWriter writer= response.getWriter();
        writer.println("<h1>Response From Second Servlet</h1>"+"<h1>"+ name + city +"</h1>");
        writer.close();

    }


}
