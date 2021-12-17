<%@page import="com.shop.VO.commentVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>boardComment.jsp</title>
</head>
<body>
<!-- 연동된 페이지 아님!!(백업본)  boardSearchOut.jsp쪽 연동중!!!!!-->
<%
commentVO vo =(commentVO) request.getAttribute("board"); %>
	<form method="post" action="../boardComment.do">
	<input type="hidden" name="no">
		<table>
		
			<tr>
				<td colspan="2" align="left">
					<b>댓글</b>
				</td>
			</tr>
			
			<tr>
				<td><input type="text" name="writer"  size="8" value="${sessionScope.id }"></td>
				<td><input type="text" name="content" placeholder="댓글내용" size="30"></td>
				<td><input type="password" name="pwd" placeholder="비밀번호" size="8"></td>
				<td><input type="submit" value="등록"></td>
			</tr>
			
		</table>
</form>
</body>
</html>