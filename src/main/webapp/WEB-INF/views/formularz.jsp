
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%-- 
    Document   : formularz
    Created on : 2015-12-10, 21:18:38
    Author     : szaman
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>

        <form:form action="/Questionnaire/formularz" modelAttribute="form" method="post">

            Imię: 
            <form:input path="imie" id="imie"></form:input>
            <c:if test="${pageContext.request.method=='POST'}"><form:errors path="imie" /></c:if>
                <br />

                Adres email: 
            <form:input path="email" id="email"></form:input>
            <c:if test="${pageContext.request.method=='POST'}"><form:errors path="email" /></c:if>
                <br />

                Wiek:
            <form:input path="wiek" id="wiek"></form:input>
            <c:if test="${pageContext.request.method=='POST'}"><form:errors path="wiek" /></c:if>
                <br />

                <input type="submit" value="Wyślij formularz" />
        </form:form>

    </body>
</html>
