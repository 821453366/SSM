<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>查询用户信息</title>
</head>
<body>
<table width="100%" border=1>
    <tr><td></td><td><h1>所有学生信息</h1></td><td></td></tr>
    <tr>
        <td>id</td>
        <td>name</td>
        <td>password</td>
    </tr>
    <c:forEach items="${userList }" var="user">
        <tr>
            <td>${user.id }</td>
            <td>${user.userName }</td>
            <td>${user.passWord }</td>
        </tr>
    </c:forEach>

</table><h1></h1>
</body>

</html>