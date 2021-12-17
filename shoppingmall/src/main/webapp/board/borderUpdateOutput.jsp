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
<%boardVO vo =(boardVO) request.getAttribute("board"); %>
	<table border='1'>
	<thead>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>내용</th>
			<th>작성자</th>
		</tr>
		</thead>
		<tbody>
		<tr>
		<td><%=vo.getNo() %></td>
		<td><%=vo.getTitle() %></td>
		<td><%=vo.getContent() %></td>
		<td><%=vo.getWriter() %></td>
		</tr>
		</tbody>
	</table>
</body>
</html>