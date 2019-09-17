<%--
  Created by IntelliJ IDEA.
  User: 小小一
  Date: 2019/9/17
  Time: 15:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>首页</title>
  </head>
  <body>
  首页
 <h3>欢迎你:${pageContext.request.getAttribute("username")}</h3>
  <h3>你的密码是:${pageContext.request.getAttribute("password")}</h3>

  <h3>这里是response跳转的用户名:
  <%=session.getAttribute("username")%></h3>
  <a href="login.html" target="_blank">点击返回到登录页面</a>
  </body>
</html>
