<%-- 
    Document   : login
    Created on : 19-mag-2016, 14.52.49
    Author     : andrea
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title> AG Movies&Books Login</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="author" content="Andrea Girau">
        <meta name="keywords" content="film, dvd, blu-ray, AG, movies, books, libri, best, sellers">
        <!-- link al file style.css -->
        <link href="./style.css" rel="stylesheet"  type="text/css" media="screen">
    </head>
    <body>
        <div id="page">
            <header>
                <div id="header">
                    <!--
                        Nome del sito
                    -->
                    <h1> AG Movies&Books </h1>

                    <div class="navigation">
                        <!--
                            Sezione di navigazione per navigare nelle altre pagine del sito
                        -->
                        <nav>
                            <ul>
                                <li>
                                    <a href="descrizione.html"> Home </a>
                                </li>
                                <li>
                                    <a href="cliente.html"> Compra </a>
                                </li>
                                <li> 
                                    <a href="venditore.html"> Vendi </a>
                                </li>
                            </ul>
                        </nav>
                    </div>
                </div>
            </header>

            <div id="contentForm">
                <h2 class="contentTitle"> Login </h2>
                <c:if test="${empty user}">
                    <div class="input-form" id="form">
                        <form method="get" action="login.html">
                            <!-- Inserimento username -->
                            <label for="username"> Username: </label>
                            <input type="text" name="username" value="Username"/>
                            <!-- Inserimento password -->
                            <label for="password"> Password: </label>
                            <input type="password" name="password" value="password"/>
                            <!-- Pulsanti submit e reset per user e password -->
                            <input type="submit" name="submit" value="invia">
                            <input type="reset" name="reset" value="cancella">  
                            
                            <c:if test="${not empty login_failed}">
                                <div class="errore"> Errore: username o password errati. Si prega di riprovare. </div>
                            </c:if> 
                        </form>
                    </div>
                </c:if>
            </div>    
            <jsp:include page="footer.jsp" />
        </div>
    </body>
</html>
