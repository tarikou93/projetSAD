/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tarek
 */
public class absence {
    private int annee;
    public List listeAbsence = new ArrayList();

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public List getListeAbsence() {
        return listeAbsence;
    }
    
    
    
}
