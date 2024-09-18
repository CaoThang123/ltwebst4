:<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="jakarta.tags.core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
    <form action="register" method="post">
    <h2>Tạo tài khoản mới</h2>

    <!-- Hiển thị thông báo nếu có alert -->
    <c:if test="${alert != null}">
        <h3 class="alert alert-danger">${alert}</h3>
    </c:if>

    <!-- Phần nhập tài khoản -->
    <section>
        <label class="input login-input">
            <div class="input-group">
                <span class="input-group-addon"><i class="fa fa-user"></i></span>
                <input type="text" placeholder="ten tai khoan" name="uname" class="form-control" required>
            </div>
        </label>
    </section>

    <!-- Phần nhập mật khẩu -->
    <section>
        <label class="input login-input">
            <div class="input-group">
                <span class="input-group-addon"><i class="fa fa-lock"></i></span>
                <input type="password" placeholder="Mật khẩu" name="psw" class="form-control" required>
            </div>
        </label>
    </section>

    <!-- Phần nhập email -->
    <section>
        <label class="input login-input">
            <div class="input-group">
                <span class="input-group-addon"><i class="fa fa-envelope"></i></span>
                <input type="email" placeholder="Email" name="email" class="form-control" required>
            </div>
        </label>
    </section>

   

    

    <!-- Nút đăng ký -->
    <button type="submit" class="btn btn-primary">Đăng ký</button>
</form>

</body>
</html>