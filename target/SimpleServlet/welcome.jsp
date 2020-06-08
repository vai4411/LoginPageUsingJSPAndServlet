<%--
  Created by IntelliJ IDEA.
  User: Vaibhav
  Date: 6/5/2020
  Time: 10:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<div class="loginBox">
<form action="login.jsp" method="post">
    <h1>Welcome...</h1>
    <h3>Welcome,<%=  request.getParameter("name")%><br><br>
    Your registration id is <%= request.getAttribute("id")%><br><br>
    Your entry date and time is <%= request.getAttribute("date")%><br><br>
    Your email address is <%= request.getAttribute("email")%><br><br>
    </h3>
    <input type="submit" name="submit" value="Login">
</form>
</div>
</body>
</html>
