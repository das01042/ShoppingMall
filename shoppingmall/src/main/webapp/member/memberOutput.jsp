<%@page import="com.shop.VO.memberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page errorPage="../error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>입력값 출력</title>
</head>
<body>
<jsp:include page="../header.jsp"></jsp:include>
<jsp:include page="../loginmenu.jsp"></jsp:include>
	<%
	/* Integer.parseInt("");  */
	memberVO vo = (memberVO) request.getAttribute("member");
	%>
	<h3>
		입력한 아이디 : <%=vo.getId()%></h3>
	<h3>
		입력한 이름 : <%=vo.getName()%></h3>
	<h3>
		입력한 비밀번호 : <%=vo.getPassword()%></h3>
	<h3>
		입력한 이메일 : <%=vo.getEmail()%></h3>
		<a href="login.jsp">로그인</a>
	<%@ include file="../footer.jsp"%>
</body>
</html>