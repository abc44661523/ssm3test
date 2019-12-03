<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/28
  Time: 14:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery-3.0.0.min.js"></script>
    <script>
        $(function () {
            <%--$(":button").click(function () {--%>
            <%--    // alert("ok");--%>
            <%--    $.ajax({--%>
            <%--        type:"GET",--%>
            <%--        url:"${pageContext.request.contextPath}/showTimeServlet?id" + Math.random(),--%>
            <%--        success:function (msg) {--%>
            <%--            alert(msg);--%>
            <%--        }--%>
            <%--    });--%>
            <%--});--%>
            $(":text").keyup(function () {
               $.ajax({
                   type:"GET",
                   url:"${pageContext.request.contextPath}/showTimeServlet",
                   success:function (time) {
                        $("#time").text(time);
                   }
               })
            });
        });
    </script>
</head>
<body>
时间:<input type="button" value="测试">
时间:<input type="text"><span id="time"></span>
</body>
</html>
