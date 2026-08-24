package com.naveen.app.thirdservletproject;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet("/RegisterFromServlet")
public class RegisterFromServlet extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Control in Servlet");

        String name= request.getParameter("name");
        String Email= request.getParameter("email");
        String password= request.getParameter("password");
        String city= request.getParameter("city");

        String url="jdbc:mysql://localhost:3306/ServletLearn";
        String user="root";
        String pwd="1234";
        String query="INSERT INTO users(uname,uemail,upassword,ucity)VALUES(?,?,?,?)";
        try {
            Connection con = DriverManager.getConnection(url,user,pwd);
            PreparedStatement ps=con.prepareStatement(query);
            ps.setString(1,name);
            ps.setString(2,Email);
            ps.setString(3,password);
            ps.setString(4,city);
            ps.executeUpdate();

            if(con !=null){
                System.out.println("Connection is Successfull");
            }


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        PrintWriter writer= response.getWriter();
           writer.println("<h1>Test</h1>");


    }
}
