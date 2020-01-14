/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin14;

/**
 *
 * @author aalvarezbretana
 */
public class Boletin14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ConversorTemperaturas obx = new ConversorTemperaturas();        
        try{System.out.println(obx.centigradosAFarenheit(90));        
        }catch(TemperaturaErradaException fare){
            System.out.println(fare.getMessage());
        }
        try{obx.centigradosAReamur(90);
        }catch(TemperaturaErradaException rea){
            System.out.println(rea.getMessage());
        }
    }    
}
