<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<table align='center' border='1' cellspacing='0'>
    <tr>
        <td>id</td>
        <td>name</td>
    </tr>
    <c:forEach items="${listUser}" var="s" varStatus="st">
        <tr>
            <td>${s.id}</td>
            <td>${s.userName}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>