<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: think
  Date: 2016/10/13
  Time: 14:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
作者不存在请添加！
<form action="addauthor" method="post">
    作者：<input type="text" name="name"/>
    年龄：<input type="text" name="age"/>
    国籍：<input type="text" name="country"/>
    <input type="submit" value="确定"/>
</form>
<s:a href="inputWords.jsp">返回</s:a>
</body>
</html>
