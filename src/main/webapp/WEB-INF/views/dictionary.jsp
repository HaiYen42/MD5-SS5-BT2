<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 25/05/2023
  Time: 11:13 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div style="text-align: center">
    <h1>Dictionary</h1>
    <form method="get" action="result">
        <div>
            <input name=word>
            <button type="submit">Search</button>
        </div>
    </form>
    <div>
        <h2>Result</h2>
        <c:forEach items='${value}' var="ctm">
            <p> ${ctm} </p>
        </c:forEach>
    </div>
</div>
</body>
</html>
