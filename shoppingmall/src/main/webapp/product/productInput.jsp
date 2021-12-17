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

	<form action='../productInsert.do' method= 'post'>
	제품번호:<input type ='text' name='pId'><br>
		제품이름:<input type ='text' name='pName'><br>
		제품설명 :<input type='text' name='pDesc'><br>
		원래가격 :<input type ='number' name ='originPrice'><br>
		할인가격 :<input type ='number' name ='salePrice'><br>
		별점 :<input type ='number' step='0.1' name ='star'><br>
		이미지 :<input type ='file' name ='image'><br>
		수량 :<input type ='number' name ='count'><br>
		<input type='submit' value='상품등록'>
	</form>
</body>
</html>