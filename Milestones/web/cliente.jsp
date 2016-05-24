<%-- 
    Document   : cliente
    Created on : 19-mag-2016, 14.53.36
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
        <title> AG Movies&Books Compra </title>
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
                                    <a href="login.html"> Login </a>
                                </c:if>
                                <c:if test="${not empty clienteLoggato || not empty venditoreLoggato}">
                                    <a href="login.html?logout=true"> Logout </a>
                                </c:if>
                            </ul>
                        </nav>
                    </div>
                </div>
            </header>

            <div id="sidebar">
                <h2> Catalogo </h2>
                <!--
                    Link interni per accedere ai tre diversi cataloghi
                -->
                <ol>
                    <li>
                        <a href="#filmLibriGadget"> Dvd e Blu-Ray </a>
                    </li>
                    <li>
                        <a href="#filmLibriGadget"> Libri </a>
                    </li>
                    <li>
                        <a href="#filmLibriGadget"> Gadgets </a>
                    </li>
                </ol>
            </div>

            <div id="content">
                <c:choose>
                    <c:when test="${not empty login_error}">
                        <div> Se sei un cliente, effettua il login. </div>
                    </c:when>
                    <c:when test="${not empty cliente && empty dettagliProdotto}">
                        <!--
                            Rispetto alle milestone precedenti ho preferito accorpare le tabelle
                            così da facilitare l'accesso alla lista prodotti
                        -->
                        <div>
                            <table>
                                <caption id="filmLibriGadget"> Film, Libri e Gadget </caption>
                                <!-- Prima riga della tabella con le intestazioni--> 
                                <tr class="intestazione">
                                    <th> Nome </th>
                                    <th> Foto </th>
                                    <th> Disponibili </th>
                                    <th> Prezzo </th>
                                    <th> Aggiungi al carrello </th>
                                </tr>
                                <!-- Lista in tabelle dei prodotti -->
                                <c:forEach var="prodotto" items="${listaProdotti}">
                                    <tr>
                                        <td>${prodotto.name}</td>
                                        <td><img alt="Foto" src="${prodotto.imgUrl}" width="60" height="90"></td>
                                        <td>${prodotto.quantity}</td>
                                        <td>${prodotto.price}</td>
                                        <td><a href="cliente.html?idProdotto=${prodotto.id}"> add </a></td>
                                    </tr>   
                                </c:forEach>
                            </table>
                        </div>
                    </c:when>
                    <c:when test="${not empty dettagliProdotto && not empty cliente}">
                        <div id="acquisto">
                            <h3> Oggetto Selezionato: </h3>
                            <p>Nome: ${dettagliProdotto.name}</p>
                            <p>Immagine: <img src="${dettagliProdotto.imgUrl}" alt="Foto" width="60" height="90"/>
                            </p>
                            <p>Prezzo: ${dettagliProdotto.price}</p>
                            <p>Quantità: ${dettagliProdotto.quantity}</p>
                            <p>Descrizione: ${dettagliProdotto.description}</p>
                            <a href="cliente.html?idProdottoComprato=${dettagliProdotto.id}"> Prosegui con l'acquisto </a>
                        </div>
                    </c:when>
                    <c:when test="${not empty cliente && not empty acquistato}">
                        <div> La transazione è andata a buon fine! </div>
                    </c:when>
                    <c:when test="${not empty cliente && not empty nonAcquistato}">
                        <div> Mi dispiace, non hai abbastanza fondi! </div>
                    </c:when>
                </c:choose>    
            </div>
            <jsp:include page="footer.jsp" />
        </div>
    </body>
</html>