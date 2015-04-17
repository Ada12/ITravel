<%-- 
    Document   : index
    Created on : 2015-4-6, 19:35:53
    Author     : yangchen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="resource/search.css" rel="stylesheet">
        <link href="resource/bootstrap.css" rel="stylesheet">

        <title>ITravel</title>
    </head>
    <body>
        <div class="container">
            
            <form class="form-signin" action="SceneryListServlet" method="POST">
            <h2 class="form-signin-heading">请搜索：</h2>
                <input class="form-control" placeholder="城市" name="cityName" type="text">
            <br/>
            <input class="btn btn-lg btn-primary btn-block" type="submit" value="查询" name="submit"/>
        </form>
        </div>
    </body>
</html>
