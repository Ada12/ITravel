/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author yangchen
 */
public class GetResource {
    
    public String getData(String urlString){
        String result = "";
        BufferedReader read = null;
        try{
            URL realurl = new URL(urlString);
            URLConnection connection = realurl.openConnection();
            connection.setRequestProperty("accept", "*/*");
             connection.setRequestProperty("connection", "Keep-Alive");
             connection.setRequestProperty("user-agent",
                     "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
             connection.connect();
             Map<String, List<String>> map = connection.getHeaderFields();
             for(String key : map.keySet()){
                 System.out.println(key + "--->" + map.get(key));
             }
             read = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"));
             String line;
             while((line = read.readLine()) != null){
                 result += line;
             }
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if(read != null){
                try {
                    read.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return result;
    }
    
    public String ChangeGB(String c){
        try {
            c = URLEncoder.encode(c, "gb2312");
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(GetResource.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
    }
}
