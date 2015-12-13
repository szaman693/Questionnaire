<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%-- 
    Document   : home
    Created on : 2015-12-07, 10:50:33
    Author     : ryszard.mroczka
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <c:if test="${not empty message}">
            <h1>Ankieta name: ${ankieta.name}</h1>
            <h1>Ankieta id ${ankieta.id}</h1>
        </c:if>


        <h2>Lista pyta</h2>
        <table border="1">
            <thead>
                <tr>
                    <th>kolumna ID</th>
                    <th>kolumna NAME </th>
                </tr>
            </thead>

            <c:forEach var="pytanie" items="${ankieta.pytania}">

                <tbody>
                    <tr>
                        <td>${pytanie.id}</td>
                        <td>${pytanie.name}</td>
                    </tr>                    
                </tbody>

            </c:forEach>

        </table>


</body>
</html>
