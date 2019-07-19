<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/update" method="post">
		<table align='center' border='1' cellspacing='0'>
			
			<tr>
				<td>ID:</td>
				<td><input type="type" value="${user.id }" name="id" readonly="readonly"/></td>
			</tr>
			<tr>
				<td>NAME:</td>
				<td><input type="text" value="${user.userName }" name="name" /></td>
			</tr>
			<tr>
				<td>PASSWORD:</td>
				<td><input type="text" value="${user.password }" name="password" /></td>
			</tr>
			<tr>
				<td>AGE:</td>
				<td><input type="text" value="${user.age }" name="age" /></td>
			</tr>
			
			<tr>
				<td><input type="submit" value="提交" /></td>
			</tr>
			
			
		</table>
				
	</form>
</body>
</html>