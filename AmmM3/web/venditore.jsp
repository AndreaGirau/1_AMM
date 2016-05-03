<%-- 
    Document   : venditore
    Created on : 26-apr-2016, 0.08.26
    Author     : andrea
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <jsp:include page="header.jsp" />
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
                                    <a href="descrizione.jsp"> Home </a>
                                </li>
                                <li>
                                    <a href="login.jsp"> Login </a>
                                </li>
                            </ul>
                        </nav>
                    </div>
                </div>
            </header>

            <div id="contentForm">
                <h2 class="contentTitle"> Vendi </h2>
                <!--
                    Form per l'inserimento di un prodotto che un cliente vorrebbe vendere
                -->
                <div class="input-form" id="form">
                    <form method="post" action="Seller">
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
                        <input type="submit" name="Submit" value="invia">
                        <input type="reset" name="Reset" value="cancella">
                    </form>
                </div>
            </div>
            <jsp:include page="footer.jsp" />
        </div>
    </body>
</html>

