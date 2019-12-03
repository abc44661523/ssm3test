<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/28
  Time: 9:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<script>
    function test() {
        alert("ok");
        //1.创建XMLHttpRequest对象
        var xhr = new XMLHttpRequest();
        //2.注册onreadystatechange时间
        xhr.onreadystatechange = function () {
            if (xhr.readyState ==4){
                // alert(xhr.readyState);
                console.log("相应数据：" + xhr.responseText);
            }
        };
        //3.发送请求,open,send
        xhr.open("GET","${pageContext.request.contextPath}/ajax?id=100",true);
        xhr.send(null);

        console.log("======end!!");
    }
</script>
<body>
<h>Hello</h>
<input type="button" value="测试" onclick="test()">
</body>
</html>
