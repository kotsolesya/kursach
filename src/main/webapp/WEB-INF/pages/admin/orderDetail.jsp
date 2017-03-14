<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Відомості про ордер</title>

    <link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">

    <script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<div class="container">
    <h1>Головна - Відомості про ордер</h1>
    <hr/>

    <table class="table table-bordered table-striped">
        <tr>
            <th>ID</th>
            <td>${order.id}</td>
        </tr>
        <tr>
            <th>Тип ордеру</th>
            <td>${order.name_order}</td>
        </tr>
        <tr>
            <th>ID авто</th>
            <td>${order.autoByAutoId}</td>
        </tr>
        <tr>
            <th>ID користувача</th>
            <td>${order.userByUserId}</td>
        </tr>
        <tr>
            <th>Місто</th>
            <td>${order.cityByCityId}</td>
        </tr>
    </table>
</div>

<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>

<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</body>
</html>