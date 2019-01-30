<%-- 
    Document   : visit
    Created on : 29/01/2019, 17:18:28
    Author     : work
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        Nome : <%= request.getAttribute("completo")%><br>
        CPF : <%= request.getAttribute("cpf")%><br>
        Horario de entrada: <%= request.getAttribute("entrada")%><br>
        Horario da saida: <%= request.getAttribute("saida")%>
    </body>
</html>
