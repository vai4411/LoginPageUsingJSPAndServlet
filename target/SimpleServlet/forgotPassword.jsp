<%--
  Created by IntelliJ IDEA.
  User: Vaibhav
  Date: 6/7/2020
  Time: 7:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Forgot Password</title>
</head>
<body style="background-color: lightskyblue;">
<form action="ForgotPasswordServlet" method="post">
    <table align="Center"; style="background-color: lightskyblue; font-weight: bolder;">
        <tr>
            <td></td>
            <h2 align="Center"; style="color: darkblue; font-size: 60px; margin-top: 100px;">Forgot Password</h2>
            <td></td>
        </tr>
        <tr style="font-size: 30px; margin-left: 50px;">
            <td> UserName : </td>
            <td><input type="text" name="name" style="width: 350px; height: 30px;"></td>
        </tr>
        <tr style="font-size: 30px; margin-left: 50px;">
            <td> Email : </td>
            <td><input type="email" name="email" style="width: 350px; height: 30px; margin-top: 20px;"></td>
        </tr>
        <tr style="font-size: 30px;">
            <td><input type="submit" name="submit" value="Password" style="font-size: 25px; margin-left: 120px;"></td>
            <td><a href="register.jsp" style="margin-left: 150px;">Register</a> </td>
        </tr>
    </table>
</form>
</body>
</html>
