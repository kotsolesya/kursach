<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Додавання автомобілів</title>

    <link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">

    <script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<div class="container">
    <h1>Головна - Додавання автомобілів</h1>
    <hr/>
    <form:form action="/admin/autos/addP" method="post" commandName="auto" role="form">
        <div class="form-group">
            <label for="marka">Марка авто:</label>
            <input type="text" class="form-control" id="marka" name="marka" placeholder="Марка:"/>
        </div>
        <div class="form-group">
            <label for="model">Модель авто:</label>
            <input type="text" class="form-control" id="model" name="model" placeholder="Модель:"/>
        </div>
        <div class="form-group">
            <label for="color">Колір:</label>
            <input type="text" class="form-control" id="color" name="color" placeholder="Колір:"/>
        </div>
        <div class="form-group">
            <label for="year">Рік випуску:</label>
            <input type="text" class="form-control" id="year" name="year" placeholder="Рік випуску:"/>
        </div>
        <div class="form-group">
            <label for="price">Ціна:</label>
            <input type="text" class="form-control" id="price" name="price" placeholder="Ціна в у.о. :"/>
        </div>
        <div class="form-group">
            <label for="name_type">Тип авто:</label>
            <input type="text" class="form-control" id="name_type" name="name_type" placeholder="Тип авто:"/>
        </div>
        <div class="form-group">
            <label for="city">Місто:</label>
            <input type="text" class="form-control" id="city" name="city" placeholder="Назва міста:"/>
        </div>
        <div class="form-group">
            <label for="username">Користувач:</label>
            <input type="text" class="form-control" id="username" name="username" placeholder="Логін користувача:"/>
        </div>
        <div class="form-group">
            <button type="submit" class="btn btn-sm btn-success">Додати</button>
        </div>
    </form:form>
</div>

<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>

<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</body>
</html>
