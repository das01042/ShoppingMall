<%@page import="java.util.List"%>
<%@page import="com.shop.VO.commentVO"%>
<%@page import="com.shop.VO.boardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>boardSearchOutput.jsp</title>
<style>
.C_Form{
display: inline-block;
}
</style>
<script>
function reload(){
	location.reload();
}
</script>
</head>
<body>
<%	String id = (String) session.getAttribute("id");
	String password = (String) session.getAttribute("password");
	if(id=="admin"|| id!=null){%>
	<%boardVO vo =(boardVO) request.getAttribute("board"); %>
	<div class="containerBox">
			<div class="Header">
				<div class="H_No">[번호 : <%=vo.getNo() %>]</div>
				<div class="H_title">제목 : <%=vo.getTitle() %></div>
				<div class="H_writer">작성자 : <%=vo.getWriter() %></div>		
			</div>
			<div class="C_content">내용: <%=vo.getContent() %></div>
			
			
<!--==========================수정===============================  -->
	<form action='boardSearch.do' method='get' class="C_Form">
		<input type = 'hidden' name='no' value='<%=vo.getNo() %>'>
		<input type = 'hidden' name ='job' value='update'>
		<input type= 'submit' value='수정' class="F_submit">
	</form>
	<!-- ============================삭제=============================== -->
	<form action='boardSearch.do' method='get' class="C_Form">
		<input type = 'hidden' name='no' value='<%=vo.getNo() %>'>
		<input type = 'hidden' name ='job' value='delete'>
		<input type= 'submit' value='삭제' class="F_submit">
	</form>
	<%List<commentVO> cvo =(List<commentVO>) request.getAttribute("comment"); %>
<!-- =============================댓글 등록 및 리스트================================ -->
	
	<form method="post" action="boardComment.do">
	<input type="hidden" name="no" value='<%=vo.getNo()%>'>
	<input type="hidden" name="job" value="search">
		<table>
			<tr>
				<td colspan="2" align="left">
					<b>댓글</b>
				</td>
			</tr>
			
			<tr>
				<td><input type="text" name="writer"  size="8" value="${sessionScope.id }" readonly></td>
				<td colspan="2"><input type="text" name="content" placeholder="댓글내용" size="30"></td>
				<td><input type="password" name="pwd" placeholder="비밀번호" size="8"></td>
				
				<td><input type="submit" value="등록"></td>
			</tr>
			</table>
				</form>
			<table>
			<tr>
				<td>닉네임</td>
				<td colspan="2">내용</td>
			
			<c:forEach var="item" items="${requestScope.comment }">
				<tr>
					<td>${item.commentWriter }</td>
					<td colspan="2">${item.commentCont }</td>
<!-- =============================댓글 수정 및 삭제 =========================-->
					
					<c:set var="id" value="${sessionScope.id }"></c:set>
					<c:set var="c_id" value="${item.commentWriter }"></c:set>
      <c:if test="${id=='admin' || id==c_id}">
      
      
					
					<td> <form action='commentDelete.do' method='get' >
						<input type = 'hidden' name='comment_no' value='${item.commentNo }'>
						<input type = 'hidden' name='no' value='${item.commentBoardNo }'>
						<input type = 'hidden' name ='job' value='search'>
						<input type= 'submit' value='삭제'>
			</form></td>
		</c:if>
				</tr>
			
			</c:forEach>
			
	</table>

	</div>
			
	<% }else {
	%><script>alert("로그인이 필요합니다")</script>
	<%response.sendRedirect("boradList.do");
	}%>



	
</body>
</html>