<%@page import="com.shop.VO.boardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>boardInput.jsp</title>
</head>
<body>

		
	<a href="../index.jsp">메인 화면으로</a>
	<form action='../boardInsert.do' method='post'>
	 제목 :<input type='text' name='title'><br>
	 작성자 :<input type='text' name='writer' value='<%=session.getAttribute("id") %>' readonly><br>
	 내용 : <textarea name='content'></textarea><br>
		   <input type='submit' value='작성'>
	</form>
</body>
</html>