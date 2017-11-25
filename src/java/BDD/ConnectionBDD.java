/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BDD;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import beans.*;
/**
 *
 * @author panika
 */
public class ConnectionBDD {
    
    
    public String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
    public String DB_URL = "jdbc:mysql://localhost/sad";
    //  Database credentials
    public String USER = "root";
    public String PASS = "";
    
    public beanTest getRDV() throws ClassNotFoundException{
        beanTest b =new beanTest();
        try {
            java.sql.Connection conn = null;
            Statement stmt = null;
            
            //Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            
            //Open a connection
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            stmt = conn.createStatement();
            String sql;
           
            // récupérer le nombre de cdi
            sql="SELECT COUNT(idpersonnel) as cnt FROM personnel WHERE type='cdi';";
            ResultSet r = stmt.executeQuery(sql);
           while(r.next()){
                int t = r.getInt("cnt");
                b.setX(t);
              }
           
           // récupérer le nombre de cdd
           sql="SELECT COUNT(idpersonnel) as cnt FROM personnel WHERE type='cdd';";
           r = stmt.executeQuery(sql);
           while(r.next()){
                int t = r.getInt("cnt");
                b.setY(t);
              }
           // récupérer le nombre de stagiaire
           sql="SELECT COUNT(idpersonnel) as cnt FROM personnel WHERE type='stagiaire';";
           r = stmt.executeQuery(sql);
           while(r.next()){
                int t = r.getInt("cnt");
                b.setZ(t);
              }
           
           
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionBDD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return b;
    }
    
    public Cadre getCADRE() throws SQLException{
        Cadre a=new Cadre();
        try {    
            java.sql.Connection conn = null;
            Statement stmt = null;
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            stmt = conn.createStatement();
            String sql;
            sql="SELECT COUNT(idpersonnel) as cnt FROM personnel WHERE cadre='1';";
            ResultSet r = stmt.executeQuery(sql);
           while(r.next()){
                int t = r.getInt("cnt");
                a.setCadre(t);
              }
           
           sql="SELECT COUNT(idpersonnel) as cnt FROM personnel WHERE cadre='0';";
             r = stmt.executeQuery(sql);
           while(r.next()){
                int t = r.getInt("cnt");
                a.setNon_cadre(t);
              }
            
            
            
            
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionBDD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return a;
    }
    
    public absence getABS(int annee){
       
        absence e=new absence();
        int tab[]=new int[12];
        for(int i=0;i<12;i++)
            tab[i]=0;
        try {
            
            
            java.sql.Connection conn = null;
            Statement stmt = null;
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            stmt = conn.createStatement();
            String sql;
            
            sql="SELECT date_abs FROM absence WHERE date_abs LIKE('"+ annee +"%' );";
            ResultSet r = stmt.executeQuery(sql);
            while(r.next()){
                String date = r.getString("date_abs");
               // System.out.println(date);
               String test= date.substring(5,7);
              // System.out.println(test);
               if(test.equals("01")) tab[0]++;
              if(test.equals("02")) tab[1]++;
              if(test.equals("03")) tab[2]++;
              if(test.equals("04")) tab[3]++;
              if(test.equals("05")) tab[4]++;
              if(test.equals("06")) tab[5]++;
              if(test.equals("07")) tab[6]++;
              if(test.equals("08")) tab[7]++;
              if(test.equals("09")) tab[8]++;
              if(test.equals("10")) tab[9]++;
              if(test.equals("11")) tab[10]++;
              if(test.equals("12")) tab[11]++;
             
                
            }
            
      for(int j=0;j<12;j++)
          e.listeAbsence.add(tab[j]);
      e.setAnnee(annee);
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ConnectionBDD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return e;
    }
    
    public persons getMeilleurPERSON(){
        persons ps=new persons();
        int i=0;
        
        try {
            
            java.sql.Connection conn = null;
            Statement stmt = null;
            
            //Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            
            //Open a connection
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            stmt = conn.createStatement();
            String sql;
            sql="select * from personnel ORDER BY salaire DESC;";
      ResultSet r = stmt.executeQuery(sql);
      
      while(r.next() && i<5){
          i++;
          String Nom = r.getString("nom");
          String Prenom = r.getString("prenom");
          int Salaire = r.getInt("salaire");
          String Grade = r.getString("grade");
          
          person p=new person();
          
          p.setNom(Nom);
          p.setPrenom(Prenom);
          p.setSalaire(Salaire);
          p.setGrade(Grade);
          
          ps.l.add(p);
            
            
        } 
        
    }   catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionBDD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionBDD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ps;
}
    
    public EffectifTotal getEffectif(){
       EffectifTotal e = new EffectifTotal();
       int tab[]=new int[8];
        for(int i=0;i<8;i++)
            tab[i]=0;
        try {
            
            java.sql.Connection conn = null;
            Statement stmt = null;
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            stmt = conn.createStatement();
            String sql;
            sql="SELECT date_naissance FROM personnel WHERE sex='homme';";
            ResultSet r = stmt.executeQuery(sql);
            while(r.next()){
                String date = r.getString("date_naissance");
               // System.out.println(date);
               String test= date.substring(0,4);
               
               int k = Integer.parseInt(test);
               int age=2017-k;
                //System.out.println(date+"------->"+age);
                if(age>=20 && age<25) tab[0]++;
                if(age>=25 && age<30) tab[1]++;
                if(age>=30 && age<35) tab[2]++;
                if(age>=35 && age<40) tab[3]++;
                if(age>=40 && age<45) tab[4]++;
                if(age>=45 && age<50) tab[5]++;
                if(age>=50 && age<55) tab[6]++;
                if(age>=55 && age<60) tab[7]++;
                
            }
            for(int j=0;j<8;j++)
          e.listHomme.add(tab[j]);
            
            for(int i=0;i<8;i++)
            tab[i]=0;
            
            sql="SELECT date_naissance FROM personnel WHERE sex='femme';";
             r = stmt.executeQuery(sql);
            while(r.next()){
                String date = r.getString("date_naissance");
               // System.out.println(date);
               String test= date.substring(0,4);
               
               int k = Integer.parseInt(test);
               int age=2017-k;
                //System.out.println(date+"------->"+age);
                if(age>=20 && age<25) tab[0]++;
                if(age>=25 && age<30) tab[1]++;
                if(age>=30 && age<35) tab[2]++;
                if(age>=35 && age<40) tab[3]++;
                if(age>=40 && age<45) tab[4]++;
                if(age>=45 && age<50) tab[5]++;
                if(age>=50 && age<55) tab[6]++;
                if(age>=55 && age<60) tab[7]++;
                
            }
            for(int j=0;j<8;j++)
          e.listFemme.add(tab[j]);
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionBDD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionBDD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return e;
    }
    
    public salaire getSALAIRE(){
        salaire s = new salaire();
        float Salaire=0 ;
        try {
            
            
            java.sql.Connection conn = null;
            Statement stmt = null;
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            stmt = conn.createStatement();
            String sql;
            sql="select * from personnel;";
      ResultSet r = stmt.executeQuery(sql);
      while(r.next()){
           Salaire =Salaire + r.getFloat("salaire");
          
      }
      s.masseSalariale=Salaire;
      
      int t=0;
      sql="SELECT COUNT(idpersonnel) as cnt FROM personnel ;";
      r = stmt.executeQuery(sql);
      while(r.next()){
                t = r.getInt("cnt");
                
              }
      
      s.moyenneSalaire=(s.masseSalariale/t);
        //---------------------------------------------------------------
        int n1 = 0;
        sql="SELECT COUNT(idpersonnel) as nbr FROM personnel WHERE salaire >= 58354 ;";
        r = stmt.executeQuery(sql);
        while(r.next()){
                n1 = r.getInt("nbr");
                
              }
        s.setNbrEmpHigh(n1);
        int n2 = t-n1;
        s.setNbrEmpLow(n2);
        //---------------------------------------------------------------
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionBDD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionBDD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
    }
    
    public persons getMauvaisePERSON(){
        persons ps=new persons();
        int i=0;
        
        try {
            
            java.sql.Connection conn = null;
            Statement stmt = null;
            
            //Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            
            //Open a connection
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            stmt = conn.createStatement();
            String sql;
            sql="select * from personnel ORDER BY salaire ASC;";
      ResultSet r = stmt.executeQuery(sql);
      
      while(r.next() && i<5){
          i++;
          String Nom = r.getString("nom");
          String Prenom = r.getString("prenom");
          int Salaire = r.getInt("salaire");
          String Grade = r.getString("grade");
          
          person p=new person();
          
          p.setNom(Nom);
          p.setPrenom(Prenom);
          p.setSalaire(Salaire);
          p.setGrade(Grade);
          
          ps.l.add(p);
            
            
        } 
        
    }   catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionBDD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionBDD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ps;
}
    
    public persons getPersons(){
        persons ps=new persons();
        
        try {
            
            java.sql.Connection conn = null;
            Statement stmt = null;
            
            //Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            
            //Open a connection
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            stmt = conn.createStatement();
            String sql;
            sql="select * from personnel;";
      ResultSet r = stmt.executeQuery(sql);
      
      while(r.next()){
          int id = r.getInt("idpersonnel");
          String Nom = r.getString("nom");
          String Prenom = r.getString("prenom");
          String type = r.getString("type");
          String service = r.getString("service_idservice");
          String dateNais = r.getString("date_naissance");
          int Salaire = r.getInt("salaire");
          String Grade = r.getString("grade");
          
          person p=new person();
          
          p.setId(id);
          p.setNom(Nom);
          p.setPrenom(Prenom);
          p.setType(type);
          p.setService(service);
          p.setDateNaissance(dateNais);
          p.setSalaire(Salaire);
          p.setGrade(Grade);
          
          ps.l.add(p);
            
            
        } 
        
    }   catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionBDD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionBDD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ps;
    }
}
    

