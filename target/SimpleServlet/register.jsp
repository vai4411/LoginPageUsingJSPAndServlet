<%--
  Created by IntelliJ IDEA.
  User: Vaibhav
  Date: 6/4/2020
  Time: 4:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration Page</title>
</head>
<body style="background-color: lightskyblue;">
    <form action="register" method="post">
    <table align="Center"; style="background-color: lightskyblue; font-weight: bolder;">
        <tr>
            <td></td>
            <h2 align="Center"; style="color: darkblue; font-size: 60px; margin-top: 100px;">Registration Page</h2>
            <td></td>
            </tr>
            <tr style="font-size: 30px; margin-left: 50px;">
                <td> UserName : </td>
                <td><input type="text" name="name" style="width: 350px; height: 30px;"></td>
            </tr>
            <tr style="font-size: 30px; margin-left: 50px;">
                <td> Password : </td>
                <td><input type="password" name="password" style="width: 350px; height: 30px; margin-top: 20px;"></td>
            </tr>
            <tr style="font-size: 30px; margin-left: 50px;">
                <td> Confirm Password : </td>
                <td><input type="password" name="confirmPassword" style="width: 350px; height: 30px; margin-top: 20px;"></td>
            </tr>
            <tr style="font-size: 30px; margin-left: 50px;">
                <td> Email : </td>
                <td><input type="email" name="email" style="width: 350px; height: 30px; margin-top: 20px;"></td>
            </tr>
            <tr style="font-size: 30px;">
                <td><input type="submit" name="submit" value="Register" style="font-size: 25px; margin-left: 120px;"></td>
                <td><a href="login.jsp" style="margin-left: 150px;">Login</a> </td>
                <td></td>
            </tr>
        </table>
    </form>
</body>
</html>
