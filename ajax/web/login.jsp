<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/28
  Time: 16:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery-3.0.0.min.js"></script>
    <script>
        $(function () {
            $(":button[name=login]").click(function () {
                $.ajax({
                    type:"POST",
                    url:"${pageContext.request.contextPath}/LoginServlet",
                    data:$("form").serialize(),
                    success:function (msg) {
                        if (msg === "ok"){
                            location.href = "${pageContext.request.contextPath}/index.jsp";
                        }else {
                            $("#error").text("错误");
                        }
                    },
                    error:function (xhr) {
                        alert(xhr.responseText);
                    }
                })
            })
        })
    </script>
</head>
<body>
<form>
    用户: <input type="text" name="username" >
    密码: <input type="password" name="pwd">
    <span id="error"></span>
    <input type="button" name="login" value="提交">
</form>

</body>
</html>
