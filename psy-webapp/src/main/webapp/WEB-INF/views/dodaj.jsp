<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <%--<meta name="viewport" content="initial-scale=1, maximum-scale=1">--%>
    <%--<meta http-equiv="content-type" content="text/html; charset=UTF-8">--%>
    <link href="<spring:url value="/resources/css/bootstrap.min.css"/>" rel="stylesheet" >
    <link href="<spring:url value="/resources/css/mystyle.css"/>" rel="stylesheet" >

</head>
<body>
<div class="container">
    <a href="lista" class="btn btn-info" role="button">lista psów</a>

    <h1>Rejestracja psa</h1>
    <div class="row">
        <div class="col-sm-4">
    <%--<a href="twoDogs" class="btn btn-info" role="button">dodaj 2 psy</a>--%>

    <form:form modelAttribute="dogDto" method="post">
        <div class="form-group">
            <label for="name">Imię psa:</label>
            <form:input path="name" type="text" class="form-control" id="name"/>
            <p class="text-danger"><c:if test="${pageContext.request.method=='POST'}"><form:errors path="name"/></c:if></p>
        </div>
        <div class="form-group">
            <label for="birthDay">Data urodzenia:</label>
            <form:input path="birthDay" type="date" class="form-control" id="birthDay"/>
            <p class="text-danger"><c:if test="${pageContext.request.method=='POST'}"><form:errors path="birthDay" /></c:if></p>
        </div>
        <div class="form-group">
            <label for="weight">Waga:</label>
            <form:input path="weight" type="text" class="form-control" id="weight"/>
            <p class="text-danger"><c:if test="${pageContext.request.method=='POST'}"><form:errors path="weight"/></c:if></p>
        </div>
        <div class="form-group">
            <label for="keeper">Opiekun:</label>
            <form:input path="keeperName" type="text" class="form-control" id="keeper"/>
            <p class="text-danger"><c:if test="${pageContext.request.method=='POST'}"><form:errors path="keeperName" /></c:if></p>
        </div>

        <input type="submit" class="btn btn-info" value="zapisz"/>
    </form:form>
        </div>
        <div class="col-sm-8"></div>
</div>
</div>
<%--<div class="container">--%>
<%--<h2>Basic Table</h2>--%>
<%--<p>The .table class adds basic styling (light padding and only horizontal dividers) to a table:</p>--%>
<%--<table class="table">--%>
<%--<thead>--%>
<%--<tr>--%>
<%--<th>Firstname</th>--%>
<%--<th>Lastname</th>--%>
<%--<th>Email</th>--%>
<%--</tr>--%>
<%--</thead>--%>
<%--<tbody>--%>
<%--<tr>--%>
<%--<td>John</td>--%>
<%--<td>Doe</td>--%>
<%--<td>john@example.com</td>--%>
<%--</tr>--%>
<%--<tr>--%>
<%--<td>Mary</td>--%>
<%--<td>Moe</td>--%>
<%--<td>mary@example.com</td>--%>
<%--</tr>--%>
<%--<tr>--%>
<%--<td>July</td>--%>
<%--<td>Dooley</td>--%>
<%--<td>july@example.com</td>--%>
<%--</tr>--%>
<%--</tbody>--%>
<%--</table>--%>
<%--</div>--%>
<%--<h2>Hello World!</h2>--%>
</body>
</html>
