<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="../header.jsp"></jsp:include>
<jsp:include page="../adminmenu.jsp"></jsp:include>

<h3>상품삭제</h3>
	<form action='../productSearch.do' method='get'>
		상품이름: <input type='text' name='pName'><br>
			<input type='hidden' name='job' value='delete'>
			<input type='submit' value='검색'>
	</form>
	<%@ include file="../footer.jsp"%>


</body>
</html>