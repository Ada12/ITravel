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
public class Landscape {
    private string landscapeID;
    private string title;
    private string referral;
    private string imgurl;

    public string getLandscapeID() {
        return landscapeID;
    }

    public void setLandscapeID(string landscapeID) {
        this.landscapeID = landscapeID;
    }

    public string getTitle() {
        return title;
    }

    public void setTitle(string title) {
        this.title = title;
    }

    public string getReferral() {
        return referral;
    }

    public void setReferral(string referral) {
        this.referral = referral;
    }

    public string getImgurl() {
        return imgurl;
    }

    public void setImgurl(string imgurl) {
        this.imgurl = imgurl;
    }
    
    
}
