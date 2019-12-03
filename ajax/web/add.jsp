<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/29
  Time: 11:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery-3.0.0.min.js"></script>
    <script>
        $(function () {
            $(":text[name=username]").blur(function () {
               $.ajax({
                   type:"POST",
                   url:"${pageContext.request.contextPath}/AddServlet",
                   data:"name="+$(this).val(),
                   success:function (msg) {
                       if (msg == "ok"){
                            $("#msg").text("用户名可用");
                       }else{
                           $("#msg").text("用户名不可用");
                       }
                   }
               })
            });
        })
    </script>
</head>
<body>

<form>
    用户名：<input type="text" name="username"><span id="msg"></span>
    <input type="button" value="提交">
</form>

</body>
</html>
