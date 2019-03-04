<%--
  Created by IntelliJ IDEA.
  User: Charles LeMagnifique
  Date: 13/02/2019
  Time: 11:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>

    <!-- Access the bootstrap Css like this,
        Spring boot will handle the resource mapping automcatically -->
    <link rel="stylesheet" type="text/css" href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" />
    <style>
        <%--<%@include file="../css/main.css" %>--%>
    </style>
</head>

<body>
    <nav class="navbar navbar-inverse">
        <div class="container">
            <div class="navbar-header">
                <a class="navbar-brand" href="#">Spring Boot</a>
            </div>
            <div id="navbar" class="collapse navbar-collapse">
                <ul class="nav navbar-nav">
                    <li class="active"><a href="#">Home</a></li>
                    <li><a href="#about">About</a></li>
                </ul>
            </div>
        </div>
    </nav>

    <div class="container">
        <div class="starter-template">
            <h1>Login Spring Boot Web JSP</h1>
            <form action="login" method="Post">
                <input class="loginInputThree" type="text" placeholder="username" name="name"/><br>
                <input class="loginInputThree" type="password" placeholder="password" name="password"/><br>
                <input class="loginInputTwo" type="submit" value="login">
            </form>
            <p color="red">${errorMessage}</p>
        </div>
    </div>

    <script type="text/javascript" src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</body>
</html>
