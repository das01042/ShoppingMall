<%@page import="com.shop.VO.memberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	 memberVO vo = new memberVO();
	
	%>
	<jsp:useBean id="vo2" class="com.shop.VO.memberVO"></jsp:useBean>
	<jsp:setProperty property="id" name="vo2" value="p;"/>

	<%
	String id = (String) session.getAttribute("id");
	String name = (String) session.getAttribute("name");
	String password = (String) session.getAttribute("password");
	String email = (String) session.getAttribute("email");
	if (id == null) {
%>
	<jsp:include page="loginmenu.jsp"></jsp:include>
	<%@ include file="footer.jsp"%>
<%
	} else {
	%>
	<h3><%=session.getAttribute("name") %>님, 환영합니다!!</h3>
	<jsp:include page="logoutmenu.jsp"></jsp:include>
	<%@ include file="footer.jsp"%>
	<%
		}
	%>


	
</body>
</html>