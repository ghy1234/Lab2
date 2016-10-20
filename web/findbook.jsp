<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: think
  Date: 2016/10/12
  Time: 18:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--@ page language="java" import="java.util.*,java.sql.*" pageEncoding="GB2312"--%>
<%@ page import="org.DatebaseConn"%>
<html>
<head>
    <title>作者检索</title>
</head>
<body>
    <center>
        <form action="findbook" method="post">
            作者：<input type="text" name="Name"/>
            <input type="submit" value="确定"/>
        </form>
        <s:a href="inputWords.jsp">返回</s:a>
    </center>
</body>
</html>
