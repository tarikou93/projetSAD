/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import BDD.ConnectionBDD;
import beans.person;
import beans.persons;
import beans.salaire;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Tarek
 */
public class s2 extends HttpServlet {

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
            out.println("<title>Servlet s2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet s2 at " + request.getContextPath() + "</h1>");
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
            ConnectionBDD cn = new ConnectionBDD();
        //****************************************************************************************
            //top 5 des meilleurs salaire;
//            person p1 = new person();
//            person p2 = new person();
//            person p3 = new person();
//            person p4 = new person();
//            person p5 = new person();
            
//            p1.setNom("abdellaziz");p1.setPrenom("tarek");p1.setGrade("general");p1.setSalaire(300000);
//            p2.setNom("salah");p2.setPrenom("mohammed");p2.setGrade("colonel");p2.setSalaire(200000);
//            p3.setNom("said");p3.setPrenom("ali");p3.setGrade("lt-colonel");p3.setSalaire(100000);
//            p4.setNom("bou3lam");p4.setPrenom("mouh");p4.setGrade("commandant");p4.setSalaire(90000);
//            p5.setNom("hamel");p5.setPrenom("djamel");p5.setGrade("etudiant");p5.setSalaire(40000);
            
            persons listOfBestPerson = new persons();
            persons listOfBadPerson = new persons();
            
            listOfBestPerson = cn.getMeilleurPERSON();
            listOfBadPerson = cn.getMauvaisePERSON();
//            listOfPerson.l.add(p1);listOfPerson.l.add(p2);listOfPerson.l.add(p3);
//            listOfPerson.l.add(p4);listOfPerson.l.add(p5);
            
            request.setAttribute("listPerson", listOfBestPerson);
            request.setAttribute("listBadPerson", listOfBadPerson);
            //****************************************************************************************
            //information sur les salaires
            salaire s = new salaire();
            s = cn.getSALAIRE();
            
            request.setAttribute("infoSalaire", s);
            //****************************************************************************************
            
            this.getServletContext().getRequestDispatcher("/WEB-INF/statSalaire.jsp").forward(request, response);
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
