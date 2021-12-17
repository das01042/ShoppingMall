<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>boardSearch.jsp</title>
</head>
<body>
	
	
	<form action='../boardSearch.do' method='get'>
	  제목 : <input type='text' name="title"><br>
		  <input type='hidden' name="job" value='search'>
		  <input type='hidden' name ='no'>
		  <input type='submit' value='검색'>
	</form>
	
</body>
</html>