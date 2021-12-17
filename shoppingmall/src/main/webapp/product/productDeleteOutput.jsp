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
	<h3><%=vo.getpName()%>정상적으로 삭제가 완료되었습니다.
	</h3>
	<br><br>
	<%@ include file="../footer.jsp"%>
</body>
</html>