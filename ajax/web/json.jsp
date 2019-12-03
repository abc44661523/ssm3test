<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/29
  Time: 15:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<script>
    var arr = ['JSP','ASP','PHP'];
    var str = JSON.stringify(arr);
    console.log("str=" + str);

    var str = "['JSP','ASP','PHP']";
    // var arr1 = JSON.parse(str);
    console.log(arr[0]);

    var obj = {
        name:"tom",
        age:20
    };
    var str = JSON.stringify(obj);
    console.log(obj)


</script>
</body>
</html>
