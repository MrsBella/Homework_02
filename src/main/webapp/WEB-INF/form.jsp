<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Formularz</title>
</head>
<body>
<form method="post">
    <label>
        Produkt:
        <input type="text" name="product"/> <br>
    </label>
    <label>
        Ilość:
        <input type="number" name="quantity"/> <br>
    </label>
    <label>
        Cena:
        <input type="number" name="price"><br>
    </label>
    <input type="submit" value="Dodaj produkt">
</form>
</body>
</html>
