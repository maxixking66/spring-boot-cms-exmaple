<%--
  Created by IntelliJ IDEA.
  User: Mohsen
  Date: 10/6/2022
  Time: 10:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <link href="../assets/login.css" rel="stylesheet">
</head>
<body>
<header>
    <h1>Login</h1>
</header>
<main>
    <form id="login_form" class="form_class">
        <div class="form_div">
            <label for="username">Username:</label>
            <input class="field_class" id="username" name="username" type="text" placeholder="Enter username" autofocus>
            <label for="password">Password:</label>
            <input id="password" class="field_class" name="password" type="password" placeholder="Enter password">
            <button class="submit_class" type="button" form="login_form" onclick="login()">Login</button>
        </div>
    </form>
</main>
<footer>
    <p>Maktab</p>
</footer>
</body>
</html>

<script>
    function login() {

    }
</script>
