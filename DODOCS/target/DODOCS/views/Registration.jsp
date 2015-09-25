<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<script src="${pageContext.request.contextPath}/resources/js/jquery-2.1.3.js"></script>
<link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/css/bootstrap-theme.min.css" rel="stylesheet">

<title>Insert title here</title>



</head>


<body>



	 <%@ include file="/static/header.html" %>
	
	
	

	<form:form method="POST" action="saveUser" modelAttribute="user" >
	<div class= "container-bs">
	<div class= "row">	
		<div class="col-sm-9 col-xs-12 pull-left">	
		<div class= "table-responsive  col-md-9 ">
		<table class="table" >
			<tr>
				<td>First Name:</td>
				<td><form:input path="firstName"  class="form-control" /></td>
	
				
			</tr>
			<tr>
				<td>Last Name:</td>
				<td><form:input path="lastName"  class="form-control" /></td>

			</tr>

			<tr>
				<td>Email:</td>
				<td><form:input path="emailId"  class="form-control" /></td>
			</tr>
	
			<tr>
				<td>Desgination:</td>
				<td><form:input path="userDesignation" class="form-control"  /></td>
			</tr>


	    	<!-- <form:errors  path="name" cssClass="error" />  -->	

	       
	       </table> 
	        <input type="submit" value="Submit" class = "btn btn-default"/> <input type="reset" value="Reset" class= "btn btn-default" />
	     </div> 
	     
	     </div>
	     
	     </div>
	    
	     
     </div>
     
    </form:form>    


	
</body>
</html>