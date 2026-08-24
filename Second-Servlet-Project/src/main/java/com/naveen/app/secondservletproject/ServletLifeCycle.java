package com.naveen.app.secondservletproject;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ServletLife")
public class ServletLifeCycle extends HttpServlet {
    static {
        System.out.println("static Servlet is loaded....");
    }
    public ServletLifeCycle(){
        System.out.println("Servlet obj is created!!");
    }
     public void init(ServletConfig config)throws ServletException{
        
        //super.init(config);
       //  System.out.println("Servlet is initialized");

     }
     @Override
    public void service(HttpServletRequest request,
                        HttpServletResponse response)throws ServletException, IOException {
        System.out.println("Handle Request Response back");

//           PrintWriter writer= response.getWriter();
//           writer.println("hellow");

    }
    public void destroy(){

    }

}
