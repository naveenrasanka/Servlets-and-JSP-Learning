package com.naveen.app.thirdservletproject;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

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
           PrintWriter writer1= response.getWriter();
        String url="jdbc:mysql://localhost:3306/ServletLearn";
        String user="root";
        String pwd="1234";
        String query="INSERT INTO users(uname,uemail,upassword,ucity)VALUES(?,?,?,?)";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //important
            Connection con = DriverManager.getConnection(url,user,pwd);
            if(con !=null){

                System.out.println("Connection is Successfull");
            }
            PreparedStatement ps=con.prepareStatement(query);
            ps.setString(1,name);
            ps.setString(2,Email);
            ps.setString(3,password);
            ps.setString(4,city);
            int rowsAffected=ps.executeUpdate();

            PrintWriter writer= response.getWriter();
            if(rowsAffected!=0){
                writer.println("<h1>Data Insert Successfully</h1>");
            }
            ps.close();
            writer.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }catch (ClassNotFoundException m){

            System.out.println(m.getMessage());
        }


        //learning JSP part

        HttpSession session= request.getSession();
        session.setAttribute("name",name);
        session.setAttribute("city",city);
        session.setMaxInactiveInterval(10000);

    }
}
