<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>

<div class="container">
	<h1>${cnt}</h1>
	<a class="btn btn-primary" href="addDept" role="button">添加部门</a>
	<h2>  </h2>
  <table class="table table-striped">
		<thead>
		<tr>
      		<th scope="col">部门编号</th>
      		<th scope="col">部门名称</th>
      		<th scope="col">部门地点</th>
      		<th scope="col">操作</th>
    	</tr>
    	</thead>
    	<tbody>
    	<tbody>
			<c:forEach items="${list}" var="dept">
				<tr>
					<td>${dept.deptno}</td>
					<td>${dept.dname}</td>
					<td>${dept.loc}</td>
					<td><a href="${dept.deptno}/update" class="badge badge-info">修改</a>&nbsp;
					<a href="${dept.deptno}/delete" class="badge badge-dark" onClick="return confirm('确定删除${dept.dname}吗?');">删除</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
	
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.15.0/umd/popper.min.js" integrity="sha384-L2pyEeut/H3mtgCBaUNw7KWzp5n9+4pDQiExs933/5QfaTh8YStYFFkOzSoXjlTb" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>