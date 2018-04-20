<%-- 
    Document   : ajouter_film
    Created on : 19 avr. 2018, 16:47:14
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
            <form method="post">
                <br>
                <label>Titre</label>
                <input name="Titre" type="text"/>
                <br>
                <br>
                <label>Synopsis</label>
                <textarea name="Synopsis"></textarea>
                <br>
                <label>Genre</label>
                <select name="genreId">
                    <c:forEach items="${genreList}" var="genreAct">
                               <option  value="${genreAct.id}">${genreAct.nom}</option>
                    </c:forEach>
                </select>
                <input type="submit"/>
            </form>
        </main>
        <c:import url="_PIED.jsp"/>
    </body>
</html>
