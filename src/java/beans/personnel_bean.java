/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;

/**
 *
 * @author Goth Zack
 */
public class personnel_bean {
 
    public int id_per=0;
    public int id_serv=0;
    public String Nom_="";
    public String Prenom_="";
    public String Date_naiss="";
    public String Date_emb="";
    public String sexe="";
    public String type_="";
    public int echelon_=0;
    public int salaire_=0;
    public String grade_="";
    public String statut_="";
    public String lieu_res="";
    public boolean cadre_=false;
    public boolean formation_=false;
    public int duree_contrat=0;
    /******************Initialisation*******************/
     public void intialiser(int id_serv,String Nom_,String Prenom_,String Date_naiss,String Date_emb,String sexe,String type_,int echelon_,int salaire_,String grade_,String statut_,String lieu_res,boolean cadre_,boolean formation_,int duree_contrat) throws ClassNotFoundException, SQLException
     {
    this.id_per=this.intialiser_id();
    this.id_serv=id_serv;
    this.Nom_=Nom_;
    this.Prenom_=Prenom_;
    this.Date_naiss=Date_naiss;
    this.Date_emb=Date_emb;
    this.sexe=sexe;
    this.type_=type_;
    this.echelon_=echelon_;
    this.salaire_=salaire_;
    this.grade_=grade_;
    this.statut_=statut_;
    this.lieu_res=lieu_res;
    this.cadre_=cadre_;
    this.formation_=formation_;
    this.duree_contrat=duree_contrat;
     
    }
    
    /*************************recperation du ID prochain*****************************/
     public int intialiser_id() throws ClassNotFoundException, SQLException
     {
    
    Class.forName("com.mysql.jdbc.Driver");  
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sad","root","");  
    Statement stmt=con.createStatement();  
    ResultSet rs=stmt.executeQuery("SELECT COUNT( idpersonnel) From   `personnel` "); 
    int u=0; 
    if(rs.next())
    u= rs.getInt(1);
             
     return u+1;
     }
     
              public void inscription_personnel() throws ClassNotFoundException, SQLException, ParseException
     {
         Class.forName("com.mysql.jdbc.Driver");  
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sad","root","");  
  
 
String query = " INSERT INTO `personnel`  VALUES (?, ?, ?, ?,?,?,?,?,?,?,?, ?, ?, ?,?,?)";//(`idpersonnel`, `service_idservice`, `nom`, `prenom`,`date_`)
      // create the mysql insert preparedstatement
      PreparedStatement preparedStmt = con.prepareStatement(query);

      
      preparedStmt.setInt (1,this.id_per );
      preparedStmt.setInt (2, this.id_serv );
      preparedStmt.setString (3, this.Nom_);
      preparedStmt.setString (4,this.Prenom_ );
      //preparedStmt.setDate(1,formatter.parse(this.Date_naiss) );
      preparedStmt.setString (5, this.Date_naiss);
      preparedStmt.setString (6,this.sexe);
      preparedStmt.setString (7,this.type_ );
      preparedStmt.setString(8, this.Date_emb);
      preparedStmt.setInt (9,this.echelon_ );
      preparedStmt.setInt (10, this.salaire_ );
      preparedStmt.setString (11, this.grade_ );
      preparedStmt.setString (12,this.statut_ );
      preparedStmt.setString (13,this.lieu_res );
      preparedStmt.setBoolean (14,this.cadre_);
      preparedStmt.setBoolean (15, this.formation_ );
      preparedStmt.setInt (16,this.duree_contrat );


      // execute the preparedstatement
      preparedStmt.execute();
     }
     
     
   
}
