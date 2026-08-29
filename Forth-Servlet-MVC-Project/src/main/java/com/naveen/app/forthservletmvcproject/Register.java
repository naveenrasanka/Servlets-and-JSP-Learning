package com.naveen.app.forthservletmvcproject;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/Register")
public class Register extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

       String name= request.getParameter("name");
       String email= request.getParameter("email");
       String password= request.getParameter("password");
       String city= request.getParameter("city");

        Model mod=new Model();

        mod.setName(name);
        mod.setEmail(email);
        mod.setPassword(password);
        mod.setCity(city);

       int rows= mod.register();
       HttpSession sess= request.getSession();
       sess.setAttribute("name",name);
       sess.setAttribute("email",email);
       sess.setAttribute("password",password);
       sess.setAttribute("city",city);
       if(rows==0){
           response.sendRedirect("/Forth_Servlet_MVC_Project_war_exploded/fail.jsp");
       }else{

           response.sendRedirect("/Forth_Servlet_MVC_Project_war_exploded/success.jsp");
       }
    }

}
