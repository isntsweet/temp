<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="ko">
<head>
    <%@ include file="../common/top.jsp" %>
    <%@ include file="../common/heading.jsp" %>
</head>

<body>
	<div class="container-fluid" id="inFrame">
    <%@ include file="../common/aside.jsp" %>
		<header id="header">
			<a href="/goodM/user/main" class="logo"><strong><img src="/img/logo.png" alt="" width="30px" height="30px"></strong> by 멀캠가네 둘째 조</a>
		</header>
		<!-- Content -->
		<!-- 제목 -->
		<h2>게시글 삭제</h2>
		<div class="card border-warning mt-3">
			<div class="card-body">
			    <strong class="card-title">정말로 삭제하시겠습니까?</strong>
			    <p class="card-text text-center">
			        <br>
			        <button class="btn btn-primary" onclick="location.href='/goodM/genBoard/deleteConfirm?genBid=${genBid}'">삭제</button>
					<button class="btn btn-secondary" onclick="location.href='/goodM/genBoard/list?p=${currentGenBoardPage}&f=&q='">취소</button>
		        </p>
		    </div>
		</div>
	</div>
<%@ include file="../common/bottom.jsp" %>
</body>
</html>