package com.naveen.app.forthservletmvcproject;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

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

       if(rows==0){

       }else{
           
       }
    }

}
