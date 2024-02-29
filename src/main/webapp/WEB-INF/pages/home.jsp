<%@ page import="com.training.springmvc.model.Product" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <%--<title>JSP - Hello World</title>--%>
    <title>JSP - Registration</title>
</head>
<body>

<h1>Welcome to JSP</h1>

<hr>

<% List<Product> prodList = (List<Product>)request.getAttribute("prodList");
%>
<h2><%=prodList.get(1).getProdName()%></h2>
</body>
</html>