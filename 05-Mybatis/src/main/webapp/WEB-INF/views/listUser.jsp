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
			<td><a href="${pageContext.request.contextPath }/toAdd">添加</a></td>
		</tr>
		<tr align='center'>
			<td>ID</td>
			<td>NAME</td>
			<td>AGE</td>
			<td>OPERATION</td>
		</tr>
		<c:forEach items="${listUser}" var="s" varStatus="st">
			<tr align='center'>
				<td>${s.id}</td>
				<td>${s.userName}</td>
				<td>${s.age}</td>
				<td>
					<a href="${pageContext.request.contextPath }/delectById?id=${s.id }">删除</a>
					<a href="${pageContext.request.contextPath }/toUpdate?id=${s.id }">修改</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>