<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/10/29 0029
  Time: 18:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>注册页面</title>
</head>
<body>
<form action="registerUser" method="post">
    username:<input type="text" name="username">
    <br>
    password:<input type="password" name="password">
    <br>
    mobile：<input type="text" name="mobile">
    <br>
    email:<input type="text" name="email">
    <input type="submit" value="Submit">
</form>

${msg}
</body>
</html>
