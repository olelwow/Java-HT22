/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rep;

/**
 *
 * @author riste
 */
public class repObjekt {
   static class Person {
        String fornamn;
        String efternamn;
        int foddAr;
        
    }
    static class Konto {
        Person kontohavare;
        int saldo;
        static int ranta;
    }
    public static void main (String [] args) {
        
        Konto K = new Konto();
        Person P = new Person();
        
        K.kontohavare = new Person();
        K.kontohavare.fornamn = "Olle";
        K.saldo = 2000;
        
        
        String utskrift = "Hej " + K.kontohavare.fornamn + "!" + "\nDitt saldo är: " + K.saldo + " Kr";
        
        System.out.print(utskrift);
        
        
    }
    
    
}
