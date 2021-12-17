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
	String id = (String) session.getAttribute("id");
	if(id.equals("admin")|| id.equals(vo.getWriter())){%>
	

<form action='boardDelete.do' method= 'post'>
		번호 : <input type='text' name='no' value='<%=vo.getNo() %>' readonly><br>
		제목 :<input type='text' name='title' value='<%=vo.getTitle() %>' readonly><br>
		내용 : <input type='text' name='content' value='<%=vo.getContent() %>' readonly><br>
		작성자 : <input type='text' name='writer' value='<%=vo.getWriter() %>' readonly><br>
		<h3>삭제버튼을 누르면 해당 게시판을 삭제합니다</h3>
		<input type='submit' value='삭제'>
	</form>
	<%}else{ %>
	<script>
		alert("권한이 없습니다");
		history.back();
		</script>
		<%} %>
	
</body>
</html>