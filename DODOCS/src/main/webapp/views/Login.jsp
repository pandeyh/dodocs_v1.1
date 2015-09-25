<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<script src="${pageContext.request.contextPath}/resources/js/jquery-2.1.3.js"></script>
<link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/css/bootstrap-theme.min.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/css/signin.css" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>
 <%@ include file="/static/header.html" %>


<div class= "container-bs" style = "padding-top:10px;">
	
			
			 
			<form:form method="Post" commandName = "user" class= "form-signin">
				<h3 class="form-signin-heading">Please Login</h3>
				
					 <label for="inputEmail" class="sr-only">Email address</label>
					<form:input path = "emailId" class= "form-control" placeholder = "Email" type = "email"/>
			
		
				<label for="inputPassword" class="sr-only">Password</label>
				 	<form:input path = "password" class= "form-control" placeholder = "password" type = "password"/>
				 
				<div class="checkbox">
		          <label>
		            <input type="checkbox" value="remember-me"> Remember me
		          </label>
		        </div>
				<form:button name="Login" class = "btn btn-lg btn-primary btn-block"> Login</form:button>
				
				<a href = "/forgotPassword">Forgot Password</a>
			</form:form>	
	
	
</div>	


<%@ include file="/static/footer.html" %>
</body>
</html>