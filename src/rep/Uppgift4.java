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
public class Uppgift4 {
    public static void main (String [] args) {
        
        String input = JOptionPane.showInputDialog("Skriv in ett tal med minst fem siffror");
        //input med 5 siffror från användaren
        int res = 0;
    
        String h, j, k, l, m;
        int a, b, c, d, e;
           
            h = input.substring(0,1); //första siffran osv..
            j = input.substring(1,2);
            k = input.substring(2,3);
            l = input.substring(3,4);
            m = input.substring(4,5);
            
            a = Integer.parseInt(h); //konvertera till int
            b = Integer.parseInt(j);
            c = Integer.parseInt(k);
            d = Integer.parseInt(l);
            e = Integer.parseInt(m);
            
            res = res + a + b + c + d + e; //Räkna ut summan
            
            
        
        
        
        
        JOptionPane.showMessageDialog(null, res);
        
        
    }
}
