/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import beans.personnel_bean;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Goth Zack
 */
public class personnel_controleur extends HttpServlet {

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
        
        personnel_bean p=new personnel_bean();
        String name =request.getParameter("nom"); if(name==null) name="_";
        String prenom=request.getParameter("prenom");if(prenom==null) prenom="_";
        String Date_Nai=request.getParameter("date_naissance");if( Date_Nai==null)  Date_Nai="_";
        String sexe=request.getParameter("sexe");if( sexe==null)  sexe="_";
        String type=request.getParameter("type");if( type==null)  type="_";
        String Date_em=request.getParameter("date_embauche");if( Date_em==null)  Date_em="_";
        String serv=request.getParameter("service");if( serv==null)  serv="_";
        int service=0;
        if(serv=="direction")service=1;
        if(serv=="maintenance")service=2;
        if(serv=="commercial")service=3;
        if(serv=="productivité")service=4;
        
        String ech=request.getParameter("echelon");
        int echelon=Integer.valueOf(ech);
        
        String sal=request.getParameter("salaire");
        int salaire=Integer.valueOf(sal);
        
        String grade=request.getParameter("grade");if( grade==null)  grade="_";
        String statut=request.getParameter("statut");if( statut==null)  statut="_";
        
        boolean cadre=request.getParameter("cadre") !=null;
        boolean formation=request.getParameter("formation") !=null;
        String lieu_residence=request.getParameter("lieu_residence");if( lieu_residence==null)  lieu_residence="_";
        
        String dur=request.getParameter("duree_contrat");
        int duree_contrat=Integer.valueOf(dur);
        
        
        try {
            p.intialiser(service, name, prenom, Date_Nai, Date_em, sexe, type, echelon, salaire, grade, statut, lieu_residence, cadre, formation, duree_contrat);
            p.inscription_personnel();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(personnel_controleur.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(personnel_controleur.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(personnel_controleur.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.getServletContext().getRequestDispatcher("/formulaire.html").forward(request, response);
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
