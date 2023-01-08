<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1 style="text-align:center">Crokomo</h1>

<form:form action="${pageContext.request.contextPath }/autenticacionUsuario" method="POST">

<p>

Usuario: <input type="text" name="username"/>

</p>

<p>

Contraseña: <input type="password" name="password"/>

</p>

<input type="submit" value="Entrar"/>

</form:form>

</body>
</html>