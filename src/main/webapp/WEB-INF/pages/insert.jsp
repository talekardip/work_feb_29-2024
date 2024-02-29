<%--
  Created by IntelliJ IDEA.
  User: diptalek
  Date: 29-02-2024
  Time: 15:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>insert product</title>
</head>
<body>
    <h1>insert product</h1>
    <form action="<%=request.getContextPath()%>/insert" method="post" modelAtrribute="product">
        productId : <input type="number" name="prodId" placeholder="enter product id"><br>
        product name : <input type="text" name="prodName" placeholder="enter product name"><br>
        product description : <input type="text" name="prodDesc" placeholder="enter product desc"><br>
        product price : <input type="number" name="price" placeholder="enter product price"><br>
        <br>
        <input type="submit" value="Insert">
    </form>
</body>
</html>
