<%--
  Created by IntelliJ IDEA.
  User: mixia
  Date: 2021/12/5
  Time: 20:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <titlex>小老鼠了</titlex>
  </head>
  <body>
  <a href="${pageContext.request.contextPath}/interceptor">拦截器测试</a>
  <%--登录--%>
  <a href="${pageContext.request.contextPath}/user/jumplogin">登录</a>
  <a href="${pageContext.request.contextPath}/user/jumpSuccess">成功页面</a>

  <form action="/upload" enctype="multipart/form-data" method="post">
    <input type="file" name="file"/>
    <input type="submit" value="upload">
  </form>

  <a href="/download">点击下载</a>
  </body>
</html>
