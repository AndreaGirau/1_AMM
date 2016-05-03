<%-- 
    Document   : confermaInserimento
    Created on : 3-mag-2016, 0.21.49
    Author     : andrea
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
     <jsp:include page="header.jsp" />
    <body>
        <div id="contentForm">
            <div>
                <h2>Riepilogo</h2>
                <h2>Nome prodotto - </h2><h3>${nuovoProdotto.nomeProdotto}</h3> 
                <h2>Immagine - </h2><h3>${nuovoProdotto.FotoOggetto}</h3>
                <h2>Descrione - </h2><h3>${nuovoProdotto.DescrizioneOggetto}</h3>
                <h2>Prezzo - </h2><h3>${nuovoProdotto.Prezzo}</h3>
                <h2>Quantita - </h2><h3>${nuovoProdotto.Quantità}</h3>
            </div>           
        <jsp:include page="footer.jsp" />
    </body>
</html>

