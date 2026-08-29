
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP Web Application </title>
</head>
<body>
<h1>JSP Web App to generate Dynamic</h1>
<%@ page import="java.util.Date"

%>
<%!

    int age=18;

%>
<%
    Date date= new Date();

    String name= request.getParameter("name");
    String city= request.getParameter("city");

    out.println(date);
    out.println("Hello "+name);

%>
<h1>Hello This is Test 111</h1>
<h1>Your date is My <%= date %></h1>
<h2>Hello your name is <%= name %></h2>
<h2>Hello I know you are from <%= city %></h2>
</body>
</html>
