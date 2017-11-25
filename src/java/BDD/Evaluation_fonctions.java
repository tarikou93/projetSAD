/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BDD;

import beans.Taux_eval;
import beans.abscent_bean;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Goth Zack
 */
public class Evaluation_fonctions {
    
    public static ArrayList<abscent_bean> Absence_fonction(String date) throws ClassNotFoundException, SQLException
    {
    
        ArrayList<abscent_bean> A=new ArrayList<abscent_bean>();
         Class.forName("com.mysql.jdbc.Driver");  
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sad","root","");  
        Statement stmt=con.createStatement();  
        ResultSet rs=stmt.executeQuery("SELECT p.idpersonnel, p.nom, p.prenom, s.nom_service, a.type, a.motif FROM  `personnel` p,  `absence` a,  `service` s WHERE p.idpersonnel = a.personnel_idpersonnel AND s.idservice = p.service_idservice AND a.date_abs = '"+date+"'" ); 
        
        while(rs.next()){
            abscent_bean b=new abscent_bean();
            b.setId(rs.getInt(1));
            b.setNom(rs.getString(2));
            b.setPrenom(rs.getString(3));
            b.setService(rs.getString(4));
            b.setType(rs.getString(5));
            b.setMotif(rs.getString(6));
            A.add(b);
            System.out.println("-----------------------------------------------");
        }
    stmt.close(); 
    con.close();
    
    
       return A;
    }
    
    public static ArrayList<Taux_eval> Evaluation_Personne_CDD(String mois,String year) throws ClassNotFoundException, SQLException
    {
    
        ArrayList<Taux_eval> A=new ArrayList<Taux_eval>();
         Class.forName("com.mysql.jdbc.Driver");  
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sad","root","");  
        Statement stmt=con.createStatement();
       
        ResultSet rs=stmt.executeQuery("SELECT p.nom, p.prenom,s.nom_service,p.type, e.taux FROM  `personnel` p,  `evaluation` e,`service` s WHERE e.personnel_idpersonnel = p.idpersonnel AND s.idservice=p.service_idservice AND e.taux <= 0.35 AND p.type='cdd' AND e.mois_eval='"+mois+"' AND e.annee_eval='"+year+"' " ); 

         while(rs.next()){
            Taux_eval b=new Taux_eval();
            
            b.setNom(rs.getString(1));
            b.setPrenom(rs.getString(2));
            b.setService(rs.getString(3));
            b.setType(rs.getString(4));
            b.setTaux_ev(rs.getDouble(5));
            A.add(b);
            System.out.println("-----------------------------------------------");
        }
    stmt.close(); 
    con.close();
    
    
       return A;
    }
    
     public static ArrayList<Taux_eval> Evaluation_Personne_CDI(String mois,String year) throws ClassNotFoundException, SQLException
    {
    
        ArrayList<Taux_eval> A=new ArrayList<Taux_eval>();
         Class.forName("com.mysql.jdbc.Driver");  
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sad","root","");  
        Statement stmt=con.createStatement();  
        ResultSet rs=stmt.executeQuery("SELECT p.nom, p.prenom,s.nom_service,p.type, e.taux FROM  `personnel` p,  `evaluation` e,`service` s WHERE e.personnel_idpersonnel = p.idpersonnel AND s.idservice=p.service_idservice AND e.taux <= 0.25 AND p.type='cdi' AND e.mois_eval='"+mois+"' AND e.annee_eval='"+year+"' " ); 
        
        while(rs.next()){
            Taux_eval b=new Taux_eval();
            
            b.setNom(rs.getString(1));
            b.setPrenom(rs.getString(2));
            b.setService(rs.getString(3));
            b.setType(rs.getString(4));
            b.setTaux_ev(rs.getDouble(5));
            A.add(b);
            System.out.println("-----------------------------------------------");
        }
    stmt.close(); 
    con.close();
    
    
       return A;
    }
}
