/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import beans.Hotel;
import java.util.ArrayList;
import java.util.HashMap;
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
public class GetHotel {
    
    public List<Hotel> getHotel(String cityName){
        GetResource gr = new GetResource();
        GetCity gc = new GetCity();
        HashMap cityInfo = new HashMap();
        cityInfo = gc.getCity();
        String cityID = (String) cityInfo.get(cityName);
        String hotelURL = "http://apis.haoservice.com/lifeservice/travel/HotelList?key=de8a238525314a99a55515983592374a&cityid="+ cityID;
        String data = gr.getData(hotelURL);
        try {
            List<Hotel> lh = new ArrayList<Hotel>();
            JSONObject dataJson;
            dataJson = new JSONObject(data);
//            JSONArray errorCode = dataJson.getJSONArray("error_code");
//            JSONObject errorInfo = errorCode.getJSONObject(0);
           // boolean test = dataJson.isNull("result");
            JSONArray result = dataJson.getJSONArray("result");
            for(int i = 0; i < result.length(); i ++){
                JSONObject info = result.getJSONObject(i);
                Hotel h = new Hotel();
                h.setHotelID(info.getString("id"));
                h.setName(info.getString("name"));
                h.setClassName(info.getString("className"));
                h.setIntro(info.getString("intro"));
                h.setDpNum(info.getString("dpNum"));
                h.setLat(info.getString("Lat"));
                h.setLon(info.getString("Lon"));
                h.setAddress(info.getString("address"));
                h.setLargePic(info.getString("largePic"));
                h.setCityID(info.getString("cityId"));
                h.setUrl(info.getString("url"));
                h.setSatisfaction(info.getString("manyidu"));
                lh.add(h);
            }
            return lh;
        } catch (JSONException ex) {
            Logger.getLogger(GetHotel.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } 
    }
}
