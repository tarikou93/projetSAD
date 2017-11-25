/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BDD;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author panika
 */
public class testmain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException {
        // TODO code application logic here
        ConnectionBDD cx=new ConnectionBDD();
        // System.out.println(cx.getCADRE().getCadre());
        //System.out.println(cx.getCADRE().getNon_cadre());
        // System.out.println(cx.getRDV().getZ());
        
           // System.out.println(cx.getPERSON().l.get(4).getNom());
            //System.out.println(cx.getPERSON().l.get(4).getGrade());
            //System.out.println(cx.getPERSON().l.get(4).getPrenom());
            //System.out.println(cx.getPERSON().l.get(4).getSalaire());
            System.out.println("femme :/n");
            System.out.println(cx.getEffectif().listFemme.get(1));
            System.out.println("homme :/n");
            System.out.println(cx.getEffectif().listHomme.get(0));
        
        
    }
    
}
