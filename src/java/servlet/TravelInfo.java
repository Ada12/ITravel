/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import beans.Hotel;
import beans.Result;
import beans.Scenery;
import beans.Travel;
import beans.Weather;
import controller.GetGeocoding;
import controller.GetHotel;
import controller.GetResource;
import controller.GetScenery;
import controller.MarshalTravelInfo;
import controller.UnmarshalRestaurant;
import controller.UnmarshalWeather;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLDecoder;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

/**
 *
 * @author yangchen
 */
@WebServlet(name = "TravelInfo", urlPatterns = {"/TravelInfo"})
public class TravelInfo extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            GetResource gr = new GetResource();
            String r = request.getParameter("sid");
            String[] sr = r.split("_");
            String sid = sr[0];
            String title = URLDecoder.decode(sr[1], "gb2312");
            String address = URLDecoder.decode(sr[2], "gb2312");
            System.out.println(title);
            System.out.println(address);
            HttpSession session = request.getSession();
            String cityName = (String) session.getAttribute("cityName");
            System.out.println(cityName);
//        request.setAttribute("sid", sid);
//        request.getRequestDispatcher("output.jsp").forward(request, response);
            GetScenery gs = new GetScenery();
            GetGeocoding gg = new GetGeocoding();
            UnmarshalRestaurant unrt = new UnmarshalRestaurant();
            UnmarshalWeather unw = new UnmarshalWeather();
            GetHotel gh = new GetHotel();
            double[] geocoding = gg.getGeocoding(address);
            String location = "" + geocoding[1] + "," + geocoding[0];
            List<Scenery> listScenery = gs.getScenery(sid);
            List<Result> restaurant = unrt.getData(location, "饭店");
            List<Result> bank = unrt.getData(location, "银行");
            Weather weather = unw.getWeather(cityName);
            List<Hotel> listHotel =  gh.getHotel(cityName, geocoding);
            Travel travelInfo = new Travel();
            travelInfo.setTravelCity(cityName);
            travelInfo.setTravelTitle(title);
            travelInfo.setListBank(bank);
            travelInfo.setListHotel(listHotel);
            travelInfo.setListRestaurant(restaurant);
            travelInfo.setWeather(weather);
            travelInfo.setListScenery(listScenery);
        try {     
            PrintWriter out = response.getWriter();
            TransformerFactory fac = TransformerFactory.newInstance();
            Source xslt = new StreamSource(new File(getServletContext().getRealPath("/") + "WEB-INF/classes/xsl/travel.xsl"));
            Transformer transformer = fac.newTransformer(xslt);
            MarshalTravelInfo mti = new MarshalTravelInfo();
            mti.getXml(travelInfo, getServletContext().getRealPath("/"));
            URL url = new URL("http://localhost:8080/ITravel/travel.xml");
            Source xml = new StreamSource(url.openStream());
            transformer.transform(xml, new StreamResult(out));    
        } catch (TransformerConfigurationException ex) {
            Logger.getLogger(TravelInfo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            Logger.getLogger(TravelInfo.class.getName()).log(Level.SEVERE, null, ex);
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
