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
</head>
<body style="color: darkblue; background-color: lightskyblue; font-size: 30px;">
    <form method="post" action="login.jsp">
        <h1 align="Center";>Hello!!!</h1>
        <h3 align="Center";><br>
            Welcome,<%=  request.getParameter("name")%><br><br>
            Your registration id is <%= request.getAttribute("id")%><br><br>
            Your entry date and time is <%= request.getAttribute("date")%><br><br>
            Your email address is <%= request.getAttribute("email")%><br><br>
            <input type="submit" name="submit" value="Logout" style="font-size: 25px; margin-top: 30px;">
        </h3>
    </form>
</body>
</html>
