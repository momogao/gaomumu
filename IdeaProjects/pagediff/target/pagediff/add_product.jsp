<%--
  Created by IntelliJ IDEA.
  User: Gaolong
  Date: 2019/11/5
  Time: 23:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD//XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="Addservlet" method="post">
    <p>名字：<input type="text" name="name"/></p>
    <p>价格：<input type="text" name="price"/></p>
    <p>数量：<input type="text" name="num"/></p>
    <p>单位：<input type="text" name="unit"/></p>
    <input type="submit" name="添加"/>
</form>
</body>
</html>
