<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Управління автомобілями</title>

    <link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">

    <script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<div class="container">
    <h1>Головна - Управління автомобілями</h1>
    <hr/>

    <h3>Всі автомобілі<a href="/admin/autos/add" type="button" class="btn btn-primary btn-sm">Додати</a></h3>

    <c:if test="${empty autoList}">
        <div class="alert alert-warning" role="alert">
            <span class="glyphicon glyphicon-info-sign" aria-hidden="true"></span>Auto таблиця пуста<a href="/admin/autos/add" type="button" class="btn btn-primary btn-sm">Додати</a>
        </div>
    </c:if>

    <c:if test="${!empty autoList}">
        <table class="table table-bordered table-striped">
            <tr>
                <th>ID</th>
                <th>Марка</th>
                <th>Модель</th>
                <th>Колір</th>
                <th>Рік виробництва</th>
                <th>Ціна</th>
                <th>Тип</th>
                <th>Місто</th>
                <th>Користувач</th>

            </tr>

            <c:forEach items="${autoList}" var="auto">
                <tr>
                    <td>${auto.id}</td>
                    <td>${auto.marka}</td>
                    <td>${auto.model}</td>
                    <td>${auto.color}</td>
                    <td>${auto.year}</td>
                    <td>${auto.price}</td>
                    <td>${auto.name_type}</td>
                    <td>${auto.city}</td>
                    <td>${auto.username}</td>
                    <td>
                        <a href="/admin/autos/show/${auto.id}" type="button" class="btn btn-sm btn-success">Переглянути</a>
                        <a href="/admin/autos/update/${auto.id}" type="button" class="btn btn-sm btn-warning">Змінити</a>
                        <a href="/admin/autos/delete/${auto.id}" type="button" onclick="return confirm('Натисніть ОК щоб видалити？')" class="btn btn-sm btn-danger">Видалити</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </c:if>
</div>

<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>

<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</body>
</html>
