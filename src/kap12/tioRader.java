/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kap12;

/**
 *
 * @author riste
 */
public class tioRader {
    
    public static void main (String [] args) {
        
        int [][] a = new int[10][10];
        // skapar nytt fält med 10x10 platser
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (i + 1) * (j + 1);
            }
        }
        // Tilldelar värden till fältet, Multiplikationstabell
        
        
        for (int h = 0; h < a.length-1; h++) {
            System.out.println("");
            //Byter rad varje varv.
            
            for (int k = 0; k < a[h].length-1; k++) {
                System.out.print(a[h][k] + " ");
                // Skriver ut specificerad platss siffra/siffror. 
            }
        }
            
        
    }
    
}
