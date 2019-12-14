<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Hello world </h1>
<form action="check.html" method="post">
    <input type="text" name="num" value="${num}"/>
    <input type="submit" value="计算奇数还是偶数">
    <h2> ${result} </h2>
</form>

</body>
</html>