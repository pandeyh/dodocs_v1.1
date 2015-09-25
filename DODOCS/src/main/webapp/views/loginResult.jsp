<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<script src="${pageContext.request.contextPath}/resources/js/jquery-2.1.3.js"></script>
<link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/css/bootstrap-theme.min.css" rel="stylesheet">
<title>Profile</title>
<script type="text/javascript">

</script>

<style type="text/css">
    .bs-example{
    	margin: 20px;
    }
 

</style>

</head>


<body>
 <%@ include file="/static/header.html" %>

Welcome ! ${user}




<div class="page-container">
  
	<!-- top navbar -->
   
    <div class="container">
      <div class="row ">
        
        <!-- sidebar -->
        
        
        
        <div class="col-sm-3 " id="sidebar" role="navigation">
       		 <h3>My Profile</h3><hr/>
            <ul class="nav nav-pills nav-stacked pull-left">
              <li class="active"><a href="#">Home</a></li>
              <li><a href="#">Link 1</a></li>
              <li><a href="#">Link 2</a></li>
              <li><a href="#">Link 3</a></li>   
              <li><a href="#" data-toggle="collapse" data-target="#sub1">Link 4 (submenu)</a>
                <ul class="nav collapse" id="sub1">
                  <li><a href="#">Sub Link 1</a></li>
                  <li><a href="#">Sub Link 2</a></li>
                  <li><a href="#">Sub Link 3</a></li>
                </ul>
              </li>
              <li><a href="#">Link 5</a></li>   
            </ul>
        </div>
  	
        <!-- main area -->
       
        <div class="col-sm-5">
         
 		<h3>Shared Documents</h3><hr/>
		    <table class="table table-striped">
		        <thead>
		            <tr>
		                
		                <th>Document</th>
		                <th>Document Type</th>
		                <th>Release</th>
		                <th>Action</th>
		            </tr>
		        </thead>
		        <tbody>
		            <tr>
		                
		                <td>John</td>
		                <td>Carter</td>
		                <td>johncarter@mail.com</td>
		                <td><a class="btn mini blue-stripe" href="view">View</a></td>
		            </tr>
		            <tr>
		                
		                <td>Peter</td>
		                <td>Parker</td>
		                <td>peterparker@mail.com</td>
		                 <td><a class="btn mini blue-stripe" href="view">View</a></td>
		            </tr>
		            <tr>
		               
		                <td>John</td>
		                <td>Rambo</td>
		                <td>johnrambo@mail.com</td>
		                 <td><a class="btn mini blue-stripe" href="view">View</a></td>
		            </tr>
		        </tbody>
		    </table>
  
  
  			<nav>
				  <ul class="pagination">
				    <li>
				      <a href="#" aria-label="Previous">
				        <span aria-hidden="true">&laquo;</span>
				      </a>
				    </li>
				    <li><a href="#">1</a></li>
				    <li><a href="#">2</a></li>
				    <li><a href="#">3</a></li>
				    <li><a href="#">4</a></li>
				    <li><a href="#">5</a></li>
				    <li>
				      <a href="#" aria-label="Next">
				        <span aria-hidden="true">&raquo;</span>
				      </a>
				    </li>
				  </ul>
				</nav>
        </div><!-- /.col-xs-12 main -->
       
        
        
   
  <section class="col-sm-4">
            <h3>My Documents<a href="/apex/CBI_todo" target="_self"></a></h3><hr/>
            <ul class="list-unstyled recent-todos-list">
          
            </ul>
            </section>
            
  <!--  <form id = "fileForm" method="POST" enctype="multipart/form-data">
		File to upload: <input type="file" name="file"><br /> Name: <input
			type="text" name="name"><br /> <br /> 
			<button name = "Upload File" onclick = "submitFile('fileForm')">Submit</button>
			 Press here to upload the file!
	</form>  -->
<form  id = "fileUploadForm">
		File to upload: <input type="file" name="file[]" id = "fileId"><br /> Name: <input
			type="text" name="name"><br /> <br /> <input type="button"
			value="Upload" onclick = "uploadFile('fileId')"> 
	</form>	
	
  </div>
  </div><!--/.row-->
  </div><!--/.container-->
  
  <%@ include file="/static/footer.html" %>
  
  <script type="text/javascript">
 

 
  function uploadFile(fileId) {
	  var file = document.getElementById(fileId);
	  alert(file);
	  var formData = new FormData();
    formData.append("userFile", file.files[0]);
    $.ajax({
        url : '/DODOCS/uploadFile',
        type : "POST",
        data :formData,
        processData: false, 
        contentType: false,
        success : function(data) {
            $('#result').html(data);
        }
    });
}

  
  </script>
  
</body>
</html>