<%@page import="com.DAo.LibraryService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>显示所有图书</title>
</head>
<body>
		<%
		request.setAttribute("service", LibraryService.getService());
	%>
	<c:forEach items="${service.list}" var = "book">
		${book.id}
		${book.name } 
		${book.type }
		${book.author }
		${book.discount }
		${book.price }
		${book.num }
		${book.test}
		<br/>
	</c:forEach>
	
	
	
	<a href = "<%=request.getContextPath()+"/index.html" %>">首页</a>
	<a href="<%=request.getContextPath()+"/ListBook" %>">上一页</a>
	<a href="<%=request.getContextPath()+"/ListBook" %>">下一页</a>
	<a href="<%=request.getContextPath()+"/ListBook" %>">尾页</a>
	
	
	
</body>
</html>






