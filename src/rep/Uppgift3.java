/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rep;
import javax.swing.*;
/**
 *
 * @author riste
 */
public class Uppgift3 {
    
    public static void main (String [] args) {
        
        String hastighet = JOptionPane.showInputDialog("Hur fort kör du?");
        int lyse = JOptionPane.showConfirmDialog(null, "Har du lyset på?");
        int fart = Integer.parseInt(hastighet);
        //Inputs av användaren, som ger värdet på hur fort man kör och om man har lyset på eller ej.
        
        
        if (fart == 50 && lyse == 0) {
            JOptionPane.showMessageDialog(null, "TACK!");
        }
        else if (fart > 50 && lyse == 0) {
            JOptionPane.showMessageDialog(null, "OBS. DU KÖR FÖR FORT!");
        }
        else if (fart > 50 && lyse == 1) {
            JOptionPane.showMessageDialog(null, "OBS! Dubbelfel!");
            //Dubbelfel vid fortkörning samt inget lyse på.
        }
        else if (fart < 50 && lyse == 0) {
            JOptionPane.showMessageDialog(null, fart);
            
            
            
        }
        
        
    }
}
