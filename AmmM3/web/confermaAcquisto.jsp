<%-- 
    Document   : confermaAcquisto
    Created on : 3-mag-2016, 9.53.23
    Author     : andrea
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="header.jsp" />
    </head>
    <body>        
        <div id="contentForm">
            <h3>Riepilogo</h3>
            <h3>Nome prodotto - ${prodotto.NomeOggetto}</h3> 
            <h3>Descrione - ${prodotto.DescrizioneOggetto}</h3>
            <h3>Prezzo - ${prodotto.Prezzo}</h3>
            <h3>Quantita - ${prodotto.Quantità}</h3>
            <h3>Immagine</h3><img title="${prodotto.NomeOggetto}" alt="${prodotto.DescrizioneOgetto}" src="${prodotto.FotoOggetto}" 
                     width="60" height="90">
            <c:choose>
                <c:when test="${cliente.getSaldo().getSaldo() > prodotto.getPrezzo()}" >
                    <h3>Il tuo saldo disponibile è ${cliente.getSaldo()}</h3>
                    <h3>Conferma acquisto</h3>
                    <button type="submit" name="Submit" value="invia">Clicca per proseguire</button>
                    </form>
                </c:when>
                <c:otherwise>
                    <h3>Non puoi proseguire. Prego controllare il saldo. </h3>
                    <h3>Il tuo saldo disponibile è ${cliente.getSaldo()}</h3>
                </c:otherwise>
            </c:choose>
        </div>
        <div>
            <jsp:include page="footer.jsp" />

        </div>
    </body>
</html>
