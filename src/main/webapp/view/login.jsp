<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="jakarta.tags.core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
     <form action="/ltwebb3/login" method="post">
     <c:if test="${alert !=null}">
       <h3 class="alert alert-danger">${alert}</h3>
     </c:if>

  <div class="container">
    <label for="uname"><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="uname" required>

    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="psw" required>

    <button type="submit">Login</button>
    <label>
      <input type="checkbox" checked="checked" name="remember"> Remember me
    </label>
 

  <!-- Nút đăng ký mở trang register.jsp -->
  <div class="container" style="background-color:#f1f1f1">
    <button type="button" onclick="window.location.href='/ltwebb3/register'">Register</button>

  </div>
</form>
</body>
</html>
