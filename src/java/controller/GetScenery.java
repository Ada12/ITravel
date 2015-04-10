/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import beans.Scenery;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author yangchen
 */
public class GetScenery {
    
    public List<Scenery> getScenery(String sid){
        
        GetResource gr = new GetResource();
        String url = "http://apis.haoservice.com/lifeservice/travel/GetScenery?key=de8a238525314a99a55515983592374a&sid="+ sid;
        String data = gr.getData(url);
        JSONObject dataJson;
        try {
            dataJson = new JSONObject(data);
//            JSONArray errorCode = dataJson.getJSONArray("error_code");
//            JSONObject errorInfo = errorCode.getJSONObject(0);
            
            List<Scenery> ls = new ArrayList<Scenery>();
            JSONArray result = dataJson.getJSONArray("result");
            for(int i = 0;i < result.length(); i ++){
                JSONObject info = result.getJSONObject(i);
                Scenery sceneryInfo = new Scenery();
                sceneryInfo.setTitle(info.getString("title"));
                sceneryInfo.setReferral(info.getString("referral"));
                sceneryInfo.setImgurl(info.getString("img"));
                ls.add(sceneryInfo);
            }
            return ls;
        } catch (JSONException ex) {
            Logger.getLogger(Scenery.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    
}
