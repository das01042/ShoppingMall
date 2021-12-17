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
	/* Integer.parseInt("");  */
	productVO vo = (productVO) request.getAttribute("product");
	%>
	<h3>
		입력한 상품번호 : <%=vo.getpId()%></h3>
	<h3>
		입력한 상품이름 : <%=vo.getpName()%></h3>
	<h3>
		입력한 상품내용 : <%=vo.getpDesc()%></h3>
	<h3>
		입력한 정가 : <%=vo.getOriginPrice()%></h3>
	<h3>
		입력한 할인가격 : <%=vo.getSalePrice()%></h3>
	<h3>
		입력한 평점 : <%=vo.getStar()%></h3>
	<h3>
		입력한 이미지 : <img src="image/<%=vo.getImage()%>" width="70"> </h3>
	<h3>
		입력한 수량 : <%=vo.getCount()%></h3>	
		
	<%@ include file="../footer.jsp"%>
</body>
</html>