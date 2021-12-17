<%@page import="java.util.List"%>
<%@page import="com.shop.DAO.productDAO"%>
<%@page import="com.shop.service.productService"%>
<%@page import="com.shop.VO.productVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>productList.jsp</title>
</head>
<body>

<div>
           
            <br><br><br>
<!--             <img src="image/곰.jpg"> -->
            <br><br>    
            </div>
<div>
      <table>
      <tbody>
<% productService service = new productService();
		List<productVO> list = service.searchAll();
      for(productVO p:list){  %>
      <tr> 
      <td>
          <img src="image/<%=p.getImage()%>" width="70" onclick="location.href='https://www.daum.net'">
          </td><td>
          <%=p.getpName() %> </td><td>
          <%=p.getpDesc() %> </td><td>
       <%=p.getOriginPrice() %></td></tr>
    <%   
     }
      %> 
</tbody>
</table>


</div>
</body>
</html>