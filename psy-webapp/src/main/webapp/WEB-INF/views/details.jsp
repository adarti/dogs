<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html>
<head>
    <%--<meta charset="UTF-8">--%>
    <%--<meta name="viewport" content="initial-scale=1, maximum-scale=1">--%>
    <%--<link rel="stylesheet" href="<spring:url value="webjars/bootstrap/3.3.7-1/css/bootstrap.min.css"/>">--%>
    <link href="<spring:url value="/resources/css/bootstrap.min.css"/>" rel="stylesheet">

</head>
<body>
<div class="container">
    <a href="lista" class="btn btn-info" role="button">Lista psów</a>

    <h1>Pies ${name}</h1>
</div>
<div class="container">
    <table class="table">
        <thead>
        <tr>
            <th>Imię psa</th>
            <th>Data urodzenia</th>
            <th>Waga</th>
            <th>Opiekun</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>${name}</td>
            <td>${birthDay}</td>
            <td>${weight}</td>
            <td>${keeper}</td>
        </tr>
        </tbody>
    </table>
    <form method="post" >
        <input type="submit" class="btn btn-info" value="usuń psa"/>
    </form>
</div>
</body>
</html>
