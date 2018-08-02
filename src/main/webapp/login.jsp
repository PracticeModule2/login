<%--
  Created by IntelliJ IDEA.
  User: hue
  Date: 8/1/18
  Time: 9:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
<%
    Cookie[] listCookie = request.getCookies();
    String username = "";
    String password = "";
    int count = 0;
    if(listCookie != null){
        while(count < listCookie.length){
            if(listCookie[count].getName().equals("user")){
                username = listCookie[count].getValue();
            }
            if(listCookie[count].getName().equals("pass")){
                password = listCookie[count].getValue();
            }
            count++;
        }
    }
%>
${error}
<h1>Login</h1>
<form action="/login" method="POST">
    <table>
        <tr>
            <td>Username</td>
            <td><input type="text" name="user" placeholder="Enter username" value=""/></td>
        </tr>
        <tr>
            <td>Password</td>
            <td><input type="password" name="password" placeholder="Enter password" value=""/></td>
        </tr>
        <tr>
            <td><input type="checkbox" name="chkRemember" value="ON"/>Remember to me</td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Login"/></td>
        </tr>
    </table>
</form>
</body>
</body>
</html>
