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
public class Uppgift2 {
    
    public static void main (String [] args) {
        
        String input = JOptionPane.showInputDialog("Skriv ordet Programmeringsspråk");
        String nyttOrd = input.substring(7, 10) + input.substring(12, 13);
        
        //Här tas bokstäverna ut ur ordet för att bilda det nya ordet "merg" 
        
        JOptionPane.showMessageDialog(null, nyttOrd);
        
        
    }
}
