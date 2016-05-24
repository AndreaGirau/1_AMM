<%-- 
    Document   : venditore
    Created on : 19-mag-2016, 14.54.17
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
        <title> AG Movies&Books Vendi </title>
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
                    <!-- Nome sito -->
                    <h1> AG Movies&Books </h1>

                    <div class="navigation">
                        <!--
                            Sezone di navigazione per navigare nelle altre pagine del sito
                        -->
                        <nav>
                            <ul>
                                <li>
                                    <a href="descrizione.html"> Home </a>
                                </li>
                                <c:if test="${empty clienteLoggato && empty venditoreLoggato}">
                                    <a href="login.html"> Login</a>
                                </c:if>
                                <c:if test="${not empty clienteLoggato || not empty venditoreLoggato}">
                                    <a href="login.html?logout=true"> Logout </a>
                                </c:if>
                            </ul>
                        </nav>
                    </div>
                </div>
            </header>

            <div id="contentForm">
                <h2 class="contentTitle"> Vendi </h2>
                <c:choose>
                    <c:when test="${not empty seller}">
                        <!--
                            Form per l'inserimento di un prodotto che un cliente vorrebbe vendere
                        -->
                        <div class="input-form" id="form">
                            <form method="get" action="venditore.html">
                                <!-- Inserimento nome oggetto -->
                                <label for="NomeOggetto"> Nome di cosa vorresi vendere: </label>
                                <input type="text" name="NomeOggetto" id="NomeOggetto"/>
                                <!-- Inserimento url foto oggetto -->
                                <label for="FotoOggetto"> Copiare la url della foto descrittiva: </label>
                                <input type="url" name="FotoOggetto" id="FotoOggetto"/>
                                <!-- Inserimento testo con descrizione oggetto -->
                                <label for="DescrizioneOggetto"> Descrizione: </label>
                                <textarea name="DescrizioneOggetto" id="DescrizioneOggetto"
                                          cols="40" rows="10"> Scrivi qui.. </textarea>
                                <!-- Inserimento prezzo oggetto -->
                                <label for="Prezzo"> Prezzo: </label>
                                <input type="number" name="Prezzo" id="Prezzo">
                                <!-- Inserimento descrizione oggetto -->
                                <label for="Quantità"> Quantità: </label>
                                <input type="number" name="Quantità" id="Quantità">
                                <!-- Pulsanti submit e reset -->
                                <input type="submit" name="submit" value="invia">
                                <input type="reset" name="reset" value="cancella">
                                
                                <c:if test="${not empty input_error}">
                                    <div> Dati non inseriti correttamente. Si prega di riprovare. </div>
                                </c:if>
                            </form>
                        </div>
                    </c:when>
                    <c:when test="${not empty prodottoInserito}">
                        <div>
                            <h2> Prodotto inserito!</h2>
                            <h3> Resoconto prodotto: </h3>
                            <p> Nome: ${prodottoInserito.name}</p>
                            <p> Immagine: </p>
                            <img src="${prodottoInserito.imgUrl}" alt="Foto" width="60" height="90"/>
                            <p> Prezzo: ${prodottoInserito.price}</p>
                            <p> Quantità: ${prodottoInserito.quantity}</p>
                            <p> Descrizione: ${prodottoInserito.description}</p>
                        </div>
                    </c:when>
                    <c:when test="${not empty login_error}">
                        <div> Se sei un venditore, effettua il login. </div>
                    </c:when>     
                </c:choose>
            </div>
            <jsp:include page="footer.jsp" />
        </div>
    </body>
</html>

