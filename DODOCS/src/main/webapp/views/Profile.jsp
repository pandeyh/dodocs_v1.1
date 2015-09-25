<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<title>Profile</title>
</head>
<body>
 	
 	
<form:form method="GET" commandName = "user">

<form:input path ="loginName"/>
	
<form:button name="Search" > Search</form:button>

</form:form>
 	
 	Hello ${userName}!
  
</body>
</html>