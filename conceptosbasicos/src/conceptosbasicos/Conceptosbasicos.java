/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conceptosbasicos;

import ico.fes.Automovil;
import java.awt.Color;

/**
 *
 * @author diego
 */
public class Conceptosbasicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Automovil miBocho = new Automovil();
        miBocho.setMarca("VW");
        miBocho.setSubmarca("Sedan");
        miBocho.setModelo(1970);
        miBocho.setColor(Color.BLUE);
        System.out.println(miBocho);
        
        Automovil miAcura = new Automovil();
        miAcura.setMarca("Acura");
        miAcura.setSubmarca("NSX");
        miAcura.setModelo(2013);
        miAcura.setColor(Color.GRAY);
        System.out.println(miAcura);
        
        Automovil miMustang = new Automovil();
        miMustang.setMarca("Ford");
        miMustang.setSubmarca("Mustan");
        miMustang.setModelo(2010);
        miMustang.setColor(Color.yellow);
        System.out.println(miMustang);
        
        Automovil miGolf = new Automovil();
        miGolf.setMarca("VW");
        miGolf.setSubmarca("Golf");
        miGolf.setModelo(2021);
        miGolf.setColor(Color.RED);
        System.out.println(miGolf);
        
        
        
        
    }
    
}
