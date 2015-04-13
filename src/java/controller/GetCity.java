/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author yangchen
 */
public class GetCity {
    
    public HashMap getCity(){
        String url = "http://apis.haoservice.com/lifeservice/travel/cityList?key=de8a238525314a99a55515983592374a";
        GetResource gr = new GetResource();
        String data = gr.getData(url);
        JSONObject dataJson;
        try {
            dataJson = new JSONObject(data);
            JSONArray result = dataJson.getJSONArray("result");
        HashMap cityInfo = new HashMap();
        for(int i = 0;i< result.length();i++){
            JSONObject info = result.getJSONObject(i);
            String cn = info.getString("cityName");
            String ci = info.getString("cityId");
            cityInfo.put(cn, ci);
        }
        return cityInfo;
        } catch (JSONException ex) {
            Logger.getLogger(GetSceneryList.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }  
    }
}
