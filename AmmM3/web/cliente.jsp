<%-- 
    Document   : cliente
    Created on : 26-apr-2016, 0.07.43
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
    <jsp:include page="header.jsp" />
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

            <div id="sidebar">
                <h2> Catalogo </h2>
                <!--
                    Link interni per accedere ai tre diversi cataloghi
                -->
                <ol>
                    <li>
                        <a href="#film"> Dvd e Blu-Ray </a>
                    </li>
                    <li>
                        <a href="#libri"> Libri </a>
                    </li>
                    <li>
                        <a href="#gadgets"> Gadgets </a>
                    </li>
                </ol>
            </div>

            <div id="content">
                <!--
                    Tabella con la merce della sezione dvd e blu-ray
                -->
                <div>
                    <table>
                        <caption id="film"> Dvd e Blu-Ray</caption>
                        <!-- Prima riga della tabella con le intestazioni--> 
                        <tr class="intestazione">
                            <th> Nome </th>
                            <th> Foto </th>
                            <th> Disponibili </th>
                            <th> Prezzo </th>
                            <th> Aggiungi al carrello </th>
                        </tr>
                        <!-- Seconda riga della tabella con le informazioni del primo oggetto--> 
                        <tr class="pari">
                            <td> Casper(1995)- DVD </td>
                            <td> 
                                <img src="img/Film/casper_dvd.jpg"
                                     title="Casper(1995)_DVD" alt="Casper(1995)_DVD"
                                     width="60" height="90">
                            </td>
                            <td> 18 </td>
                            <td> 13,99 </td>
                            <td>  
                                <a href="confermaAcquisto.jsp"> add </a>
                            </td>
                        </tr>
                        <!-- Terza riga della tabella con le informazioni del secondo oggetto--> 
                        <tr class="dispari">
                            <td> Hercules(1996)- DVD</td>
                            <td> 
                                <img src="img/Film/hercules_dvd.jpg"
                                     title="Hercules(1996)_DVD" alt="Hercules(1996)_DVD"
                                     width="60" height="90">
                            </td>
                            <td> 7 </td>
                            <td> 13,99 </td>
                            <td>  
                                <a href="confermaAcquisto.jsp"> add </a>
                            </td>
                        </tr>
                        <!-- Quarta riga della tabella con le informazioni del terzo oggetto--> 
                        <tr class="pari">
                            <td> American Sniper(2015)- Blu-Ray </td>
                            <td> 
                                <img src="img/Film/american_sniper_blu_ray.jpg"
                                     title="AmericanSniper(2015)_Blu-Ray" alt="AmericanSniper(2015)_Blu-Ray"
                                     width="60" height="90">
                            </td>
                            <td> 21 </td>
                            <td> 18,99 </td>
                            <td>  
                                <a href="confermaAcquisto.jsp"> add </a>
                            </td>
                        </tr>
                        <!-- Quinta riga della tabella con le informazioni del quarto oggetto--> 
                        <tr class="dispari">
                            <td> The Imitation Game(2015)- Blu-Ray </td>
                            <td> 
                                <img src="img/Film/the_imitation_game.jpg"
                                     title="TheImitationGame_Blu-Ray" alt="TheImitationGame_Blu-Ray"
                                     width="60" height="90">
                            </td>
                            <td> 9 </td>
                            <td> 18,99 </td>
                            <td>  
                                <a href="confermaAcquisto.jsp"> add </a>
                            </td>
                        </tr>
                        <!-- Sesta riga della tabella con le informazioni del quinto oggetto--> 
                        <tr class="pari">
                            <td> Harry Potter (saga completa)- Blu-Ray </td>
                            <td> 
                                <img src="img/Film/harry_potter_cofanetto.jpg"
                                     title="HarryPotter_Blu-Ray" alt="Harry_Potter_Blu-Ray"
                                     width="60" height="90">
                            </td>
                            <td> 11 </td>
                            <td> 19,89 </td>
                            <td>  
                                <a href="confermaAcquisto.jsp"> add </a>
                            </td>
                        </tr>
                        <!-- Settima riga riga della tabella con le informazioni del sesto oggetto--> 
                        <tr class="dispari">
                            <td> Ritorno Al Futuro (La Trilogia)- Blu-Ray </td>
                            <td> 
                                <img src="img/Film/ritorno_al_futuro_trilogia.jpeg"
                                     title="RitornoAlFuturo_Blu-Ray" alt="RitornoAlFuturo_Blu-Ray"
                                     width="60" height="90">
                            </td>
                            <td> 5 </td>
                            <td> 18,89 </td>
                            <td>  
                                <a href="confermaAcquisto.jsp"> add </a>
                            </td>
                        </tr>
                    </table>
                </div>

                <!--
                    Tabella con la merce della sezione libri
                -->
                <div>
                    <table>
                        <caption id="libri"> Libri </caption>
                        <!-- Intestazioni--> 
                        <tr class="intestazione">
                            <th> Nome </th>
                            <th> Foto </th>
                            <th> Disponibili </th>
                            <th> Prezzo </th>
                            <th> Aggiungi al carrello </th>
                        </tr>
                        <!-- Primo oggetto--> 
                        <tr class="pari">
                            <td> 1984 - Orwell </td>
                            <td> 
                                <img src="img/Libri/1984_book.jpg"
                                     title="1984" alt="1984"
                                     width="60" height="90">
                            </td>
                            <td> 13 </td>
                            <td> 8,99 </td>
                            <td>  
                                <a href="confermaAcquisto.jsp"> add </a>
                            </td>
                        </tr>
                        <!-- Secondo oggetto--> 
                        <tr class="dispari">
                            <td> Il Piccolo Principe - Antoine de Saint-Exupéry</td>
                            <td> 
                                <img src="img/Libri/il_piccolo_principe_book.jpeg"
                                     title="IlPIccoloPrincipe" alt="IlPIccoloPrincipe"
                                     width="60" height="90">
                            </td>
                            <td> 26 </td>
                            <td> 5,99 </td>
                            <td>  
                                <a href="confermaAcquisto.jsp"> add </a>
                            </td>
                        </tr>
                        <!-- Terzo oggetto--> 
                        <tr class="pari">
                            <td> Ventimila Leghe Sotto I Mari - Verne </td>
                            <td> 
                                <img src="img/Libri/ventimila_leghe_sotto_i_mari_book.jpg"
                                     title="VentimilaLegheSottoIMari" alt="VentimilaLegheSottoIMari"
                                     width="60" height="90">
                            </td>
                            <td> 4 </td>
                            <td> 6,89 </td>
                            <td>  
                                <a href="confermaAcquisto.jsp"> add </a>
                            </td>
                        </tr>
                        <!-- Quarto oggetto--> 
                        <tr class="dispari">
                            <td> Harry Potter(cofanetto 8 libri)- J.K. Rowling </td>
                            <td> 
                                <img src="img/Libri/harry_potter_cofanetto_books.jpg"
                                     title="HarryPotter" alt="HarryPotter"
                                     width="60" height="90">
                            </td>
                            <td> 7 </td>
                            <td> 54,89 </td>
                            <td>  
                                <a href="cliente.html"> add </a>
                            </td>
                        </tr>
                        <!-- Quinto oggetto--> 
                        <tr class="pari">
                            <td> Il Signore Degli Anelli(trilogia)- J.R.R. Tolkien </td>
                            <td> 
                                <img src="img/Libri/il_signore_degli_anelli_trilogia.jpeg"
                                     title="IlSignoreDegliAnelli" alt="IlSignoreDegliAnelli"
                                     width="60" height="90">
                            </td>
                            <td> 13 </td>
                            <td> 13,89 </td>
                            <td>  
                                <a href="confermaAcquisto.jsp"> add </a>
                            </td>
                        </tr>
                    </table>
                </div>

                <!--
                    Tabella con la merce della sezione gadget
                -->
                <div>
                    <table>
                        <caption id="gadgets"> Gadgets</caption>
                        <!-- Intestazioni--> 
                        <tr class="intestazione">
                            <th> Nome </th>
                            <th> Foto </th>
                            <th> Disponibili </th>
                            <th> Prezzo </th>
                            <th> Aggiungi al carrello </th>
                        </tr>
                        <!-- Primo oggetto--> 
                        <tr class="pari">
                            <td> Collana Doni Della Morte - Harry Potter </td>
                            <td> 
                                <img src="img/Gadgets/collana_doni_della_morte.jpg"
                                     title="DoniDellaMorte" alt="DoniDellaMorte"
                                     width="60" height="90">
                            </td>
                            <td> 15 </td>
                            <td> 7,50 </td>
                            <td>  
                                <a href="confermaAcquisto.jsp"> add </a>
                            </td>
                        </tr>
                        <!-- Secondo oggetto--> 
                        <tr class="dispari">
                            <td> L'Unico Anello - Il Signore Degli Anelli</td>
                            <td> 
                                <img src="img/Gadgets/unico_signore_degli_anelli.jpg"
                                     title="Unico" alt="Unico"
                                     width="60" height="90">
                            </td>
                            <td> 23 </td>
                            <td> 9,99 </td>
                            <td>  
                                <a href="cliente.html"> add </a>
                            </td>
                        </tr>
                        <!-- Terzo oggetto--> 
                        <tr class="pari">
                            <td> Costume Spiderman </td>
                            <td> 
                                <img src="img/Gadgets/spiderman_costume.jpg"
                                     title="Spiderman" alt="Spiderman"
                                     width="60" height="90">
                            </td>
                            <td> 6 </td>
                            <td> 19,89 </td>
                            <td>  
                                <a href="confermaAcquisto.jsp"> add </a>
                            </td>
                        </tr>
                    </table>  
                </div>
            </div> 
            <jsp:include page="footer.jsp" />
        </div>
    </body>
</html>
