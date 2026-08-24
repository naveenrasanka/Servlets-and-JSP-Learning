package com.naveen.app.secondservletproject;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {

   @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
           String name= request.getParameter("name");
           String city= request.getParameter("City");
       System.out.println("Name "+name+" City "+city);
//        System.out.println("name and city is "+ name+ " "+ city);
//        PrintWriter writer= response.getWriter();
//        writer.println("I know you "+ name +" from " + city);

       response.sendRedirect("/Second_Servlet_Project_war_exploded/SecondOutput.jsp");

   }


}
