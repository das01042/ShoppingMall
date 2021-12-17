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
	<jsp:include page="../header.jsp"></jsp:include>
<jsp:include page="../adminmenu.jsp"></jsp:include>
	<%
	memberVO vo = (memberVO) request.getAttribute("member");
	%>
	<h1><%=vo.getName()%>정상적으로 삭제가 완료되었습니다.
	</h1>
	<%@ include file="../footer.jsp"%>
	<%} %>
</body>
</html>