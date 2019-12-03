<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/29
  Time: 9:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery-3.0.0.min.js"></script>
    <script>
        $(function () {
            $("select[name=omit]").change = function () {
                $.ajax({
                    type:"POST",
                    url:"${pageContext.request.contextPath}/TwoServlet",
                    data:"omit="+$("select[name=omit]").val(),
                    success:function (msg) {
                        var arr = msg.split(";");
                        $("select[name=city]").empty();
                        $.each(arr,function (index, ele) {
                            $("select[name=city]").append("<option>" + ele + "</option>")
                        })
                    }
                })
            }
        })
    </script>
</head>
<body>
<select name="omit">
    <option value="0">江苏</option>
    <option value="1">上海</option>
    <option value="2">山东</option>
    <option value="3">山西</option>
</select>

<select name="city">
    <option>苏州市</option>
    <option>无锡市</option>
    <option>南京市</option>
    <option>徐州市</option>
</select>
</body>
</html>
