<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>memberUpdate.jsp</title>
</head>
<body>
<%
	String id = (String) session.getAttribute("id");
	if (id == null) {
		response.sendRedirect("../login.jsp");

	} else {
	%>
<%@ include file="../logoutmenu.jsp"%>
	<a href='../index.jsp'>첫 페이지</a>
	<h3>회원검색</h3>
	<form action='../memberSearch.do' method='get'>
		ID: <input type='text' name='id' value='${sessionScope.id }' readonly><br>
			<input type='hidden' name='job' value='update'>
			<input type='submit' value='검색'>
	</form>
	<%@ include file="../footer.jsp"%>
	<%} %>
</body>
</html>