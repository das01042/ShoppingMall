<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>boardList.jsp</title>
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
<%	String id = (String) session.getAttribute("id");
	String password = (String) session.getAttribute("password");
	if(id==null){
		response.sendRedirect("login.do");
	}
%>

	<a href="index.jsp">메인 화면으로</a>
	<a href="board/boardInput.jsp">게시글 작성</a>
	<h3>게시판 목록</h3>
	<form action='boardSearch.do' id='frd' method='get'>
		  <input type='hidden' name="job" value='search'>
	<input type='hidden' name='no' id='no'>
	<table border="1">
		<thead>
			<tr>
				<th>게시판 번호</th>
				<th>제목</th>
				<th>작성자</th>
				
			</tr>
		</thead>
		<tbody>
			<c:forEach var="item" items="${requestScope.boardList }">
				<tr>
					<td>${item.no }</td>
					<td class='actionTd'>${item.title }</td>
					<td>${item.writer }</td>
				</tr>
			</c:forEach>
		</tbody>

	</table>
	</form>
	<!-- ============================검색창==================== -->
	<div>
		<div>
			<form method="post" name="search" action="boardSearchTool.do">
				<table>
					<tr>
						<td><select name="searchField">
								<option value="0">선택</option>
								<option value="title" >제목</option>
								<option value="writer">작성자</option>
						</select></td>
						<td><input type="text" placeholder="검색어 입력" name="searchText" maxlength="100"></td>
						<td><button type="submit">검색</button></td>
					</tr>
				</table>
			</form>
		</div>
	</div>
	
</body>
</html>