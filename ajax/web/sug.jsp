<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/28
  Time: 15:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery-3.0.0.min.js"></script>
    <script>
        $(function () {
            $(":text").keyup(function () {
                $.ajax({
                    type:"POST",
                    url:"${pageContext.request.contextPath}/SugServlet",
                    data:"username=" + $(this).val(),
                    success:function (data) {
                        var arr = data.split(";");
                        $("select option").remove();
                        $.each(arr,function (index,ele) {
                            $("select").append("<option>" + ele + "</option>");
                        })
                    }
                })
            });
        })
    </script>
</head>
<body>
<input type="text"> <select><option></option></select>
</body>
</html>
