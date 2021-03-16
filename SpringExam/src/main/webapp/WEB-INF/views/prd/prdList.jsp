<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>prd/prdList.jsp</title>
</head>
<body>
<h3>전체목록</h3>
<c:forEach items="${list }" var="prd">
    ${prd.product_id} ${prd.product_name} ${prd.product_price} ${prd.product_info} ${prd.product_date} ${prd.company} ${prd.manager_id} <br>
</c:forEach>
</body>
</html>