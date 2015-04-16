<?xml version="1.0" encoding="UTF-8"?>

<!--
    Document   : travel.xsl
    Created on : 2015年4月16日, 下午10:21
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
                <title>景点详情</title>
            </head>
            <body>
                <h2>景点详情</h2>
                城市：<xsl:value-of select="Travel/travelCity"></xsl:value-of>
                景点名称：<xsl:value-of select="Travel/travelTitle"></xsl:value-of>
                <xsl:for-each select="Travel/listScenery">
                    主题： <xsl:value-of select="title"></xsl:value-of>
                    <xsl:element name="img">
                        <xsl:attribute name="src">
                            <xsl:value-of select="imgurl"></xsl:value-of>
                        </xsl:attribute>
                    </xsl:element>
                    简介：<xsl:value-of select="referral"></xsl:value-of>
                </xsl:for-each>
                <h2>天气</h2>
                状况：<xsl:value-of select="Travel/weather/status1"></xsl:value-of>
                风向：<xsl:value-of select="Travel/weather/direction"></xsl:value-of>
                风力：<xsl:value-of select="Travel/weather/power1"></xsl:value-of>
                最高温度：<xsl:value-of select="Travel/weather/temperature1"></xsl:value-of>
                最低温度：<xsl:value-of select="Travel/weather/temperature2"></xsl:value-of>
                体感指数：<xsl:value-of select="Travel/weather/ssd"></xsl:value-of>,<xsl:value-of select="Travel/weather/ssd_s"></xsl:value-of>
                紫外线指数：<xsl:value-of select="Travel/weather/zwx"></xsl:value-of>,<xsl:value-of select="Travel/weather/zwx_1"></xsl:value-of>
                空调指数：<xsl:value-of select="Travel/weather/ktk"></xsl:value-of>,<xsl:value-of select="Travel/weather/ktk_s"></xsl:value-of>
                污染指数：<xsl:value-of select="Travel/weather/pollution"></xsl:value-of>,<xsl:value-of select="Travel/weather/pollution_s"></xsl:value-of>
                洗车指数：<xsl:value-of select="Travel/weather/xcz"></xsl:value-of>,<xsl:value-of select="Travel/weather/xcz_s"></xsl:value-of>
                穿衣指数：<xsl:value-of select="Travel/weather/chy"></xsl:value-of>,<xsl:value-of select="Travel/weather/chy_shuoming"></xsl:value-of>
                感冒指数：<xsl:value-of select="Travel/weather/gm"></xsl:value-of>,<xsl:value-of select="Travel/weather/gm_s"></xsl:value-of>
                运动指数：<xsl:value-of select="Travel/weather/yd"></xsl:value-of>，<xsl:value-of select="Travel/weather/yd_1"></xsl:value-of>
                <h2>餐厅</h2>
                <xsl:for-each select="Travel/listRestaurant">
                    名称： <xsl:value-of select="name"></xsl:value-of>
                    地址：<xsl:value-of select="address"></xsl:value-of>
                    电话：<xsl:value-of select="telephone"></xsl:value-of>
                </xsl:for-each>
                <h2>银行</h2>
                <xsl:for-each select="Travel/listBank">
                    名称： <xsl:value-of select="name"></xsl:value-of>
                    地址：<xsl:value-of select="address"></xsl:value-of>
                    电话：<xsl:value-of select="telephone"></xsl:value-of>
                </xsl:for-each>
                <xsl:for-each select="Travel/listHotel">
                    名称： <xsl:value-of select="name"></xsl:value-of>
                    地址：<xsl:value-of select="address"></xsl:value-of>
                    星级：<xsl:value-of select="className"></xsl:value-of>
                    简介：<xsl:value-of select="intro"></xsl:value-of>
                    满意度：<xsl:value-of select="satisfaction"></xsl:value-of>
                    酒店图片：
                        <xsl:element name="img">
                            <xsl:attribute name="src">
                                <xsl:value-of select="largePic"></xsl:value-of>
                            </xsl:attribute>
                        </xsl:element>
                    <xsl:element name="a">
                            <xsl:attribute name="href">
                                <xsl:value-of select="url"></xsl:value-of>
                            </xsl:attribute>
                            访问主页
                    </xsl:element>
                </xsl:for-each>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
