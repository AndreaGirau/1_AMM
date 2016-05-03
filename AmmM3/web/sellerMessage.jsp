<%-- 
    Document   : sellerMessage
    Created on : 28-apr-2016, 8.58.46
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
            <h1>Inserimento prodotto avvenuto con successo!</h1>
            <p>
                Se desidera continuare a vendere con noi,
                attraverso il link sottostante può tornare alla pagina di form.
                Grazie!
            </p>
        </div>
        <div>
            <li>
                <a href="venditore.jsp"> Clicca qui. </a>
            </li>
        </div>
        <jsp:include page="footer.jsp" />
    </body>
</html>
