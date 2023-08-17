%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<nav aria-label="Pagination">
    <c:choose>
        <c:when test="${pageInfo.hasPrev}"><c:set var="url" value="${pageInfo.getUrl('/board', pageInfo.page - 1)}" /></c:when>
        <c:otherwise><c:set var="url" value="#" /></c:otherwise>
    </c:choose>
    <a href="${url}"<c:if test="${!pageInfo.hasPrev}"> class="disabled"</c:if>>
        <span class="sr-only">Previous</span>
        <svg class="h-5 w-5" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 20 20" fill="currentColor" aria-hidden="true">
            <path fill-rule="evenodd" d="M12.79 5.23a.75.75 0 01-.02 1.06L8.832 10l3.938 3.71a.75.75 0 11-1.04 1.08l-4.5-4.25a.75.75 0 010-1.08l4.5-4.25a.75.75 0 011.06.02z" clip-rule="evenodd" />
        </svg>
    </a>
    <c:forEach var="i" begin="${pageInfo.firstPage}" end="${pageInfo.lastPage}" step="1">
    <a href="${pageInfo.getUrl('/board', i)}"<c:if test="${pageInfo.page eq i}">aria-current="page" class="active"</c:if>>${i}</a>
    </c:forEach>
    <c:choose>
        <c:when test="${pageInfo.hasNext}"><c:set var="url" value="${pageInfo.getUrl('/board', pageInfo.page + 1)}" /></c:when>
        <c:otherwise><c:set var="url" value="#" /></c:otherwise>
    </c:choose>
    <a href="${url}"<c:if test="${!pageInfo.hasNext}"> class="disabled"</c:if>>
        <span class="sr-only">Next</span>
        <svg class="h-5 w-5" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 20 20" fill="currentColor" aria-hidden="true">
            <path fill-rule="evenodd" d="M7.21 14.77a.75.75 0 01.02-1.06L11.168 10 7.23 6.29a.75.75 0 111.04-1.08l4.5 4.25a.75.75 0 010 1.08l-4.5 4.25a.75.75 0 01-1.06-.02z" clip-rule="evenodd" />
        </svg>
    </a>
</nav>