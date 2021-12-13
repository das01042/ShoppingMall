<%@page import="com.shop.VO.memberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>memberDeleteOutput.jsp</title>
</head>
<body>
<%
	String id = (String) session.getAttribute("id");
	if (id == null) {
		response.sendRedirect("login.jsp");

	} else {
	%>
<%@ include file="../logoutmenu.jsp"%>
	<%
	memberVO vo = (memberVO) request.getAttribute("member");
	%>
	<a href='index.jsp'>첫 페이지</a>
	<h1><%=vo.getName()%>정상적으로 삭제가 완료되었습니다.
	</h1>
	<%@ include file="../footer.jsp"%>
	<%} %>
</body>
</html>