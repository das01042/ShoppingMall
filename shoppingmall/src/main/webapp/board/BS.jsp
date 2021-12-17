<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BS.jsp</title>
</head>
<body>
<div>
		<div>
			<form method="post" name="search" action="boardSearchTool.do">
				<table>
					<tr>
						<td><select name="searchField">
								<option value="0">선택</option>
								<option value="title">제목</option>
								<option value="writer">작성자</option>
						</select></td>
						<td><input type="text" placeholder="검색어 입력" name="searchText" maxlength="100"></td>
						<td><button type="submit">검색</button></td>
					</tr>
				</table>
			</form>
		</div>
	</div>
</body>
</html>