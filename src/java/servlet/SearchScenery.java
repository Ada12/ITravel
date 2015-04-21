/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import beans.SceneryList;
import controller.GetSceneryList;
import controller.MarshalSceneryList;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
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
@WebServlet(name = "SearchSecnery", urlPatterns = {"/SearchScenery"})
public class SearchScenery extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    public String changeCoding(String scenery){
        scenery = scenery.trim();
        String t = scenery.substring(2, scenery.length()-1);
        String[] t1 = t.split(";&#");
        String[] rr = new String[t1.length];
        for(int i = 0;i < t1.length; i ++){
           int r = Integer.parseInt(t1[i]);
           String x = Integer.toHexString(r);
           rr[i] = x;
        }
        String result = "";
        System.out.println("---------------------"+scenery);
        for(int j = 0; j < rr.length; j ++){
            result = result + "\\u" + rr[j];
        }
        System.out.println("---------------------"+result);
        StringBuilder sb = new StringBuilder();
        int k  = -1;
        int pos = 0;
        while((k = result.indexOf("\\u", pos)) != -1){
                sb.append(result.substring(pos, k));
                if(k+5 < result.length()){
                    pos = k + 6;
                    sb.append((char)Integer.parseInt(result.substring(k+2, k+6), 16) );
                }
            }
        System.out.println("---------------------"+sb);
        return sb.toString();
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String scenery = request.getParameter("sceneryName");
        String sceneryName = "";
        if(scenery.indexOf("&#") != -1){
            sceneryName = changeCoding(scenery);
        }else{
            sceneryName = scenery;
        }
        HttpSession session = request.getSession();
        String cityName = (String) session.getAttribute("cityName");
        try {
            GetSceneryList gsl = new GetSceneryList();
            List<SceneryList> lsl = gsl.getSelectScenery(cityName, sceneryName);
            MarshalSceneryList msl = new MarshalSceneryList();

            PrintWriter out = response.getWriter();
            TransformerFactory fac = TransformerFactory.newInstance();
            Source xslt = new StreamSource(new File(getServletContext().getRealPath("/") + "WEB-INF/classes/xsl/scenerylist.xsl"));
            Transformer transformer = fac.newTransformer(xslt);
            msl.getXml(lsl, getServletContext().getRealPath("/"));

            URL url = new URL("http://localhost:8080/ITravel/scenerylist.xml");
            Source xml = new StreamSource(url.openStream());
            transformer.transform(xml, new StreamResult(out));
        } catch (TransformerConfigurationException ex) {
            Logger.getLogger(SceneryListServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            Logger.getLogger(SceneryListServlet.class.getName()).log(Level.SEVERE, null, ex);
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
