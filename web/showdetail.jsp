<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: think
  Date: 2016/10/12
  Time: 19:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--@ page language="java" import="java.util.*,java.sql.*" pageEncoding="GB2312"--%>
<%@ page import="org.DatebaseConn"%>
<center>
<table>
    <tr>
        <td>图书ID&nbsp&nbsp</td>
        <td>书名&nbsp&nbsp</td>
        <td>作者ID&nbsp&nbsp</td>
        <td>出版社&nbsp&nbsp</td>
        <td>出版日期&nbsp&nbsp</td>
        <td>价格&nbsp&nbsp</td>
    </tr>
    <s:iterator value="BOOK" status="st">
        <tr>
            <td><s:property value ="ISBN"/>&nbsp&nbsp</td>
            <td><s:property value ="Title"/>&nbsp&nbsp</td>
            <td><s:property value ="AuthorID"/>&nbsp&nbsp</td>
            <td><s:property value ="Publisher"/>&nbsp&nbsp</td>
            <td><s:property value ="PublishDate"/>&nbsp&nbsp</td>
            <td><s:property value ="Price"/>&nbsp&nbsp</td>
            <td><input type = "button" onclick="location.href = 'delete?isbn=${ISBN}'" value="删除"/></td>
            <td><input type = "button" onclick="location.href = 'updatebook.jsp'" value="更新"/></td>
        </tr>
    </s:iterator>
</table>
    <br/><br/>
    <table>
        <tr>
            <td>作者ID&nbsp&nbsp</td>
            <td>姓名&nbsp&nbsp</td>
            <td>年龄&nbsp&nbsp</td>
            <td>国籍&nbsp&nbsp</td>
        </tr>
        <s:iterator value="AUTHOR" status="st">
            <tr>
                <td><s:property value ="AuthorID"/>&nbsp&nbsp</td>
                <td><s:property value ="Name"/>&nbsp&nbsp</td>
                <td><s:property value ="Age"/>&nbsp&nbsp</td>
                <td><s:property value ="Country"/>&nbsp&nbsp</td>
            </tr>
        </s:iterator>
    </table>
    <s:a href="inputWords.jsp">返回</s:a>
</center>

