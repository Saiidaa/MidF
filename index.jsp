<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Spring Security</title>
</head>

<body>

<div class="container">

    <div style="margin-top: 20px;">
        <h1>Login</h1>
        <p> Hello users.
            </p>
        <sec:authorize access="!isAuthenticated()">
            <p><a href="<c:url value="/login" />" role="button">Войти</a></p>
        </sec:authorize>
        <sec:authorize access="isAuthenticated()">
            <p>Ваш логин: <sec:authentication property="principal.username" /></p>
            <p><a  href="<c:url value="/logout" />" role="button">Выйти</a></p>

        </sec:authorize>
    </div>

    <div class="footer">
        <p>Yergesheva Saida</p>
    </div>

</div>
</body>
</html>