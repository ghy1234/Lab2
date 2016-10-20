<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: think
  Date: 2016/10/12
  Time: 23:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<table>
    <tr>
        <td>作者ID&nbsp&nbsp</td>
        <td>姓名&nbsp&nbsp</td>
        <td>年龄&nbsp&nbsp</td>
        <td>国籍&nbsp&nbsp</td>
    </tr>
    <s:iterator value="allauthor" status="st">
        <tr>
            <td><s:property value ="AuthorID"/>&nbsp&nbsp</td>
            <td><s:property value ="Name"/>&nbsp&nbsp</td>
            <td><s:property value ="Age"/>&nbsp&nbsp</td>
            <td><s:property value ="Country"/>&nbsp&nbsp</td>
        </tr>
    </s:iterator>
</table>
<s:a href="inputWords.jsp">返回</s:a>
