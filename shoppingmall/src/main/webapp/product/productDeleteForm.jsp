<%@page import="com.shop.VO.productVO"%>
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
<%
	productVO vo = (productVO) request.getAttribute("product");
	
%>
<form action='productDelete.do' method= 'post'>
		<input type='text' name='pId' value='<%=vo.getpId() %>' readonly><br>
		<input type='text' name='pName' value='<%=vo.getpName() %>' readonly><br>
		
		<input type='submit' value='삭제'>
	</form>
	
	<%@ include file="../footer.jsp"%>
</body>
</html>