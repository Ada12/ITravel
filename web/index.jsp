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
        <title>JSP Page</title>
    </head>
    <body>
        <form action="SceneryListServlet" method="POST">
            城市：<input name="cityName" type="text">
            <br/>
            <input type="submit" value="查询" name="submit"/>
        </form>
    </body>
</html>
