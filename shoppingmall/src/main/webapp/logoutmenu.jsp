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
		<li><a href="${pageContext.request.contextPath }/member/memberInput.jsp">회원등록</a></li>
		<li><a href="${pageContext.request.contextPath }/member/memberUpdate.jsp">마이페이지</a></li>
		
		


	</ul>
</body>
</html>