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
public class EffectifTotal {
    public List listHomme = new ArrayList();
    public List listFemme = new ArrayList();
    
    private int nbrHomme;
    private int nbrFemme;

    public int getNbrHomme() {
        return nbrHomme;
    }

    public int getNbrFemme() {
        return nbrFemme;
    }

    public void setNbrHomme(int nbrHomme) {
        this.nbrHomme = nbrHomme;
    }

    public void setNbrFemme(int nbrFemme) {
        this.nbrFemme = nbrFemme;
    }
    
    
}
