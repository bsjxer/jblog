<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!doctype html>
<Link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/jblog.css">
<div id="header">
	<h1>Jblog Spring 연습</h1>
	<ul>
	<c:choose>
		<c:when test="${empty authUser }">
		<li><a href="${pageContext.request.contextPath}/user/loginform">로그인</a></li>
	</c:when>
	<c:otherwise>
		<li><a href="${pageContext.request.contextPath }/user/logout">로그아웃</a></li>
		<li><a href="${pageContext.request.contextPath }/blog/blog-admin-basic">블로그 관리</a>
	</c:otherwise>
	</c:choose>
	</ul>
</div>