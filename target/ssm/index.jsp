<%--
  Created by IntelliJ IDEA.
  User: 李武第
  Date: 2020/1/16
  Time: 11:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="account/findAll">ceshi</a>

<h3>测试保存</h3>
<form action="/account/save" method="post">
    name:<input type="text" name="name"/>
    money:<input type="text" name="money"/>
    <input type="submit" value="submit">
</form>
</body>
</html>
