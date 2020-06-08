<%--
  Created by IntelliJ IDEA.
  User: Vaibhav
  Date: 6/4/2020
  Time: 3:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body style="background-color: lightskyblue;">
    <form action="LoginServlet" method="post">
        <table align="Center"; style="background-color: lightskyblue; font-weight: bolder; margin-top: 100px;">
            <tr>
                <td></td>
                <td><h1 style="color: darkblue; font-size: 60px;">Login Page</h1></td>
                <td></td>
                <td></td>
            </tr>
            <tr style="font-size: 30px;">
                <td> UserName : </td>
                <td><input type="text" name="name" style="width: 350px; height: 30px;"></td>
            <tr></tr>
            </tr>
        <tr></tr>
        <tr></tr>
        <tr></tr>
            <tr style="font-size: 30px;">
                <td > Password : </td>
                <td><input type="password" name="password" style="width: 350px; height: 30px; margin-top: 10px;"></td>
            <tr></tr>
            <tr></tr>
            </tr>
            <tr></tr>
            <tr style="font-size: 30px;">
                <td><input type="submit" name="submit" value="Login" style="font-size: 25px; "></td>
                    <td><a href="register.jsp" style="margin-left: 20px;">Register</a>
                        <a href="forgotPassword.jsp" style="margin-left: 60px;">Forgot Password</a></td>
            </tr>
        </table>
    </form>
</body>
</html>
