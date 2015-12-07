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
        <h1>Hello World!</h1>

    <c:if test="${not empty msg}">
        Hello ${message}
    </c:if>

</body>
</html>
