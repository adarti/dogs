<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>--%>
<!DOCTYPE html>
<html>
<head>
    <title>Maven + Spring MVC + @JavaConfig</title>

    <%--<spring:url value="/resources/css/bootstrap.min.css" var="bootstrapCss" />--%>
    <%--<link href="${bootstrapCss}" rel="stylesheet" />--%>
    <link href="<spring:url value="/resources/css/bootstrap.min.css"/>" rel="stylesheet" >
</head>
<body>
<div class="container">
    <div class="jumbotron">
        <h1>Witamy w bazie psów</h1>
    </div>
    <h3>Baza zawiera psy różnych ras</h3>

    <a href="lista" class="btn btn-info" role="button">Pokaż psy</a>
</div>
</body>
</html>
