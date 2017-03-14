<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Управління ордерами</title>

    <link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">

    <script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<div class="container">
    <h1>Головна - Управління ордерами</h1>
    <hr/>

    <h3>Всі ордери<a href="/admin/orders/add" type="button" class="btn btn-primary btn-sm">Додати</a></h3>

    <c:if test="${empty orderList}">
        <div class="alert alert-warning" role="alert">
            <span class="glyphicon glyphicon-info-sign" aria-hidden="true"></span>Order таблиця пуста<a href="/admin/orders/add" type="button" class="btn btn-primary btn-sm">Додати</a>
        </div>
    </c:if>

    <c:if test="${!empty orderList}">
        <table class="table table-bordered table-striped">
            <tr>
                <th>ID</th>
                <th>Тип ордеру</th>
                <th>ID авто</th>
                <th>ID користувача</th>
                <th>Місто</th>

            </tr>

            <c:forEach items="${orderList}" var="order">
                <tr>
                    <td>${order.id}</td>
                    <td>${order.name_order}</td>
                    <td>${order.autoByAutoId}</td>
                    <td>${order.userByUserId}</td>
                    <td>${order.cityByCityId}</td>
                    <td>
                        <a href="/admin/orders/show/${order.id}" type="button" class="btn btn-sm btn-success">Переглянути</a>
                        <a href="/admin/orders/update/${order.id}" type="button" class="btn btn-sm btn-warning">Змінити</a>
                        <a href="/admin/orders/delete/${order.id}" type="button" onclick="return confirm('Натисніть ОК щоб видалити？')" class="btn btn-sm btn-danger">Видалити</a>
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
