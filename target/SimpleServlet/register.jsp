<%--
  Created by IntelliJ IDEA.
  User: Vaibhav
  Date: 6/8/2020
  Time: 7:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Form</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<div class="loginBox">
    <h1>Register Here</h1>
    <form action="RegisterServlet" method="post">
        <p>Username</p>
        <input type="text" name="name" placeholder="Enter Username">
        <p>Password</p>
        <input type="password" name="password" placeholder="Enter Password">
        <p>Confirm Password</p>
        <input type="password" name="confirmPassword" placeholder="Enter Password">
        <p>Email Address</p>
        <input type="email" name="email" placeholder="Enter Email">
        <input type="submit" name="submit" value="Register">
    </form>
    <form action="login.jsp" method="post">
        <input type="submit" name="submit" value="Login">
    </form>
</div>
</body>
</html>
