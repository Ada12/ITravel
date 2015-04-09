//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2015.04.09 时间 11:06:29 AM CST 
//


package beans;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}city"/>
 *         &lt;element ref="{}status1"/>
 *         &lt;element ref="{}status2"/>
 *         &lt;element ref="{}figure1"/>
 *         &lt;element ref="{}figure2"/>
 *         &lt;element ref="{}direction1"/>
 *         &lt;element ref="{}direction2"/>
 *         &lt;element ref="{}power1"/>
 *         &lt;element ref="{}power2"/>
 *         &lt;element ref="{}temperature1"/>
 *         &lt;element ref="{}temperature2"/>
 *         &lt;element ref="{}ssd"/>
 *         &lt;element ref="{}tgd1"/>
 *         &lt;element ref="{}tgd2"/>
 *         &lt;element ref="{}zwx"/>
 *         &lt;element ref="{}ktk"/>
 *         &lt;element ref="{}pollution"/>
 *         &lt;element ref="{}xcz"/>
 *         &lt;element ref="{}zho"/>
 *         &lt;element ref="{}diy"/>
 *         &lt;element ref="{}fas"/>
 *         &lt;element ref="{}chy"/>
 *         &lt;element ref="{}zho_shuoming"/>
 *         &lt;element ref="{}diy_shuoming"/>
 *         &lt;element ref="{}fas_shuoming"/>
 *         &lt;element ref="{}chy_shuoming"/>
 *         &lt;element ref="{}pollution_l"/>
 *         &lt;element ref="{}zwx_l"/>
 *         &lt;element ref="{}ssd_l"/>
 *         &lt;element ref="{}fas_l"/>
 *         &lt;element ref="{}zho_l"/>
 *         &lt;element ref="{}chy_l"/>
 *         &lt;element ref="{}ktk_l"/>
 *         &lt;element ref="{}xcz_l"/>
 *         &lt;element ref="{}diy_l"/>
 *         &lt;element ref="{}pollution_s"/>
 *         &lt;element ref="{}zwx_s"/>
 *         &lt;element ref="{}ssd_s"/>
 *         &lt;element ref="{}ktk_s"/>
 *         &lt;element ref="{}xcz_s"/>
 *         &lt;element ref="{}gm"/>
 *         &lt;element ref="{}gm_l"/>
 *         &lt;element ref="{}gm_s"/>
 *         &lt;element ref="{}yd"/>
 *         &lt;element ref="{}yd_l"/>
 *         &lt;element ref="{}yd_s"/>
 *         &lt;element ref="{}savedate_weather"/>
 *         &lt;element ref="{}savedate_life"/>
 *         &lt;element ref="{}savedate_zhishu"/>
 *         &lt;element ref="{}udatetime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "city",
    "status1",
    "status2",
    "figure1",
    "figure2",
    "direction1",
    "direction2",
    "power1",
    "power2",
    "temperature1",
    "temperature2",
    "ssd",
    "tgd1",
    "tgd2",
    "zwx",
    "ktk",
    "pollution",
    "xcz",
    "zho",
    "diy",
    "fas",
    "chy",
    "zhoShuoming",
    "diyShuoming",
    "fasShuoming",
    "chyShuoming",
    "pollutionL",
    "zwxL",
    "ssdL",
    "fasL",
    "zhoL",
    "chyL",
    "ktkL",
    "xczL",
    "diyL",
    "pollutionS",
    "zwxS",
    "ssdS",
    "ktkS",
    "xczS",
    "gm",
    "gmL",
    "gmS",
    "yd",
    "ydL",
    "ydS",
    "savedateWeather",
    "savedateLife",
    "savedateZhishu",
    "udatetime"
})
@XmlRootElement(name = "Weather")
public class Weather {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String city;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String status1;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String status2;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String figure1;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String figure2;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String direction1;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String direction2;
    @XmlElement(required = true)
    protected String power1;
    @XmlElement(required = true)
    protected String power2;
    @XmlElement(required = true)
    protected BigInteger temperature1;
    @XmlElement(required = true)
    protected BigInteger temperature2;
    @XmlElement(required = true)
    protected BigInteger ssd;
    @XmlElement(required = true)
    protected BigInteger tgd1;
    @XmlElement(required = true)
    protected BigInteger tgd2;
    @XmlElement(required = true)
    protected BigInteger zwx;
    @XmlElement(required = true)
    protected BigInteger ktk;
    @XmlElement(required = true)
    protected BigInteger pollution;
    @XmlElement(required = true)
    protected BigInteger xcz;
    @XmlElement(required = true)
    protected Zho zho;
    @XmlElement(required = true)
    protected Diy diy;
    @XmlElement(required = true)
    protected Fas fas;
    @XmlElement(required = true)
    protected BigInteger chy;
    @XmlElement(name = "zho_shuoming", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String zhoShuoming;
    @XmlElement(name = "diy_shuoming", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String diyShuoming;
    @XmlElement(name = "fas_shuoming", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String fasShuoming;
    @XmlElement(name = "chy_shuoming", required = true)
    protected String chyShuoming;
    @XmlElement(name = "pollution_l", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String pollutionL;
    @XmlElement(name = "zwx_l", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String zwxL;
    @XmlElement(name = "ssd_l", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String ssdL;
    @XmlElement(name = "fas_l", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String fasL;
    @XmlElement(name = "zho_l", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String zhoL;
    @XmlElement(name = "chy_l", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String chyL;
    @XmlElement(name = "ktk_l", required = true)
    protected String ktkL;
    @XmlElement(name = "xcz_l", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String xczL;
    @XmlElement(name = "diy_l", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String diyL;
    @XmlElement(name = "pollution_s", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String pollutionS;
    @XmlElement(name = "zwx_s", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String zwxS;
    @XmlElement(name = "ssd_s", required = true)
    protected String ssdS;
    @XmlElement(name = "ktk_s", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String ktkS;
    @XmlElement(name = "xcz_s", required = true)
    protected String xczS;
    @XmlElement(required = true)
    protected BigInteger gm;
    @XmlElement(name = "gm_l", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String gmL;
    @XmlElement(name = "gm_s", required = true)
    protected String gmS;
    @XmlElement(required = true)
    protected BigInteger yd;
    @XmlElement(name = "yd_l", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String ydL;
    @XmlElement(name = "yd_s", required = true)
    protected String ydS;
    @XmlElement(name = "savedate_weather", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String savedateWeather;
    @XmlElement(name = "savedate_life", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String savedateLife;
    @XmlElement(name = "savedate_zhishu", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String savedateZhishu;
    @XmlElement(required = true)
    protected String udatetime;

    /**
     * 获取city属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置city属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * 获取status1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus1() {
        return status1;
    }

    /**
     * 设置status1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus1(String value) {
        this.status1 = value;
    }

    /**
     * 获取status2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus2() {
        return status2;
    }

    /**
     * 设置status2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus2(String value) {
        this.status2 = value;
    }

    /**
     * 获取figure1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFigure1() {
        return figure1;
    }

    /**
     * 设置figure1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFigure1(String value) {
        this.figure1 = value;
    }

    /**
     * 获取figure2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFigure2() {
        return figure2;
    }

    /**
     * 设置figure2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFigure2(String value) {
        this.figure2 = value;
    }

    /**
     * 获取direction1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirection1() {
        return direction1;
    }

    /**
     * 设置direction1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirection1(String value) {
        this.direction1 = value;
    }

    /**
     * 获取direction2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirection2() {
        return direction2;
    }

    /**
     * 设置direction2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirection2(String value) {
        this.direction2 = value;
    }

    /**
     * 获取power1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPower1() {
        return power1;
    }

    /**
     * 设置power1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPower1(String value) {
        this.power1 = value;
    }

    /**
     * 获取power2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPower2() {
        return power2;
    }

    /**
     * 设置power2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPower2(String value) {
        this.power2 = value;
    }

    /**
     * 获取temperature1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTemperature1() {
        return temperature1;
    }

    /**
     * 设置temperature1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTemperature1(BigInteger value) {
        this.temperature1 = value;
    }

    /**
     * 获取temperature2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTemperature2() {
        return temperature2;
    }

    /**
     * 设置temperature2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTemperature2(BigInteger value) {
        this.temperature2 = value;
    }

    /**
     * 获取ssd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSsd() {
        return ssd;
    }

    /**
     * 设置ssd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSsd(BigInteger value) {
        this.ssd = value;
    }

    /**
     * 获取tgd1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTgd1() {
        return tgd1;
    }

    /**
     * 设置tgd1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTgd1(BigInteger value) {
        this.tgd1 = value;
    }

    /**
     * 获取tgd2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTgd2() {
        return tgd2;
    }

    /**
     * 设置tgd2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTgd2(BigInteger value) {
        this.tgd2 = value;
    }

    /**
     * 获取zwx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getZwx() {
        return zwx;
    }

    /**
     * 设置zwx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setZwx(BigInteger value) {
        this.zwx = value;
    }

    /**
     * 获取ktk属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getKtk() {
        return ktk;
    }

    /**
     * 设置ktk属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setKtk(BigInteger value) {
        this.ktk = value;
    }

    /**
     * 获取pollution属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPollution() {
        return pollution;
    }

    /**
     * 设置pollution属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPollution(BigInteger value) {
        this.pollution = value;
    }

    /**
     * 获取xcz属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getXcz() {
        return xcz;
    }

    /**
     * 设置xcz属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setXcz(BigInteger value) {
        this.xcz = value;
    }

    /**
     * 获取zho属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Zho }
     *     
     */
    public Zho getZho() {
        return zho;
    }

    /**
     * 设置zho属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Zho }
     *     
     */
    public void setZho(Zho value) {
        this.zho = value;
    }

    /**
     * 获取diy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Diy }
     *     
     */
    public Diy getDiy() {
        return diy;
    }

    /**
     * 设置diy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Diy }
     *     
     */
    public void setDiy(Diy value) {
        this.diy = value;
    }

    /**
     * 获取fas属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Fas }
     *     
     */
    public Fas getFas() {
        return fas;
    }

    /**
     * 设置fas属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Fas }
     *     
     */
    public void setFas(Fas value) {
        this.fas = value;
    }

    /**
     * 获取chy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getChy() {
        return chy;
    }

    /**
     * 设置chy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setChy(BigInteger value) {
        this.chy = value;
    }

    /**
     * 获取zhoShuoming属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZhoShuoming() {
        return zhoShuoming;
    }

    /**
     * 设置zhoShuoming属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZhoShuoming(String value) {
        this.zhoShuoming = value;
    }

    /**
     * 获取diyShuoming属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiyShuoming() {
        return diyShuoming;
    }

    /**
     * 设置diyShuoming属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiyShuoming(String value) {
        this.diyShuoming = value;
    }

    /**
     * 获取fasShuoming属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFasShuoming() {
        return fasShuoming;
    }

    /**
     * 设置fasShuoming属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFasShuoming(String value) {
        this.fasShuoming = value;
    }

    /**
     * 获取chyShuoming属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChyShuoming() {
        return chyShuoming;
    }

    /**
     * 设置chyShuoming属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChyShuoming(String value) {
        this.chyShuoming = value;
    }

    /**
     * 获取pollutionL属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPollutionL() {
        return pollutionL;
    }

    /**
     * 设置pollutionL属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPollutionL(String value) {
        this.pollutionL = value;
    }

    /**
     * 获取zwxL属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZwxL() {
        return zwxL;
    }

    /**
     * 设置zwxL属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZwxL(String value) {
        this.zwxL = value;
    }

    /**
     * 获取ssdL属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsdL() {
        return ssdL;
    }

    /**
     * 设置ssdL属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsdL(String value) {
        this.ssdL = value;
    }

    /**
     * 获取fasL属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFasL() {
        return fasL;
    }

    /**
     * 设置fasL属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFasL(String value) {
        this.fasL = value;
    }

    /**
     * 获取zhoL属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZhoL() {
        return zhoL;
    }

    /**
     * 设置zhoL属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZhoL(String value) {
        this.zhoL = value;
    }

    /**
     * 获取chyL属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChyL() {
        return chyL;
    }

    /**
     * 设置chyL属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChyL(String value) {
        this.chyL = value;
    }

    /**
     * 获取ktkL属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKtkL() {
        return ktkL;
    }

    /**
     * 设置ktkL属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKtkL(String value) {
        this.ktkL = value;
    }

    /**
     * 获取xczL属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXczL() {
        return xczL;
    }

    /**
     * 设置xczL属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXczL(String value) {
        this.xczL = value;
    }

    /**
     * 获取diyL属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiyL() {
        return diyL;
    }

    /**
     * 设置diyL属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiyL(String value) {
        this.diyL = value;
    }

    /**
     * 获取pollutionS属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPollutionS() {
        return pollutionS;
    }

    /**
     * 设置pollutionS属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPollutionS(String value) {
        this.pollutionS = value;
    }

    /**
     * 获取zwxS属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZwxS() {
        return zwxS;
    }

    /**
     * 设置zwxS属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZwxS(String value) {
        this.zwxS = value;
    }

    /**
     * 获取ssdS属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsdS() {
        return ssdS;
    }

    /**
     * 设置ssdS属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsdS(String value) {
        this.ssdS = value;
    }

    /**
     * 获取ktkS属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKtkS() {
        return ktkS;
    }

    /**
     * 设置ktkS属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKtkS(String value) {
        this.ktkS = value;
    }

    /**
     * 获取xczS属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXczS() {
        return xczS;
    }

    /**
     * 设置xczS属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXczS(String value) {
        this.xczS = value;
    }

    /**
     * 获取gm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGm() {
        return gm;
    }

    /**
     * 设置gm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGm(BigInteger value) {
        this.gm = value;
    }

    /**
     * 获取gmL属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGmL() {
        return gmL;
    }

    /**
     * 设置gmL属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGmL(String value) {
        this.gmL = value;
    }

    /**
     * 获取gmS属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGmS() {
        return gmS;
    }

    /**
     * 设置gmS属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGmS(String value) {
        this.gmS = value;
    }

    /**
     * 获取yd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getYd() {
        return yd;
    }

    /**
     * 设置yd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setYd(BigInteger value) {
        this.yd = value;
    }

    /**
     * 获取ydL属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYdL() {
        return ydL;
    }

    /**
     * 设置ydL属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYdL(String value) {
        this.ydL = value;
    }

    /**
     * 获取ydS属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYdS() {
        return ydS;
    }

    /**
     * 设置ydS属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYdS(String value) {
        this.ydS = value;
    }

    /**
     * 获取savedateWeather属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSavedateWeather() {
        return savedateWeather;
    }

    /**
     * 设置savedateWeather属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSavedateWeather(String value) {
        this.savedateWeather = value;
    }

    /**
     * 获取savedateLife属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSavedateLife() {
        return savedateLife;
    }

    /**
     * 设置savedateLife属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSavedateLife(String value) {
        this.savedateLife = value;
    }

    /**
     * 获取savedateZhishu属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSavedateZhishu() {
        return savedateZhishu;
    }

    /**
     * 设置savedateZhishu属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSavedateZhishu(String value) {
        this.savedateZhishu = value;
    }

    /**
     * 获取udatetime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUdatetime() {
        return udatetime;
    }

    /**
     * 设置udatetime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUdatetime(String value) {
        this.udatetime = value;
    }

}
