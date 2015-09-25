<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<script src="${pageContext.request.contextPath}/resources/js/jquery-2.1.3.js"></script>
<link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/css/bootstrap-theme.min.css" rel="stylesheet">

<title>Insert title here</title>
</head>
<body>
 <%@ include file="/static/header.html" %>


<div class= "container-bs" style = "padding-top:10px;">
	<div class= "row">	
		<div class="col-sm-9 col-xs-12 pull-left">	
			<div class= "col-md-3">
			<form:form method="Post" commandName = "user">
				<form:input path ="loginName" class = "form-control"/>
				<form:input path = "password" class= "form-control"/>
				<br/>
				<form:button name="Login" class = "btn btn-default"> Login</form:button>
			</form:form>	
			</div>
		</div>
	</div>	
</div>	
	
</body>
</html>