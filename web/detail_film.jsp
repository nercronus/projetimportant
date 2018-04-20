<%-- 
    Document   : _TEMPLATE
    Created on : 17 avr. 2018, 11:58:26
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
            <h1>${film.titre}</h1>
            ${film.synopsis}
            <br>
            genre: ${film.genre.nom}
            <br>
            ${film.annee}
            <br>
            ${film.duree}
            <br>
            payslist:
            <c:forEach items="${film.paysList}" var="paysAct">
                ${paysAct.nom}
            </c:forEach>
            <br>
            realisateur:
            <c:forEach items="${film.personneList}" var="personneAct">
                ${personneAct.nom}
                ${personneAct.prenom}
            </c:forEach>
            <br>
            acteur:
            <c:forEach items="${film.personneList1}" var="personneActt">
                ${personneActt.nom}
                ${personneActt.prenom}
            </c:forEach>
          
        </main>
        <c:import url="_PIED.jsp"/>
    </body>
</html>