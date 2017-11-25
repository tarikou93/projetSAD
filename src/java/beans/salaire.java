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
public class salaire {
    public float masseSalariale;
    public float moyenneSalaire;
    
    private int nbrEmpHigh; // nbr des employés ayant un salaire superieur à la moyenne
    private int nbrEmpLow; // nbr des employés ayant un saaire inferieur à la moyenne

    public float getMasseSalariale() {
        return masseSalariale;
    }

    public float getMoyenneSalaire() {
        return moyenneSalaire;
    }

    public void setMasseSalariale(float masseSalariale) {
        this.masseSalariale = masseSalariale;
    }

    public void setMoyenneSalaire(float moyenneSalaire) {
        this.moyenneSalaire = moyenneSalaire;
    }

    public int getNbrEmpHigh() {
        return nbrEmpHigh;
    }

    public int getNbrEmpLow() {
        return nbrEmpLow;
    }

    public void setNbrEmpHigh(int nbrEmpHigh) {
        this.nbrEmpHigh = nbrEmpHigh;
    }

    public void setNbrEmpLow(int nbrEmpLow) {
        this.nbrEmpLow = nbrEmpLow;
    }
    
    
    
}
