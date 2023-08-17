<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<form method="POST" action="/test">
    <c:forTokens var="field" items="count,price" delims=",">
        <label>
            <c:choose>
                <c:when test="${field eq 'count'}">수량</c:when>
                <c:when test="${field eq 'price'}">가격</c:when>
            </c:choose>
            <c:choose>
                <c:when test="${!errors.hasFieldErrors(field)}">
                    <c:set var="value" value="${errors.getFieldValue(field)}" />
                </c:when>
                <c:otherwise><c:remove var="value" /></c:otherwise>
            </c:choose>
            <input type="text" name="${field}" value="${value}" />
            <c:if test="${errors.hasFieldErrors(field)}">
                <font color="red">${errors.getMessage(field)}</font>
            </c:if>
        </label>
        <br>
    </c:forTokens>
    <c:if test="${!error.hasFieldErrors() and errors.hasGlobalErrors()}">
        <p><font color="red">${errors.globalMessage}</font></p>
    </c:if>
    <br>
    <input type="submit" value="제출" />
</form>
<c:if test="${errors.hasErrors()}">
<script>
[...document.forms[0].querySelectorAll("[name]")].filter(e=>!e.value)[0].focus();
</script>
</c:if>
</body>
</html>