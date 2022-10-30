<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
welcome to springboot<br>
creating new account<br>
<form action = "createAlien" method = "Post">
Enter your Id : <input type = "text" name = "aid"><br>
Enter your name : <input type = "text" name = "aname"><br>
<input type="submit"><br>
</form>
find by id:<br>
<form action = "getAlien" method="get">
Enter your Id : <input type = "text" name = "aid"><br>

<input type="submit">
</form>
show all aliens
<form action = "getAliens">
<input type = "submit" value = "show ">
</body>
</html>