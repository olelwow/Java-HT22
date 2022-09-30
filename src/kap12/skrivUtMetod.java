/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kap12;

/**
 *
 * @author riste
 */
public class skrivUtMetod {
     public static void ändra (int [][] f) {
        for (int i = 0; i < f.length; i++) {
            for (int j = 0; j < f[i].length; j++) {
                f[i][j] = i + j;
            }
        }
    }
    
    public static void skrivUt(int[][] f) {
        for (int i = 0; i < f.length; i++) {
            // rad 0, 1, 2 osv
            for (int j = 0; j < f[i].length; j++) {
                // loop för kolumn.
                System.out.print(f[i][j] + "\t");
                
            }
            System.out.println("");
        }
    }
    
    public static void main (String [] args) {
        
        int [][] a = new int[10][7];
        
        ändra(a);
        skrivUt(a);
        
        
        
        
    }
    
   
    
}
