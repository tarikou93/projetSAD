/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;


public class abscent_bean {
  
    private int id=0;
    private String nom="";
    private String prenom ="";
    private String service="";
    private String type="";
    private String motif="";

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getService() {
        return service;
    }

    public String getType() {
        return type;
    }

    public String getMotif() {
        return motif;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setService(String service) {
        this.service = service;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setMotif(String Motif) {
        this.motif = Motif;
    }
    
    
    
}
