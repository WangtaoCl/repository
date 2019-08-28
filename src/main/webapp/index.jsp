<%--
  Created by IntelliJ IDEA.
  User: v-tao.wang
  Date: 2019-07-31
  Time: 09:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <p>hello word!</p>
    <form action="uploadServlet" method="post" enctype="multipart/form-data">
        <input type="file" name="file" size="50">
        <br/>
        <input type="submit" value="上传">
    </form>
  <%--  <div>
        <%
            Cookie[] cookies = request.getCookies();
    for (int i = 0; i < cookies.length; i++) {
        Cookie cookie = cookies[i];
        out.print(cookie.getValue());

    }  %>
    </div>--%>

</head>
<body>

</body>
</html>
