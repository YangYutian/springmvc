<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 6/6/2018
  Time: 10:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>success.jsp</title>
</head>
<body>
    <h4>success.jsp</h4>
    Request: <%=request.getAttribute("time")%><br>
    Request: ${requestScope.names}<<br>
    Request User : ${requestScope.user}<br>
    Session User : ${sessionScope.user}<br>

</body>
</html>
