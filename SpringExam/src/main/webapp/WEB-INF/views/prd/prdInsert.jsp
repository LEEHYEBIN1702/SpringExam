<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>등록</h3>
<form:form modelAttribute="prdVO" action="prdInsert" method="post" name="frm">
product_id: <form:input path="product_id" /> <br>
product_name: <form:input path="product_name" /> <br>
product_price: <form:input path="product_price" /> <br>
product_info: <form:input path="product_info" /> <br>
product_date: <form:input path="product_date" /> <br>
company: <form:input path="company" /> <br>
manager_id: <form:input path="manager_id" /> <br><br>
<button type="submit">등록 </button>
<button type="reset">초기화 </button>
</form:form>
</body>
</html>