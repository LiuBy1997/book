<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登记入库</title>
</head>
<body>
	<c:if test="${not empty errors }">
		<c:forEach	items="${errors }"  var="error">
			${error }<br/>
		</c:forEach>
	</c:if>
	
	<form action="<%=request.getContextPath()+"/LController" %>" method = "post">
		书名:	<input type = "text" name = "name" value = "${param.name }"><br/><br/>		
		类别:	 <input type="checkbox"   name="type"  value="${param.type }">科学
					<input type="checkbox"   name="type"  value="${param.type }">教育
					<input type="checkbox"   name="type"  value="${param.type }">文学
					<input type="checkbox"   name="type"  value="${param.type }">生活
					<input type="checkbox"   name="type"  value="${param.type }">其他<br/><br/>
		作者:	<input type = "text" name = "author" value = "${param.author }"><br/><br/>
		折扣:	<input type="radio" name="discount" value="${param.discount}">全折
					<input type="radio" name="discount" value="${param.discount}">九折
					<input type="radio" name="discount" value="${param.discount}">八折
					<input type="radio" name="discount" value="${param.discount}">七折
					<input type="radio" name="discount" value="${param.discount}">六折<br/><br/>
		价格:	<input type = "text" name = "price"  value = "${param.price }"><br/><br/>
		数量:	<input type = "text" name = "num"  value = "${param.num }"><br/><br/>
		简介:	<input type = "textarea" name = "test"  value = "${param.test }"><br/><br/>
		<input type = "submit" value = "提交">
		<input type = "button" value = "取消">
	</form>
</body>
</html>


