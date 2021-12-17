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
	String id2 = (String) session.getAttribute("id");
	if (id2 == null) {
		response.sendRedirect("login.jsp");

	} else {
	%>
	<jsp:include page="../header.jsp"></jsp:include>
<%@ include file="../logoutmenu.jsp"%>
<%
	memberVO vo = (memberVO) request.getAttribute("member");

	%>
<a href='index.jsp'>첫 페이지</a>
<h3>회원 수정 정보</h3>
<table>
		<tr>
			<th>회원아이디</th>
			<td><%=vo.getId() %></td>
		</tr>
		<tr>
			<th>비밀번호</th>
			<td><%=vo.getPassword() %></td>
		</tr>
		<tr>
			<th>이름</th>
			<td><%=vo.getName() %></td>
		</tr>
		<tr>
			<th>e-mail</th>
			<td><%=vo.getEmail() %></td>
		</tr>

	</table>
	<%@ include file="../footer.jsp"%>
	<%} %>
</body>
</html>