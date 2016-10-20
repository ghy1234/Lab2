<%--
  Created by IntelliJ IDEA.
  User: think
  Date: 2016/10/9
  Time: 20:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>A simple Struts 2</title>
    <link rel="stylesheet" type="text/css" href="Style.css">
</head>
<body>
    <center>
        <h1>图书管理系统</h1>
        <br/><hr/>
        <table>
        <form name="myForm" action="allbook.action" method="post">
            <tr><td><input type = "submit" name="mySubmit" value="显示书单"/></td></tr>
        </form>
        <form name="myForm1" action="allauthor.action" method="post">
            <tr><td><input type = "submit" name="mySubmit1" value="显示作者"/></td></tr>
        </form>
        <tr><td><input type = "button" onclick="location.href = 'findbook.jsp'" value="作者检索"/></td></tr>
        <tr><td><input type = "button" onclick="location.href = 'addbook.jsp'" value="添加图书"/></td></tr>
    </table>
    </center>
</body>
</html>
