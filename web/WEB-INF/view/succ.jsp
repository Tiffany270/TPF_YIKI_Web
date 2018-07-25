<%--
  Created by IntelliJ IDEA.
  User: Tiffany270
  Date: 2018/7/21
  Time: 19:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>跳转页面</title>

    <c:forEach items="${all}" var="pers">
        ${pers.u_id}
        ${pers.u_name}
        ${pers.u_address}

    </c:forEach>

</head>
<body>
</body>
</html>
