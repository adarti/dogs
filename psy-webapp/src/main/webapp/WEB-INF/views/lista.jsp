<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
<head>
    <%--<meta name="viewport" content="initial-scale=1, maximum-scale=1">--%>
        <link href="<spring:url value="/resources/css/bootstrap.min.css"/>" rel="stylesheet" >
    <link href="<c:url value="/resources/css/mystyle.css"/>" rel="stylesheet">

</head>
<body>
<div class="container">
    <a href="psy-webapp" class="btn btn-warning" role="button">Home</a>
    <h1>Lista psów</h1>




    <table class="table">
        <thead>
        <tr>
            <th>#</th>
            <th>Imię psa</th>
        </tr>
        </thead>

        <tbody>
        <c:forEach var="dog" items="${dogs}">

        <tr>
            <td>${dog.id}</td>
            <td>
                <a href="dog-${dog.id}">
                        ${dog.name}
                </a>
            </td>
        </tr>
        <tr>
        </c:forEach>
        </tbody>

    </table>

    <a href="dodaj" class="btn btn-info" role="button">Dodaj psa</a>
</div>
</body>
</html>
