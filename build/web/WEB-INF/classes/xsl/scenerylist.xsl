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
                <title>景点列表</title>
            </head>
            <body>
                <h2>景点列表</h2>
                <xsl:for-each select="SceneryObjectList/SceneryLists/SceneryList">
                        景点名称：<xsl:value-of select="title"></xsl:value-of>
                        景点级别：<xsl:value-of select="grade"></xsl:value-of>
                        最低票价：<xsl:value-of select="price_min"></xsl:value-of>
                        点评数：<xsl:value-of select="comm_cnt"></xsl:value-of>
                        城市：<xsl:value-of select="city_id"></xsl:value-of>
                        地址：<xsl:value-of select="address"></xsl:value-of>
                        景点id：<xsl:value-of select="sid"></xsl:value-of>
                        <xsl:element name="a">
                            <xsl:attribute name="href">
                                <xsl:value-of select="url"></xsl:value-of>
                            </xsl:attribute>
                            访问主页</xsl:element>
                        景点图片：
                        <xsl:element name="img">
                            <xsl:attribute name="src">
                                <xsl:value-of select="imgurl"></xsl:value-of>
                            </xsl:attribute>
                        </xsl:element>
                </xsl:for-each>
            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>
