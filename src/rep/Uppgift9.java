/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rep;

/**
 *
 * @author riste
 */
public class Uppgift9 {
    
    public static void main (String [] args) {
        
        int[] p = new int [5];
        int[] k = new int [5];
    
        p[1] = 4;
        p[3] = 9;
        // tilldelning av värden på de index i fältet som visas ovan.
        
         for (int i = 0; i < p.length; i++) {
            k[i] = p[i]; 
         }
         for (int i = 0; i<p.length; i++) {
             System.out.print(p[i]);
             System.out.println(k[i]);
         }
        
        
    
    }
}
