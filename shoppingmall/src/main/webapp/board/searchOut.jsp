<%@page import="java.io.PrintWriter"%>
<%@page import="com.shop.service.boardService"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.shop.VO.boardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script>
$(document).ready(function(){
	$('.actionTd').on('click',function(e){
		e.preventDefault();
		
		$('#no').val($(this).prev().html());
		$('#frd').submit();
	});
});
</script>
</head>

<body>

	<form action='boardSearch.do' id='frd' method='get'>
		  <input type='hidden' name="job" value='search'>
	<input type='hidden' name='no' id='no'>
	<table border = '1'>
	<thead>
	<tr>
	<th>번호</th>
	<th>제목</th>
	<th>작성자</th>
	
	</tr>
	
	</thead>
		<tbody>
			<%
			
			ArrayList<boardVO> list = (ArrayList<boardVO>) request.getAttribute("board");
			if(list.size()==0){
				PrintWriter script = response.getWriter();
				script.println("<script>");
				script.println("alert('검색결과가 없습니다.')");
				script.println("history.back()");
				script.println("</script>");
			}%>
			
				
				<c:forEach var="item" items="${requestScope.board }">
				<tr>
					<td>${item.no }</td>
					<td class='actionTd'>${item.title }</td>
					<td>${item.writer }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	</form>
</body>
</html>