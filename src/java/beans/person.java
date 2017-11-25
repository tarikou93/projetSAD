/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author Tarek
 */
public class person {
    private int id;
    private String nom;
    private String prenom;
    private String type;
    private String dateNaissance;
    private String service;
    private String grade;
    private float salaire;

    public int getId() {
        return id;
    }
    
    
    public String getType() {
        return type;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public String getService() {
        return service;
    }
    
    
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getGrade() {
        return grade;
    }

    public float getSalaire() {
        return salaire;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    public void setType(String type) {
        this.type = type;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public void setService(String service) {
        this.service = service;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setSalaire(float salaire) {
        this.salaire = salaire;
    }
    
    
}
