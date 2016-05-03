<%-- 
    Document   : descrizione
    Created on : 26-apr-2016, 0.05.47
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
        <title> AG Movies&Books</title>
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
                <!--
                    Header con nome del sito
                -->
                <div id="header">
                    <h1> AG Movies&Books </h1>
                

                    <!--
                        Sezone di navigazione per il Login
                    -->
                    <div class="navigation">
                        <nav> 
                            <ul>
                                <li>
                                    <a href="login.jsp"> Login </a>
                                </li>
                            </ul>
                        </nav>
                    </div>
                </div>
            </header>
            
            <div id="sidebar">
                <!--
                    Sommario con link interni per favorire la navigazione sul sito
                -->
                <h2> Sommario </h2>
                <ol>
                    <li>
                        <a href="#welcome"> Benvenuto! </a>
                    </li>
                    <li>
                        <a href="#catalogue"> Catalogo </a>
                    </li>
                    <li>
                        <a href="#movies"> Film </a>
                    </li>
                    <li>
                        <a href="#books"> Libri </a>
                    </li>
                    <li>
                        <a href="#gadget"> Gadget </a>
                    </li>
                    <li>
                        <a href="#news"> Novità e Best Seller </a>
                    </li>
                    <li>
                        <a href="#gift"> Cofanetti e idee regalo </a>
                    </li>
                    <li>
                        <a href="#guide"> Guida all'acquisto </a>
                    </li>
                </ol>
            </div>
                <!-- 
                    Introduzione al sito 
                -->
            <div id="content">
                <h2 id="welcome"> Benvenuto! </h2>
                <p>
                    Benvenuto in AG Movies&Books, dove troverai migliaia di titoli di Dvd, Blu-Ray e libri, 
                    anche in anteprima mondiale. Spedizioni in tutto il globo. Film, serie tv, 
                    documentari, anime, cartoni animati ma anche best sellers, nuove uscite e i grandi classici,
                    tutto quello che cerchi lo troverai qua!
                    E' presente anche una sezione di vendita dell'usato, compriamo i vostri dvd, blu-ray o libri
                    supervalutandoli.
                    Per maggiori informazioni continuate a leggere, buona permanenza nel nostro sito!
                </p>

                <!-- 
                    Spiegazione sulla suddivisione degli acquisti 
                -->
                <h2 id="catalogue"> Catalogo </h2>
                <p>
                    Il nostro catalogo si divide in tre parti: vendita di Dvd e Blu-Ray, vendita di libri e 
                    vendita di gadget provenienti dai più famosi titoli cinematografici e non solo.
                    Accedi con un semplice click su Login e andando sulla sezione "Compra" scorri facilmente
                    il nostro catalogo e compra i nostri prodotti a prezzi imbattibili!
                </p>    

                <!--
                    Macrocategorie film
                -->
                <h2 id="movies"> Film </h2>
                <p>
                    I nostri titoli sono tantissimi e aspettano solo te, sfoglia la sezione principale del 
                    catalogo e troverai numerosissimi film, in Dvd o Blu-ray, aggiungi al carrello e potrai
                    ridere, piangere, emozionarti guardando i tuoi film preferiti. Le categorie che troverai
                    saranno principalmente (ma non solo):
                </p>
                <ul class="descrizione">
                    <li> Animazione </li>
                    <li> Avventura </li>
                    <li> Azione </li>
                    <li> Commedia </li>
                    <li> Documentario </li>
                    <li> Fantascienza </li>
                    <li> Fantasy </li>
                    <li> Horror </li>
                </ul>

                <!--
                    Macrocategorie libri
                -->
                <h2 id="books"> Libri </h2>
                <p>
                Tantissimi libri ti aspettano! Sfoglia il catalogo, aggiungi al carrello
                e buona lettura! Troverai (e non solo):
                </p>
                <ul class="descrizione">
                    <li> Arte e spettacolo </li>
                    <li> Avventura </li>
                    <li> Letteratura </li>
                    <li> Fantascienza </li>
                    <li> Fantasy </li>
                    <li> Giallo </li>
                    <li> Horror </li>
                    <li> Ragazzi </li>
                </ul>
                
                <!--
                    Sezione gadgets
                -->
                <h2 id="gadget"> Gadget </h2>
                <p>
                    E' presente una sezione in cui potrai comprare i gadget dei film più famosi. Vuoi l'Anello
                    della saga "Il Signore Degli Anelli" per una super proposta di matrimonio? Qua lo troverai! 
                    Vuoi padroneggiare la Morte? Acquista in offerta i Doni Della Morte dalla saga "Harry Potter".
                    Oppure preferisci travestirti da Spider-Man? Troverai tutto questo!
                </p>

                <!-- Particolari offerte promosse  -->
                <h3 id="news"> Novità e Best Seller</h3>
                <p>
                    Ogni settimana migliaia di nuovi titoli, anteprime, nuove edizioni ma anche i titoli
                    più famosi, vengono aggiunti a prezzi imbattibili al fine di permettere una completa 
                    esperienza d'acquisto, come se entraste di persona nel nostro negozio. 
                </p>

                <h3 id="gift"> Cofanetti e idee regalo </h3>
                <p>
                    Non sai cosa regalare? Trovrai nel nostro sito cofanetti delle più famose saghe 
                    e non solo. Sorprendi con regali originali e introvabili i tuoi amici, 
                    troverai le edizioni dei film e libri più famosi: Harry Potter, Ritorno Al Futuro, 
                    Hunger Games, Il Signore Degli Anelli, ma anche i film Marvel come Spiderman o la serie X-Men.
                </p>

                <!-- Semplici direttive per aiutare i nuovi utenti  -->
                <h3 id="guide"> Guida all'acquisto </h3>
                <p>
                    Esegui il Login per accedere a tutte le nostre funzionalità. Leggi la lista dei nostri titoli 
                    e aggiungi al carrello! Reso gratuito entro 30 giorni dalla data dell'acquisto. Scegli se 
                    comprare o vendere.
                </p>
            </div>
            <jsp:include page="footer.jsp" />
        </div>
    </body>
</html>
