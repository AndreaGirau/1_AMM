<%-- 
    Document   : login
    Created on : 26-apr-2016, 0.06.54
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
                                    <a href="descrizione.jsp"> Home </a>
                                </li>
                                <li>
                                    <a href="cliente.jsp"> Compra </a>
                                </li>
                                <li> 
                                    <a href="venditore.jsp"> Vendi </a>
                                </li>
                            </ul>
                        </nav>
                    </div>
                </div>
            </header>

            <div id="contentForm">
                <h2 class="contentTitle"> Login </h2>
                <div class="input-form" id="form">
                    <form method="post" action="Login">
                        <!-- Inserimento username -->
                        <label> Username: </label>
                        <input type="text" name="Username" value="Username"/>
                        <!-- Inserimento password -->
                        <label> Password: </label>
                        <input type="password" name="Password" value="Password"/>
                        <!-- Pulsanti submit e reset per user e password -->
                        <input type="submit" name="Submit" value="invia">
                        <input type="reset" name="Reset" value="cancella">  
                    </form>
                </div>
            </div>    
            <jsp:include page="footer.jsp" />
        </div>
    </body>
</html>
