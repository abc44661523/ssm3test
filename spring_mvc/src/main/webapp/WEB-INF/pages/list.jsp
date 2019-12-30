<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/12/26
  Time: 11:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>列表页面</h1>
${msg}<br>
${uuu.username}<br>
${db[0]}<br>

<c:forEach var="adb" items="${db}">
    ${adb},
</c:forEach> <br>

用户信息
${list[1].username},${list[1].pwd} <br>
<c:forEach items="${list}" var="user">
    ${user.username},${user.pwd} <br>
</c:forEach>
</body>
</html>
