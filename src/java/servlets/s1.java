/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import BDD.ConnectionBDD;
import beans.Cadre;
import beans.EffectifTotal;
import beans.absence;
import beans.beanTest;
import beans.person;
import beans.persons;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Tarek
 */
public class s1 extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet s1</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet s1 at " + request.getContextPath() + "</h1>");
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
            
            //on doit récupérer les valeurs d'une base de données
            //CDD CDI et Stagiaire
            // ***************************************************************************
//            beanTest b = new beanTest();
//            b.setX(160);
//            b.setY(100);
//            b.setZ(24);
              
            ConnectionBDD cn = new ConnectionBDD();
            beanTest b = new beanTest();
        try {
            b=cn.getRDV();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(s1.class.getName()).log(Level.SEVERE, null, ex);
        }
            request.setAttribute("val", b);
            //****************************************************************************
            
            ////on doit récupérer les valeurs d'une base de données
            //liste des absence
            //****************************************************************************
            absence a = new absence();
//            a.setAnnee(2017);
//            a.listeAbsence.add(12);a.listeAbsence.add(6);a.listeAbsence.add(20);a.listeAbsence.add(23);
//            a.listeAbsence.add(14);a.listeAbsence.add(11);a.listeAbsence.add(32);a.listeAbsence.add(42);
//            a.listeAbsence.add(10);a.listeAbsence.add(19);a.listeAbsence.add(30);a.listeAbsence.add(12);
            a = cn.getABS(2017);
            request.setAttribute("abs", a);
            
            
            //effectif total (femme - homme)
            //****************************************************************************
            EffectifTotal ef = new EffectifTotal();
//            ef.listHomme.add("5");ef.listHomme.add("11");ef.listHomme.add("25");ef.listHomme.add("30");
//            ef.listHomme.add("29");ef.listHomme.add("19");ef.listHomme.add("12");ef.listHomme.add("4");
//            
//            ef.listFemme.add("12");ef.listFemme.add("45");ef.listFemme.add("39");ef.listFemme.add("32");
//            ef.listFemme.add("17");ef.listFemme.add("3");ef.listFemme.add("10");ef.listFemme.add("5");
            ef = cn.getEffectif();
            request.setAttribute("effectif", ef);
            //****************************************************************************************
            //nombre des cadres et des non cadres
            Cadre c = new Cadre();
        try {
            //            c.setCadre(30);
//            c.setNon_cadre(254);
        c = cn.getCADRE();
        } catch (SQLException ex) {
            Logger.getLogger(s1.class.getName()).log(Level.SEVERE, null, ex);
        }
            request.setAttribute("cadre", c);
            //****************************************************************************************
            
            
            /*String personnelName = request.getParameter("idpersonnel");
            request.setAttribute("messagetest", personnelName);*/
            
            this.getServletContext().getRequestDispatcher("/WEB-INF/statEmp.jsp").forward(request, response);
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
