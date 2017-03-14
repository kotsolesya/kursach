<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Відомості про автомобілі</title>

    <link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">

    <script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<div class="container">
    <h1>Головна - Відомості про автомобілі</h1>
    <hr/>

    <table class="table table-bordered table-striped">
        <tr>
            <th>ID</th>
            <td>${auto.id}</td>
        </tr>
        <tr>
            <th>Марка авто</th>
            <td>${auto.marka}</td>
        </tr>
        <tr>
            <th>Модель авто</th>
            <td>${auto.model}</td>
        </tr>
        <tr>
            <th>Колір</th>
            <td>${auto.color}</td>
        </tr>
        <tr>
            <th>Рік випуску</th>
            <td>${auto.year}</td>
        </tr>
        <tr>
            <th>Ціна</th>
            <td>${auto.price}</td>
        </tr>
        <tr>
            <th>Тип авто</th>
            <td>${auto.name_type}</td>
        </tr>
        <tr>
            <th>Місто</th>
            <td>${auto.city}</td>
        </tr>
        <tr>
            <th>Користувач</th>
            <td>${auto.username}</td>
        </tr>
    </table>
</div>

<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>

<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</body>
</html>