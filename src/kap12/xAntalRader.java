/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kap12;
import javax.swing.*;
/**
 *
 * @author riste
 */
public class xAntalRader {
    
    public static void main (String [] args) {
        
        String input = JOptionPane.showInputDialog("Hur många rader ska fältet ha?");
        String input2 = JOptionPane.showInputDialog("Hur många kolumner ska fältet ha?");
        
        int p = Integer.parseInt(input);
        int k = Integer.parseInt(input2);
       
        // Inläsning av storlek på fält, samt konvertering till int.
        
        
        int [][] a = new int[p][k];
        
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (i + 1) * (j + 1);
            }
        }
        System.out.print("Hej");
       //Lägger in värden i fältet
        
        for (int h = 0; h < a.length; h++) {
            for (int l = 0; l < a[h].length; l++) {
                System.out.print(a[h][l] + " ");
            }
            System.out.println("");
        }
        //Skriver ut fältet.
        
        
    }
    
}
