<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:import url="/WEB-INF/views/template/nav.jsp"></c:import>
<c:import url="/WEB-INF/views/template/header.jsp"></c:import>
<div class="mb-3">
  <label for="formGroupExampleInput" class="form-label">ID</label>
  <input type="text" class="form-control" id="formGroupExampleInput" placeholder="ID를 입력하세요">
</div>
<div class="mb-3">
  <label for="formGroupExampleInput2" class="form-label">PASSWORD</label>
  <input type="text" class="form-control" id="formGroupExampleInput2" placeholder="PASSWORD를 입력하세요">
</div>
<div class="mb-3">
  <label for="formGroupExampleInput2" class="form-label">PASSWORD확인</label>
  <input type="text" class="form-control" id="formGroupExampleInput2" placeholder="PASSWORD를 입력하세요">
</div>
<div class="mb-3">
  <label for="formGroupExampleInput2" class="form-label">EMAIL</label>
  <input type="text" class="form-control" id="formGroupExampleInput2" placeholder="EMAIL을 입력하세요">
</div>
<div class="mb-3">
  <label for="formGroupExampleInput2" class="form-label">PHONE</label>
  <input type="text" class="form-control" id="formGroupExampleInput2" placeholder="전화번호를 입력하세요">
</div>
<c:import url="/WEB-INF/views/template/footer.jsp"></c:import>
</body>
</html>