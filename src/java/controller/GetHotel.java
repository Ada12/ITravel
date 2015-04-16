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
    
    public List<Hotel> getHotel(String cityName, double[] geocoding){
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
                double lon = Double.valueOf(info.getString("Lon"));
                double lat = Double.valueOf(info.getString("Lat"));
                if((Math.abs(lon - geocoding[0]) < 0.11)&&(Math.abs(lat - geocoding[1]) < 0.11)){
                    lh.add(h);
                }
            }       
            List<Hotel> alh = new ArrayList<Hotel>();
            for(int j = 0; j < result.length(); j ++){
                JSONObject infoAll = result.getJSONObject(j);
                Hotel ah = new Hotel();
                ah.setHotelID(infoAll.getString("id"));
                ah.setName(infoAll.getString("name"));
                ah.setClassName(infoAll.getString("className"));
                ah.setIntro(infoAll.getString("intro"));
                ah.setDpNum(infoAll.getString("dpNum"));
                ah.setLat(infoAll.getString("Lat"));
                ah.setLon(infoAll.getString("Lon"));
                ah.setAddress(infoAll.getString("address"));
                ah.setLargePic(infoAll.getString("largePic"));
                ah.setCityID(infoAll.getString("cityId"));
                ah.setUrl(infoAll.getString("url"));
                ah.setSatisfaction(infoAll.getString("manyidu"));
                    alh.add(ah);            
            }
            if(lh.isEmpty()){
                return alh;
            }else{
                return lh;
            }    
        } catch (JSONException ex) {
            Logger.getLogger(GetHotel.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } 
    }
}
