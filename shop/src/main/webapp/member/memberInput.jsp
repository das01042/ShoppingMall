<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@page errorPage ="../error.jsp" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>입력정보</title>
</head>
<body>

<jsp:include page="../loginmenu.jsp"></jsp:include>


		<a href="../index.jsp">첫페이지로</a>
		<!-- 입력.jsp -> controller -> 출력.jsp -->
		<form action='../memberInsert.do' method= 'post'>
		ID:<input type ='text' name='id'><br>
		비밀번호:<input type ='password' name='password'><br>
		이름 :<input type='text' name='name'><br>
		E-mail :<input type ='email' name ='email'><br>
		<input type='submit' value='가입'>
	</form>
		
	
	<jsp:include page="../footer.jsp"></jsp:include>
</body>
</html>