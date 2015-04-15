/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author yangchen
 */
public class GetGeocoding {
    
    public double[] getGeocoding(String address){
        try {
            GetResource gr = new GetResource();
            //String addressGB = gr.ChangeGB(address);
            String url = "http://api.map.baidu.com/geocoder/v2/?address="+ address +"&output=json&ak=X2FGKdTqlfoXvwXhdz8UYEko&callback=showLocation";
            String data = gr.getData(url);
            String[] temp = data.split("\\(");
            String realdata = temp[1].substring(0,temp[1].length()-1);
            JSONObject dataJson;
            dataJson = new JSONObject(realdata);
            //JSONArray result = dataJson.getJSONArray("result");
            JSONObject result = dataJson.getJSONObject("result");
            JSONObject location = result.getJSONObject("location");
            double[] gecoding = new double[2];
            gecoding[0] = (double) location.get("lng");
            gecoding[1] = (double) location.get("lat");
            return gecoding;
        } catch (JSONException ex) {
            throw new RuntimeException(ex);
        }
    }
}
