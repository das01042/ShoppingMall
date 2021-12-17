<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>memberDelete.jsp</title>
</head>
<body>
<%
	String id = (String) session.getAttribute("id");
	if (id == null) {
		response.sendRedirect("../login.jsp");

	} else {
	%>
	<jsp:include page="../header.jsp"></jsp:include>
<jsp:include page="../adminmenu.jsp"></jsp:include>

	<h3>회원검색</h3>
	<form action='../memberSearch.do' method='get'>
		ID: <input type='text' name='id'><br>
			<input type='hidden' name='job' value='delete'>
			<input type='submit' value='검색'>
	</form>
	<%@ include file="../footer.jsp"%>
	<%} %>
</body>
</html>