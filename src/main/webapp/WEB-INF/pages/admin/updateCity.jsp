<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Оновлення даних про міста</title>

    <link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">

    <script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<div class="container">
    <h1>Головна - Оновлення даних про міста</h1>
    <hr/>

    <form:form action="/admin/citys/updateP" method="post" commandName="cityP" role="form">
        <div class="form-group">
            <label for="city">Місто:</label>
            <input type="text" class="form-control" id="city" name="city" placeholder="Назва міста:"
                   value="${city.city}"/>
        </div>
        <div class="form-group">
            <label for="region">Регіон:</label>
            <input type="text" class="form-control" id="region" name="region" placeholder="Назва області:"
                   value="${city.region}"/>
        </div>

        <input type="hidden" id="id" name="id" value="${city.id}"/>

        <div class="form-group">
            <button type="submit" class="btn btn-sm btn-success">Змінити</button>
        </div>
    </form:form>
</div>

<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>

<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</body>
</html>
