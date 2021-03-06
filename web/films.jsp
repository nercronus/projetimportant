<%-- 
    Document   : films
    Created on : 17 avr. 2018, 16:22:45
    Author     : Formation
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
            <c:forEach items="${listedesFilms}" var="filmActuel">
                <br>   ${filmActuel.titre} 
                <a href="detail_film?idFilm=${filmActuel.id}"><button>DETAILS</button></a>
            </c:forEach>
        </main>
        <c:import url="_PIED.jsp"/>
    </body>
</html>
