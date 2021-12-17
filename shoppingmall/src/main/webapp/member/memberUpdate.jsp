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
	String password = (String) session.getAttribute("password");
	if (id == null) {
		response.sendRedirect("../login.jsp");

	} else {
	%>
	<jsp:include page="../header.jsp"></jsp:include>
<%@ include file="../logoutmenu.jsp"%>
	<a href='../index.jsp'>첫 페이지</a>
	<h3>마이페이지</h3>
	<form action='../memberSearch.do' method='get'>
		ID: <input type='text' name='id' value='${sessionScope.id }' readonly><br>
		PW: <input type='text' name='password' placeholder="비밀번호를 입력하세요"  ><br>
			<input type='hidden' name='job' value='update'>
			<input type='submit' value='검색'>
	</form>
	<%@ include file="../footer.jsp"%>
	<%} %>
</body>
</html>