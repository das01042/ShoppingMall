<%@page import="com.shop.VO.boardVO"%>
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
	boardVO vo = (boardVO) request.getAttribute("board");
	%>
	<h1><%=vo.getNo()%>번 정상적으로 삭제가 완료되었습니다.
	</h1>
	<a href="${pageContext.request.contextPath }/boardList.do">게시판 돌아가기</a>
</body>
</html>