<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: think
  Date: 2016/10/13
  Time: 10:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
    <form action="updatebook" method="post">
        图书ID:<input type="text" name="isbn">
        作者：<input type="text" name="name"/>
        出版社：<input type="text" name="publisher"/>
        出版日期：<input type="text" name="publishdate"/>
        价格：<input type="text" name="price"/>
        <input type="submit" value="确定"/>
    </form>
    <s:a href="inputWords.jsp">返回</s:a>
</body>
</html>
