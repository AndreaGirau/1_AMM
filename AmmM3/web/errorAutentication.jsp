<%-- 
    Document   : errorAutentication
    Created on : 27-apr-2016, 23.07.15
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
            <h1> Autentication Error</h1>
            <p>
                Siamo spiacenti, si è verificato un errore
                durante l'autenticazione. Si prega di riprovare.
            </p>
        </div>
        <div>
            <li>
                <a href="./Login"> Clicca qui per riprovare. </a>
            </li>
        </div>
        <div>
        <jsp:include page="footer.jsp" />
    </body>
</html>
