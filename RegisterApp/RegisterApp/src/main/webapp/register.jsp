<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<title>User Registration Form</title>
    <script>
        function showBrowserModel() {
            var userAgent = navigator.userAgent;
            alert("Your browser model: " + userAgent);
        }
    </script>
</head>
<body>
    <h2>User Registration Form</h2>
    <form action="UserRegister" method="post">
        <label for="name">Ad:</label><br>
        <input type="text" id="name" name="name"><br>
        <label for="surname">Soyad:</label><br>
        <input type="text" id="surname" name="surname"><br>
        <label for="email">Eposta:</label><br>
        <input type="email" id="email" name="email"><br>
        <label for="password">Şifre:</label><br>
        <input type="password" id="password" name="password"><br><br>
        <input type="submit" value="Kayıt Ol">
        
    </form>
    <button onclick="showBrowserModel()">Tarayıcı Modelini Göster</button>
</body>
</html>