<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="https://cdn.tailwindcss.com?plugins=forms,typography,aspect-ratio,line-clamp"></script>
    <%@ include file="./include/tailwindcss.jsp" %>
    <title>게시글 목록</title>
</head>
<body>
<main>
    <h1>게시글 목록</h1>
    <article>
        <table>
            <thead>
                <tr>
                    <th></th>
                    <th scope="col">카테고리</th>
                    <th scope="col" class="w-full">제목</th>
                    <th scope="col">작성자</th>
                    <th scope="col">등록일</th>
                    <th scope="col">조회수</th>
                </tr>
            </thead>
            <tbody>
            <c:forEach items="${boardList}" var="board" step="1" varStatus="status">
                <tr>
                    <td>${pageInfo.totalSize - pageInfo.first - status.index + 1}</td>
                    <td>${board.category.category}</td>
                    <td><a href="/board/${board.documentId}">${board.title}</a></td>
                    <td>${board.member.nickName}</td>
                    <td><fmt:formatDate value="${board.createDate}" pattern="yyyy-MM-dd"/></td>
                    <td>${board.readCount}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </article>
    <div class="flex mt-2 sm:mt-4 lg:w-2/3 w-full mx-auto">
        <button class="write" onClick="window.location='/board?act=write'">쓰기</button>
    </div>
    <%@ include file="./include/pageNav.jsp" %>
</main>
</body>
</html>