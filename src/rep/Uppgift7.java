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
public class Uppgift7 {
    
    public static void main (String [] args) {
        
        String input = JOptionPane.showInputDialog("Skriv in ett tal med minst fem siffror");
        //Input med 5 siffror från användaren
        int res = 0;
    
        String h, j, k, l, m;
        int a, b, c, d, e;
        boolean korrekt = true;   
        
        while (korrekt){
        try {
            h = input.substring(0,1); //Första siffran osv..
            j = input.substring(1,2);
            k = input.substring(2,3);
            l = input.substring(3,4);
            m = input.substring(4,5);
            
            a = Integer.parseInt(h); //Konvertera till int
            b = Integer.parseInt(j);
            c = Integer.parseInt(k);
            d = Integer.parseInt(l);
            e = Integer.parseInt(m);
            res = metodUppgift7.sifferSum(a, b, c, d, e); //Räkna ut summan
            korrekt = false; 
        }
        catch (Exception E) {
            input = JOptionPane.showInputDialog("Talet måste innehålla minst 5 siffror!");
        }
        }
      
            
          
           
        JOptionPane.showMessageDialog(null, res);
        
        
    }
    
}
