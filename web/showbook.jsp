<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: think
  Date: 2016/10/12
  Time: 17:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--@ page language="java" import="java.util.*,java.sql.*" pageEncoding="GB2312"--%>
<%@ page import="org.DatebaseConn"%>
<html>
<head>
    <title>作者作品</title>
</head>
<body>
<center>
    <tr><s:property value = "Name"/>:</tr>
    <table>
    <s:iterator value="BOOK" status="st">
        <tr>
            <td>
                <s:property value ="Title"/>
                <input type = "button" onclick="location.href = 'finddetail?title=${Title}'" value="详情"/>
            </td>
        </tr>
    </s:iterator>

    </table>
    <s:a href="inputWords.jsp">返回</s:a>
</center>
</body>
</html>
