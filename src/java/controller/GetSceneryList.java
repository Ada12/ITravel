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
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yangchen
 */
public class GetSceneryList {

    public List<SceneryList> getAllSceneryList(String city, String page) {
        GetResource gr = new GetResource();
        GetCity gc = new GetCity();
        HashMap cityInfo = new HashMap();
        cityInfo = gc.getCity();
        String cityID = (String) cityInfo.get(city);
        String sceneryUrl = "http://apis.haoservice.com/lifeservice/travel/scenery?key=de8a238525314a99a55515983592374a&cid=" + cityID + "&page=" + page;
        String data = gr.getData(sceneryUrl);

        try {
            JSONObject dataJson;
            dataJson = new JSONObject(data);
            List<SceneryList> lsl = new ArrayList<SceneryList>();
            JSONArray result = dataJson.getJSONArray("result");
            for (int i = 0; i < result.length(); i++) {
                JSONObject info = result.getJSONObject(i);
                SceneryList sl = new SceneryList();
                sl.setAddress(info.getString("address"));
                sl.setCityId(info.getString("cityId"));
                sl.setGrade(info.getString("grade"));
                sl.setCommCnt(info.getString("comm_cnt"));
                sl.setImgurl(info.getString("imgurl"));
                sl.setPriceMin(info.getString("price_min"));
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

    public List<SceneryList> getSelectScenery(String city, String sceneryName) {
        GetResource gr = new GetResource();
        GetCity gc = new GetCity();
        HashMap cityInfo = new HashMap();
        cityInfo = gc.getCity();
        String cityID = (String) cityInfo.get(city);
        List<SceneryList> selectScenery = new ArrayList<SceneryList>();
        for(int page = 1;page < 10; page ++){
            String sceneryUrl = "http://apis.haoservice.com/lifeservice/travel/scenery?key=de8a238525314a99a55515983592374a&cid=" + cityID + "&page=" + page;
            String data = gr.getData(sceneryUrl);
            selectScenery = getScenery(data, sceneryName);
            if(selectScenery.size() > 0){
                break;
            }
        }
        return selectScenery;
    }

    public List<SceneryList> getScenery(String data, String sceneryName) {
        try {
            JSONObject dataJson;
            dataJson = new JSONObject(data);
            List<SceneryList> lsl = new ArrayList<SceneryList>();
            JSONArray result = dataJson.getJSONArray("result");
            for (int i = 0; i < result.length(); i++) {
                JSONObject info = result.getJSONObject(i);
                SceneryList sl = new SceneryList();
                sl.setAddress(info.getString("address"));
                sl.setCityId(info.getString("cityId"));
                sl.setGrade(info.getString("grade"));
                sl.setCommCnt(info.getString("comm_cnt"));
                sl.setImgurl(info.getString("imgurl"));
                sl.setPriceMin(info.getString("price_min"));
                sl.setSid(info.getString("sid"));
                sl.setTitle(info.getString("title"));
                sl.setUrl(info.getString("url"));
                if (sceneryName.equals(info.getString("title"))) {
                    lsl.add(sl);
                }
            }
            return lsl;
        } catch (JSONException ex) {
            throw new RuntimeException(ex);
        }
    }
}
