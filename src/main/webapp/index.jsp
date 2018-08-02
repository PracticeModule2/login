<%--
  Created by IntelliJ IDEA.
  User: hue
  Date: 8/1/18
  Time: 9:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>index.jsp</title>
  </head>
  <body>
  <h1>Home</h1>
  <%
    String user = (String) session.getAttribute("user");
    if (user != null) {%>
  Welcome: <%=user%>
  <a href="/logout?islogout=ok">Logout</a>
  <%}%>
  </body>
</html>
