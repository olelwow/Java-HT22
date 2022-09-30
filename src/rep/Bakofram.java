/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package rep;
import javax.swing.*;
import java.util.*;
/**
 *
 * @author riste
 */
public class Bakofram {
    
    public static void main (String [] args) {
        String input = JOptionPane.showInputDialog("Skriv en text."); 
        String result = ""; 
        
       
        
        for (int i = 0; i<input.length(); i++) {
            result = result + input.substring(i);
        }
        
        
        
        JOptionPane.showMessageDialog(null, result); 
    }
    
}
