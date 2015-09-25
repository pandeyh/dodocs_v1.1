<!DOCTYPE HTML>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Getting Started: Handing Form Submission</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
</head>
<body>
	<h1>Result</h1>
    My Recipe is : ${myRecipe}
   ${recipe.recipeName}
   ${recipe.description}
   <br/>
   <br/>
   
   <c:forEach var="listValue" items="${recipe.ingredients}">
				<li>${listValue.recipeItem}</li>--
				<li>${listValue.recipeItemQuantity}</li>
	</c:forEach>
 
   
    <a href="/greeting">Submit another message</a>
</body>
</html>