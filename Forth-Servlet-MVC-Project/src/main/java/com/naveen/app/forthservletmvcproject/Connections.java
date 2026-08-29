package com.naveen.app.forthservletmvcproject;

import java.sql.DriverManager;
import java.sql.*;


public class Connections {

    public static Connection getConnection(){
        String url="jdbc:mysql://localhost:3306/ServletLearn";
        String user="root";
        String pwd="1234";
        Connection con=null;

        try {
          //  Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection(url,user,pwd);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
         return con;

    }

}
class testCon{
    public static void main(String[] args) {

          Connection con=Connections.getConnection();
          if(con==null){
              System.out.println("Connection unsuccess");
          }else {
              System.out.println("Connection Successfully");
          }

    }
}

