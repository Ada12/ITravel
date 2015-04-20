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
                <link href="resource/tab.css" rel="stylesheet"/>
                <link href="resource/bootstrap.css" rel="stylesheet"/>
                <title>景点详情</title>
            </head>
            <body>
                <div id="tab">
                    <input type="radio" checked="checked" name="tab" id="label01" />
                    <input type="radio" name="tab" id="label02" />
                    <input type="radio" name="tab" id="label03" />
                    <input type="radio" name="tab" id="label04" />
  
                    <div id="opt">
                        <label class="bg1" for="label01">景点详情</label>
                        <label class="bg2" for="label02">天气</label>
                        <label class="bg3" for="label03">餐厅/银行</label>
                        <label class="bg4" for="label04">酒店</label>
                    </div>
                    <ul id="content" style="padding-left: 0px">
                        <li class="bg1">
                            <h2>城市:<strong><xsl:value-of select="Travel/travelCity"></xsl:value-of></strong></h2>
                            <br/>
                            <h3>景点名称：<xsl:value-of select="Travel/travelTitle"></xsl:value-of></h3><br/>
                            <xsl:for-each select="Travel/listScenery">
                                <h4>
                                    <strong>主题： <xsl:value-of select="title"></xsl:value-of></strong>
                                    <br/>
                                简介：<xsl:value-of select="referral"></xsl:value-of><br/><br/>
                                <xsl:element name="img">
                                    <xsl:attribute name="src">
                                        <xsl:value-of select="imgurl"></xsl:value-of>
                                    </xsl:attribute>
                                </xsl:element></h4><br/>  
                            </xsl:for-each>
                        </li>
                        <li class="bg2">
                            <h2>天气</h2>
                            <h4>
                            状况：<xsl:value-of select="Travel/weather/status1"></xsl:value-of><br/>
                            风向：<xsl:value-of select="Travel/weather/direction"></xsl:value-of><br/>
                            风力：<xsl:value-of select="Travel/weather/power1"></xsl:value-of><br/>
                            最高温度：<xsl:value-of select="Travel/weather/temperature1"></xsl:value-of><br/>
                            最低温度：<xsl:value-of select="Travel/weather/temperature2"></xsl:value-of><br/>
                            体感指数：<xsl:value-of select="Travel/weather/ssd"></xsl:value-of>,<xsl:value-of select="Travel/weather/ssd_s"></xsl:value-of><br/>
                            紫外线指数：<xsl:value-of select="Travel/weather/zwx"></xsl:value-of>,<xsl:value-of select="Travel/weather/zwx_1"></xsl:value-of><br/>
                            空调指数：<xsl:value-of select="Travel/weather/ktk"></xsl:value-of>,<xsl:value-of select="Travel/weather/ktk_s"></xsl:value-of><br/>
                            污染指数：<xsl:value-of select="Travel/weather/pollution"></xsl:value-of>,<xsl:value-of select="Travel/weather/pollution_s"></xsl:value-of><br/>
                            洗车指数：<xsl:value-of select="Travel/weather/xcz"></xsl:value-of>,<xsl:value-of select="Travel/weather/xcz_s"></xsl:value-of><br/>
                            穿衣指数：<xsl:value-of select="Travel/weather/chy"></xsl:value-of>,<xsl:value-of select="Travel/weather/chy_shuoming"></xsl:value-of><br/>
                            感冒指数：<xsl:value-of select="Travel/weather/gm"></xsl:value-of>,<xsl:value-of select="Travel/weather/gm_s"></xsl:value-of><br/>
                            运动指数：<xsl:value-of select="Travel/weather/yd"></xsl:value-of>，<xsl:value-of select="Travel/weather/yd_1"></xsl:value-of><br/>
                            </h4>
                        </li>
                        <li class="bg3">
                            <h2>餐厅</h2>
                            <xsl:for-each select="Travel/listRestaurant">
                                <h3>名称： <xsl:value-of select="name"></xsl:value-of></h3><br/>
                                地址：<xsl:value-of select="address"></xsl:value-of><br/>
                                电话：<xsl:value-of select="telephone"></xsl:value-of><br/>
                            </xsl:for-each>
                            <h2>银行</h2>
                            <xsl:for-each select="Travel/listBank">
                                <h3>名称： <xsl:value-of select="name"></xsl:value-of></h3><br/>
                                地址：<xsl:value-of select="address"></xsl:value-of><br/>
                                电话：<xsl:value-of select="telephone"></xsl:value-of><br/>
                            </xsl:for-each>
                        </li>
                        <li class="bg2">
                            <h2>酒店</h2>
                            <xsl:for-each select="Travel/listHotel">
                                <h3>名称： <xsl:value-of select="name"></xsl:value-of></h3><br/>
                                <h4>地址：<xsl:value-of select="address"></xsl:value-of><br/>
                                星级：<xsl:value-of select="className"></xsl:value-of><br/>
                                简介：<xsl:value-of select="intro"></xsl:value-of><br/>
                                满意度：<xsl:value-of select="satisfaction"></xsl:value-of><br/>
                                <xsl:element name="a">
                                    <xsl:attribute name="href">
                                        <xsl:value-of select="url"></xsl:value-of>
                                    </xsl:attribute>
                                    访问主页
                                </xsl:element></h4>
                                <xsl:element name="img">
                                    <xsl:attribute name="src">
                                        <xsl:value-of select="largePic"></xsl:value-of>
                                    </xsl:attribute>
                                </xsl:element><br/>
                            </xsl:for-each>
                        </li>
                    </ul>
                </div>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
