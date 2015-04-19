/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author yangchen
 */
@WebServlet(name = "test", urlPatterns = {"/test"})
public class test extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        String test = request.getParameter("sceneryName");
        String t = test.substring(2, test.length()-1);
        String[] t1 = t.split(";&#");
        String[] rr = new String[t1.length];
        for(int i = 0;i < t1.length; i ++){
           int r = Integer.parseInt(t1[i]);
           String x = Integer.toHexString(r);
           rr[i] = x;
        }
        String result = "";
        System.out.println("---------------------"+test);
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