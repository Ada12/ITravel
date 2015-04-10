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
import beans.SceneryList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author yangchen
 */
public class GetSceneryList {
    
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
            System.out.println(cn);
        }
        return cityInfo;
        } catch (JSONException ex) {
            Logger.getLogger(GetSceneryList.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }  
    }
    
    public List<SceneryList> getSceneryList(String city){ 
        GetResource gr = new GetResource();
        HashMap cityInfo = new HashMap();
        cityInfo = getCity();
        String cityID = (String)cityInfo.get(city);
        String sceneryUrl = "http://apis.haoservice.com/lifeservice/travel/scenery?key=de8a238525314a99a55515983592374a&cid="+ cityID +"&page=1";
        String data = gr.getData(sceneryUrl);

        try {
            JSONObject dataJson;
            dataJson = new JSONObject(data);
            List<SceneryList> lsl = new ArrayList<SceneryList>();
            
            JSONArray errorCode = dataJson.getJSONArray("error_code");
            JSONObject errorInfo = errorCode.getJSONObject(0);
            
            JSONArray result = dataJson.getJSONArray("result");
            for(int i= 0 ;i < result.length();i ++){
                JSONObject info = result.getJSONObject(i);
                SceneryList sl = new SceneryList();
                sl.setAddress(info.getString("address"));
                sl.setCityID(info.getString("cityId"));
                sl.setGrade(info.getString("grade"));
                sl.setImgurl(info.getString("imgurl"));
                sl.setPrice_min(info.getString("price_min"));
                sl.setSid(info.getString("sid"));
                sl.setTitle(info.getString("title"));
                sl.setUrl(info.getString("url"));
                lsl.add(sl);
            }
            return lsl;
        } catch (JSONException ex) {
            Logger.getLogger(GetSceneryList.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }    
    }
    
}
