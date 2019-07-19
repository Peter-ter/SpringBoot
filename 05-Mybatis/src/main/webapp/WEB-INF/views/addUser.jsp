<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	 <form action="${pageContext.request.contextPath }/addUser" method="post">
	 用户名：<input type="text" name = "userName" /><br>
	 密码：<input type="text" name = "password" /><br>
	 年龄：<input type="text" name = "age" /><br>
	 <input type="submit" value="提交" />
	 </form>
</body>
</html>