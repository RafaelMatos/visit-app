<%-- 
    Document   : cadastro
    Created on : 29/01/2019, 12:16:46
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
        <h1>Cadastrar Visita</h1>
        <p>Ola, <%= request.getAttribute("matricula") %></p>
        <form action="visit" method="POST">
                
                Nome:<br>
                <input type="text" name="nome" placeholder="Nome visitante">
                <br>
                Sobrenome:<br>
                <input type="text" name="sobrenome" placeholder="Sobrenome">
                <br>
                CPF:<br>
                <input type="text" name="cpf"  placeholder="xxx.xxx.xxx-xx" maxlength="14"><br>
                <input type="submit" value="Cadastrar">     
    </body>
</html>
