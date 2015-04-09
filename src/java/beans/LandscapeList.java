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
public class LandscapeList {
    
    private int cityID;
    private int landscapeID;
    private string title;
    private string price_min;
    private string comm_cnt;
    private string url;
    private string imgurl;
    private string address;

    public int getCityID() {
        return cityID;
    }

    public void setCityID(int cityID){
        this.cityID = cityID;
    }

    public int getLandscapeID() {
        return landscapeID;
    }

    public void setLandscapeID(int landscapeID) {
        this.landscapeID = landscapeID;
    }

    public string getTitle() {
        return title;
    }

    public void setTitle(string title) {
        this.title = title;
    }

    public string getPrice_min() {
        return price_min;
    }

    public void setPrice_min(string price_min) {
        this.price_min = price_min;
    }

    public string getComm_cnt() {
        return comm_cnt;
    }

    public void setComm_cnt(string comm_cnt) {
        this.comm_cnt = comm_cnt;
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

    public string getAddress() {
        return address;
    }

    public void setAddress(string address) {
        this.address = address;
    }
}
