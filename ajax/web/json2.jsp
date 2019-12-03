<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/12/2
  Time: 10:37
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
                $.ajax({
                    type:"POST",
                    url:"${pageContext.request.contextPath}/JsonServlet",
                    dataType:'json',
                    success:function (users) {
                        //服务器端响应的数据是数组
                        //alert(arr)
                        //服务器端响应的数据是User对象
                        // alert(arr)
                        //服务器端响应的数据是List<User>对象
                        // alert(users[1].name);
                        $("#users tr").remove();
                        $.each(users,function (index, user) {
                            $("#users").append("<tr><td>" + user.id+ "</td><td>" + user.name + "</td><td>" + user.password + "</td></tr>")
                        })
                    }
                });
            });
        })
    </script>
</head>
<body>
<table border="1" id="users">

</table>

<input type="button" value="JSON测试">
</body>
</html>
