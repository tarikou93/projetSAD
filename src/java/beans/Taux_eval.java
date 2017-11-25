/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author Goth Zack
 */
public class Taux_eval {
    private int id=0;
    private String nom="";
    private String prenom ="";
    private String service="";
    private String type="";
    private double taux_ev=0.0;

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

    public double getTaux_ev() {
        return taux_ev;
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

    public void setTaux_ev(double taux_ev) {
        this.taux_ev = taux_ev;
    }
    
    
    
}
