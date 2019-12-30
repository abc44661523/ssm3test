<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery-3.0.0.min.js"></script>
    <script>
        $(function () {
            $(":button").click(function () {
                $.ajax({
                    type: "POST",
                    url: "${pageContext.request.contextPath}/ajax2",
                    dataType: "json",
                    data:"username=tom&pwd=123",
                    success: function (users) {
                        // $.each(msg,function (index, ele) {
                        //     alert(ele);
                        // });

                        alert(users.username + "," + users.pwd);

                        // $.each(users,function (index, ele) {
                        //     $("table").append("<tr><td>" + ele.username + "</td><td>" + ele.pwd + "</td></tr>")
                        // })
                    }
                })
            })
        })
    </script>
</head>
<body>
<input type="button" value="AJAX测试">
<table id="data" border="1">
    <tr><td>用户名</td><td>密码</td></tr>
</table>
</body>
</html>
