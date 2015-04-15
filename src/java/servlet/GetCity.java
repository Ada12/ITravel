/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import beans.Hotel;
import com.sun.xml.rpc.processor.modeler.j2ee.xml.string;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.JSONArray;
import org.json.JSONException; 
import org.json.JSONObject;
import controller.UnmarshalRestaurant;
import beans.Result;
import beans.Weather;
import controller.UnmarshalWeather;
import beans.SceneryList;
import controller.GetSceneryList;
import java.util.ArrayList;
import beans.Scenery;
import controller.GetGeocoding;
import controller.GetHotel;
import controller.GetScenery;
/**
 *
 * @author yangchen
 */
@WebServlet(name = "GetCity", urlPatterns = {"/GetCity"})
public class GetCity extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
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
    
    public HashMap getCity() throws JSONException{
        String url = "http://apis.haoservice.com/lifeservice/travel/cityList?key=de8a238525314a99a55515983592374a";
        String data = getData(url);
        JSONObject dataJson = new JSONObject(data);
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
            //System.out.print(cityInfo.get("黄山"));
    }
    
    public HashMap getLandscape(){
        HashMap<string, List> landscapeInfo = new HashMap();
        
        return landscapeInfo;
    }
    
    public String getWeather() throws UnsupportedEncodingException{
        String place = "南京";
        place = URLEncoder.encode(place, "gb2312");
        String url = "http://php.weather.sina.com.cn/xml.php?city="+ place +"&password=DJOYnieT8234jlsK&day=0";
        String data = getData(url); 
        return data;
    }
    
    public String getLocation() throws UnsupportedEncodingException{
        String place = "南京";
        place = URLEncoder.encode(place, "gb2312");
        String url = "http://api.map.baidu.com/geocoder/v2/?address="+ place +"&output=json&ak=E4805d16520de693a3fe707cdc962045&callback=showLocation";
        String data = getData(url);
        return data;
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
//        UnmarshalRestaurant ur = new UnmarshalRestaurant();
//        List<Result> r = ur.getData();
//        String check;
//        if(r == null){
//            check = "false";
//        }else{
//            check = "true";
//        }
        
//        UnmarshalWeather uw = new UnmarshalWeather();
//        String city = "北京";
//        Weather w = uw.getWeather(city);
        
//        GetSceneryList gsl = new GetSceneryList();
//        List<SceneryList> lsl = gsl.getSceneryList("芜湖");
            
//        GetScenery gs = new GetScenery();
//        List<Scenery> ls = gs.getScenery("5305");
    
//        GetHotel gh = new GetHotel();
//        List<Hotel> lh = gh.getHotel("巢湖");
        
        GetGeocoding gg = new GetGeocoding();
        double[] ge = new double[2];
        ge = gg.getGeocoding("百度大厦");
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet GetCity</title>");     
            out.println("<script></script>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet GetCity at "+ ge[0] + ","+ ge[1] + " </h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
