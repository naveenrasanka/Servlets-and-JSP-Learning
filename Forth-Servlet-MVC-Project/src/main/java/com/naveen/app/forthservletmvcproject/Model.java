package com.naveen.app.forthservletmvcproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Model
{
  private   String name;
  private   String password;
  private   String email;
  private   String city;
  private int row;
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public  int register(){
        String Query="INSERT INTO users(uname,uemail,upassword,ucity)VALUES(?,?,?,?)";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn= Connections.getConnection();
            PreparedStatement ps= conn.prepareStatement(Query);

            ps.setString(1,name);
            ps.setString(2,email);
            ps.setString(3,password);
            ps.setString(4,city);

       row=ps.executeUpdate();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return row;
    }



}
