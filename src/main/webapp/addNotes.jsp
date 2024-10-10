<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
    	<%@include file="allcss_js.jsp" %>

		<h1 align="center">Add Your Note</h1>
		<div class="form" align="center">
		
			<form action="SaveNoteServlet" method="post">
  			<div class="mb-3">
    		<label for="title" class="form-label">Note title</label>
    		<input required 
    		name="title"
    		type="text" 
    		class="form-control" 
    		id="title" 
    		placeholder="Enter your title">
  			</div>
  			
  			<div class="mb-3">
    		<label for="content" >Content</label>
    		<textarea required
    		name="content"
    		id="content" 
    		placeholder="Enter your content here"
    		class="form-control"
    		style="height:100px;">
    		</textarea>
  			</div>
  
  
  			<button type="submit" class="btn btn-primary">Submit</button>
</form>
		
		</div>
		
</body>
</html>