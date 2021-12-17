<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
ul {
    list-style:none;
    margin:0 30px;
    padding:0;
}

li {

    margin: 0 0 0 5px;
    padding: 0 0 0 0;
    border : 0;
    float: right;
}
</style>
<body>
<ul>
	<li><a href="${pageContext.request.contextPath }/logout.do">로그아웃</a>
	<li><a href="${pageContext.request.contextPath }/member/memberSearch.jsp">회원조회</a></li>
      <li><a href="${pageContext.request.contextPath }/member/memberUpdate.jsp">회원수정</a></li>
      <li><a href="${pageContext.request.contextPath }/memberList.do">회원목록</a></li>
      <li><a href="${pageContext.request.contextPath }/member/memberDelete.jsp">회원삭제</a></li>
    </ul>
    <ul>
       <li><a href="${pageContext.request.contextPath }/product/productInput.jsp">상품등록</a></li>
        <li><a href="${pageContext.request.contextPath }/product/productUpdate.jsp">상품수정</a></li>
        <li><a href="${pageContext.request.contextPath }/product/productDelete.jsp">상품삭제</a></li>
    </ul>    
</body>
</html>