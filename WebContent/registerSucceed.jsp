<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	注册成功！<br/>
	用户名：<%out.print(request.getParameter("username")); %><br/>
	密码：<%out.print(request.getParameter("password")); %><br/>
	手机：<%out.print(request.getParameter("phone")); %><br/>
	
</body>
</html>