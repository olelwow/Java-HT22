/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rep;

/**
 *
 * @author riste
 */
public class tioRader {
    
    public static void main (String [] args) {
        
        int [][] tio = new int [10][10];
        
        for (int i = 0; i < tio.length; i++) {
            for (int j = 0; j < tio[i].length; j++) {
                tio[i][j] = (i + 1) * (j + 1); 
            }
        }
        for (int i = 0; i < tio.length; i++) {
            for (int j = 0; j < tio[i].length; j++) {
                System.out.print(tio[i][j] + "\t");
            }
            System.out.println("");
        }
    }
    
}
