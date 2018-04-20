<%-- 
    Document   : detailseries
    Created on : 19 avr. 2018, 11:59:17
    Author     : Formation
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
            <h1>${serie.titre}</h1>
            <br>
            ${serie.synopsis}
            <br>
            payslist:
            <c:forEach items="${serie.paysList}" var="serieAct">
                ${serieAct.nom}
            </c:forEach>
            <br>
           nbepisode:
           ${nbepisodes}
            
        </main>
        <c:import url="_PIED.jsp"/>
    </body>
</html>
