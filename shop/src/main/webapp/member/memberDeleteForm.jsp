<%@page import="com.shop.VO.memberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>memberDeleteForm.jsp</title>
</head>
<body>
<%
	String id = (String) session.getAttribute("id");
	if (id == null) {
		response.sendRedirect("login.jsp");

	} else {
	%>
<%@ include file="../logoutmenu.jsp"%>
<a href='index.jsp'>첫 페이지</a>
<%
	memberVO vo = (memberVO) request.getAttribute("member");
	
%>
<form action='memberDelete.do' method= 'post'>
		<input type='text' name='id' value='<%=vo.getId() %>' readonly><br>
		<input type='text' name='name' value='<%=vo.getName() %>' readonly><br>
		<input type='text' name='password' value='<%=vo.getPassword() %>' readonly><br>
		<input type='text' name='email' value='<%=vo.getEmail() %>' readonly><br>
		
		<input type='submit' value='삭제'>
	</form>
	
	<%@ include file="../footer.jsp"%>
	<%} %>
</body>
</html>