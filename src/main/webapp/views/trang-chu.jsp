<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Trang Chu</title>
</head>
<body>
	<a href='<c:url value='/trang-chu?action=them-moi' />'>Them hoat
		dong</a>
	<br>
	<a href='<c:url value='/trang-chu?action=danh-sach' />'>Danh sach
		hoat dong</a>
</body>
</html>