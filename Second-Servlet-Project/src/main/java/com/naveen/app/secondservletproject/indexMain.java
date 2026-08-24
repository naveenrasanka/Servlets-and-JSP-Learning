package com.naveen.app.secondservletproject;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/firstServlet")
public class indexMain extends HttpServlet {
    public void FirstServlet(){
        System.out.println("servlet obj is created internally");
    }
@Override
    public void doPost(HttpServletRequest request,
                          HttpServletResponse response)throws ServletException,IOException
    {
       String name= request.getParameter("name");
       String city=request.getParameter("City");

       PrintWriter writers= response.getWriter();
       writers.println("<html><head><title>SecondApp</title></head>");
       writers.println("<body bgcolor='cyan'><h1>Welcome to our Dynamic App</h1>");
       writers.println("<h1>Hello "+name);
       writers.println("I know you are from "+city);
       writers.println("</h1></body></html>");
       writers.close();
    }
}
