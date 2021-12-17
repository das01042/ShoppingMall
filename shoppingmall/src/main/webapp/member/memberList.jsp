<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>memberList.jsp</title>
</head>
<body>
<jsp:include page="../header.jsp"></jsp:include>
	<jsp:include page="../adminmenu.jsp"></jsp:include>
	
	<c:choose>
		<c:when test="${sessionScope.id == null}">
			<c:redirect url="login.jsp"></c:redirect>
		</c:when>
		<c:otherwise>
	<a href="index.jsp">첫 페이지로</a>
	<h3>회원목록</h3>
	<table border="1">
		<thead>
			<tr>
				<th>아이디</th>
				<th>비밀번호</th>
				<th>이름</th>
				<th>이메일</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="item" items="${requestScope.memberList }">
				<tr>
					<td>${item.id }</td>
					<td>${item.password }</td>
					<td>${item.name }</td>
					<td>${item.email }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
		</c:otherwise>
	</c:choose>
	<jsp:include page="../footer.jsp"></jsp:include>
</body>
</html>