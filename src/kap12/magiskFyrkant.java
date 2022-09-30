/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kap12;

/**
 *
 * @author riste
 */
public class magiskFyrkant {
    
    public static void main (String [] args) {
        
        
        
    }
    
    public static boolean magisk(int[][] f) {
        boolean s = false;

        for (int g = 0; g < f.length; g++) {
            for (int h = 0; h < f[g].length; h++) {
                if (f[g].length != f.length) {
                    return s;
                    // Undersöker längd på fältet, returnerar false ifall de inte är symmetriska i längd.
                }
            }
        }
        {
            for (int i = 0; i < f.length; i++) {
                for (int j = 0; j < f[i].length; j++) {
                    if (f[i][j] == f[j][i]) {
                        s = true;
                        //Undersöker innehållet i fältet.

                    } else {
                        return s;
                    }
                }
            }
        }
        return s;
    }
    
}
