<%@page import="com.shop.VO.memberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>memberUpdateForm.jsp</title>
</head>
<body>
<%
	String id = (String) session.getAttribute("id");
	if (id == null) {
		response.sendRedirect("login.jsp");

	} else {
	%>
	<jsp:include page="../header.jsp"></jsp:include>
<%@ include file="../logoutmenu.jsp"%>
<%
	memberVO vo = (memberVO) request.getAttribute("member");
	
%>
<form action='memberUpdate.do' method= 'post'>
		ID:<input type ='text' name='id' value='<%=vo.getId() %>'><br>
		비밀번호:<input type ='password' name='password' value='<%=vo.getPassword() %>'><br>
		이름 :<input type='text' name='name' value='<%=vo.getName() %>'><br>
		E-mail :<input type ='email' name ='email' value='<%=vo.getEmail() %>'><br>
		<input type='submit' value='수정'>
	</form>
	<%@ include file="../footer.jsp"%>
	<%} %>
</body>
</html>