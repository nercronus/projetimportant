<%-- 
    Document   : series
    Created on : 17 avr. 2018, 16:23:03
    Author     : Formation
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>StreamingWeb</title>
        <c:import url="_CSS.jsp"/>
    </head>
    <body>
        <c:import url="_ENTETE.jsp"/>
        <c:import url="_MENU.jsp"/>
        <main>
            <c:forEach items="${listedesSeries}" var="seriesActuel">
                <br>  ${seriesActuel.titre}
            </c:forEach>
        </main>
        <c:import url="_PIED.jsp"/>
    </body>
</html>
