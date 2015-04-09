/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import com.sun.xml.rpc.processor.modeler.j2ee.xml.string;

/**
 *
 * @author yangchen
 */
public class Hotel {
    private string cityID;
    private string name;
    private string className;
    private string intro;
    private float lat;
    private float lon;
    private string address;
    private string url;
    private string imgurl;
    private string manyidu;

    public string getCityID() {
        return cityID;
    }

    public void setCityID(string cityID) {
        this.cityID = cityID;
    }

    public string getName() {
        return name;
    }

    public void setName(string name) {
        this.name = name;
    }

    public string getClassName() {
        return className;
    }

    public void setClassName(string className) {
        this.className = className;
    }

    public string getIntro() {
        return intro;
    }

    public void setIntro(string intro) {
        this.intro = intro;
    }

    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public float getLon() {
        return lon;
    }

    public void setLon(float lon) {
        this.lon = lon;
    }

    public string getAddress() {
        return address;
    }

    public void setAddress(string address) {
        this.address = address;
    }

    public string getUrl() {
        return url;
    }

    public void setUrl(string url) {
        this.url = url;
    }

    public string getImgurl() {
        return imgurl;
    }

    public void setImgurl(string imgurl) {
        this.imgurl = imgurl;
    }

    public string getManyidu() {
        return manyidu;
    }

    public void setManyidu(string manyidu) {
        this.manyidu = manyidu;
    }
    
    
}
