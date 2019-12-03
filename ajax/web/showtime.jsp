<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/28
  Time: 11:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script>
        function show() {
            //发送请求，服务器返回系统的当前时间，将这个时间放在span里
            var xhr = new XMLHttpRequest();
            xhr.onreadystatechange = function () {
                //获得服务端相应的系统时间
                if (xhr.readyState == 4){
                    alert(xhr.responseText);
                    document.getElementById("time").innerText = xhr.responseText;
                }
            };
            xhr.open("GET","${pageContext.request.contextPath}/showTimeServlet?id="+Math.random(),true);
            xhr.send(null);
        }
    </script>
</head>
<body>
时间:<input type="text" onkeyup="show()"> <span id="time"></span>
</body>
</html>
