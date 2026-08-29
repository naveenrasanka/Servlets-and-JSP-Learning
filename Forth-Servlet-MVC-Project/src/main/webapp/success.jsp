<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 29/08/2026
  Time: 22:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>success</title>
</head>
<body>
<h1>Registration Successfull</h1>
<%
 String name=(String)session.getAttribute("name");
String city=(String) session.getAttribute("city");

%>

<h1>Your name is <%= name %></h1>
<h1>Your city is <%= city%></h1>

</body>
</html>
