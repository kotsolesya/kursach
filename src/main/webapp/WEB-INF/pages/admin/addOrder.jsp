<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Додавання ордерів</title>

    <link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">

    <script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<div class="container">
    <h1>Головна - Додавання ордерів</h1>
    <hr/>
    <form:form action="/admin/orders/addP" method="post" commandName="order" role="form">
        <div class="form-group">
            <label for="name_order">Назва ордеру:</label>
            <input type="text" class="form-control" id="name_order" name="name_order" placeholder="Купівля/продаж:"/>
        </div>
        <div class="form-group">
            <label for="id_auto">ID авто:</label>
            <input type="text" class="form-control" id="id_auto" name="id_auto" placeholder="ID авто:"/>
        </div>
        <div class="form-group">
            <label for="id_user">ID користувача:</label>
            <input type="text" class="form-control" id="id_user" name="id_user" placeholder="ID користувача:"/>
        </div>
        <div class="form-group">
            <label for="city">Місто:</label>
            <input type="text" class="form-control" id="city" name="city" placeholder="Назва міста:"/>
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
