<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/28
  Time: 13:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery-3.0.0.min.js"></script>
    <script>
        $(function () {
            $(":button").click(function () {
                alert("ok");
                $.ajax({
                    type:"GET",
                    data:"id=110&name=paul",
                    url:"${pageContext.request.contextPath}/ajax",
                    success:function (msg) {
                        alert(msg);
                    }
                });
            });

        });
    </script>
</head>
<body>
<input type="button" value="测试">
</body>
</html>
