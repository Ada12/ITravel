<?xml version="1.0" encoding="UTF-8"?>

<!--
    Document   : scenerylist.xsl
    Created on : 2015年4月15日, 上午11:22
    Author     : yangchen
    Description:
        Purpose of transformation follows.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html" encoding="iso-8859-1" indent="yes"/>

    <!-- TODO customize transformation rules 
         syntax recommendation http://www.w3.org/TR/xslt 
    -->
    <xsl:template match="/">
        <html>
            <head>
                <link href="resource/sceneryList.css" rel="stylesheet"/>
                <link href="resource/bootstrap.css" rel="stylesheet"/>
                <title>景点列表</title>
            </head>
            <body>
                <h1>
                    <div style="text-align: center">景点列表</div>
                </h1>
                <div class='container theme-showcase'> 
                    <div class='container-fluid'>
                        <div class='row-fluid'>
                            <div class='span12'>
                                <form class="form-signin" style="margin-right: 1px;" action="SearchScenery" method="POST">
                                    <input class="form-control" placeholder="景点名称" name="sceneryName" type="text"/>
                                    <input class="btn btn-lg btn-primary btn-block" type="submit" value="搜索" name="submit"/>
                                </form>                       
                                <xsl:for-each select="SceneryObjectList/SceneryLists/SceneryList">
                                    <ul style='list-style-type:none' class='thumbnails'>
                                        <div class='column'>
                                            <div class='col-sm-6 col-md-4'>
                                                <li class='span4'>
                                                    <div class='thumbnail'>
                                                        <xsl:element name="img">
                                                            <xsl:attribute name="src">
                                                                <xsl:value-of select="imgurl"></xsl:value-of>
                                                            </xsl:attribute>
                                                            <xsl:attribute name="width">800px</xsl:attribute>
                                                            <xsl:attribute name="height">800px</xsl:attribute>
                                                        </xsl:element>
                                                        <div class='caption'>
                                                            景点名称:
                                                            <xsl:element name="a">
                                                                <xsl:attribute name="href">TravelInfo?sid=<xsl:value-of select="sid"/>_<xsl:value-of select="title"/>_<xsl:value-of select="address"/>
                                                                </xsl:attribute>
                                                                <xsl:value-of select="title"></xsl:value-of>
                                                            </xsl:element>
                                                            <br/>   
                                                            景点级别：<xsl:value-of select="grade"></xsl:value-of>
                                                            <br/>
                                                            最低票价：<xsl:value-of select="price_min"></xsl:value-of>
                                                            <br/>
                                                            点评数：<xsl:value-of select="comm_cnt"></xsl:value-of>
                                                            <br/>
                                                            城市：<xsl:value-of select="city_id"></xsl:value-of>
                                                            <br/>
                                                            地址：<xsl:value-of select="address"></xsl:value-of>
                                                            <br/>
                                                            <xsl:element name="a">
                                                                <xsl:attribute name="href">
                                                                    <xsl:value-of select="url"></xsl:value-of>
                                                                </xsl:attribute>
                                                                访问主页
                                                            </xsl:element>
                                                        </div>     
                                                    </div>
                                                </li>
                                            </div>
                                        </div>
                                    </ul>                                                
                                </xsl:for-each>
                                <nav>
                                    <ul class="pagination pagination-lg">
                                        <li>
                                            <a href="SceneryListServlet?page=1">1</a>
                                        </li>
                                        <li>
                                            <a href="SceneryListServlet?page=2">2</a>
                                        </li>
                                        <li>
                                            <a href="SceneryListServlet?page=3">3</a>
                                        </li>
                                        <li>
                                            <a href="SceneryListServlet?page=4">4</a>
                                        </li>
                                        <li>
                                            <a href="SceneryListServlet?page=5">5</a>
                                        </li>
                                        <li>
                                            <a href="SceneryListServlet?page=6">6</a>
                                        </li>
                                        <li>
                                            <a href="SceneryListServlet?page=7">7</a>
                                        </li>
                                        <li>
                                            <a href="SceneryListServlet?page=8">8</a>
                                        </li>
                                    </ul>
                                </nav>
                            </div>
                        </div>
                    </div>
                </div>
            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>
