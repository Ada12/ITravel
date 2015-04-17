/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import beans.SceneryList;
import beans.SceneryObjectList;
import controller.GetSceneryList;
import controller.MarshalSceneryList;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Session;
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
@WebServlet(name = "SceneryListServlet", urlPatterns = {"/SceneryListServlet"})
public class SceneryListServlet extends HttpServlet {

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
            throws ServletException, IOException{
        try {
            String cityNameS = "";
            String cityName = request.getParameter("cityName");
            String changePage = request.getParameter("page");
            System.out.println(changePage);
            HttpSession session = request.getSession();
            String test = "1";
            if(session.getAttribute("flag") == null){
                session.setAttribute("flag", test);
                session.setAttribute("cityName", cityName);
            }else{
                cityNameS = (String) session.getAttribute("cityName");
            }
            GetSceneryList gsl = new GetSceneryList();
            String page = "1";
            if(changePage != null){
                page = changePage;
            }    
            if(cityNameS == ""){
               cityNameS  = cityName;             
            }
            List<SceneryList> lsl = gsl.getAllSceneryList(cityNameS,page);
            MarshalSceneryList  msl = new MarshalSceneryList();
            
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
