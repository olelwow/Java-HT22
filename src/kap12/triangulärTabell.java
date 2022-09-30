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
public class triangulärTabell {
    
    public static void main (String [] args) {
    
    String rader = JOptionPane.showInputDialog("Hur många rader skall tabellen ha?");
    
    int rad = Integer.parseInt(rader);
    
    int [][] a = new int [rad][];
    
    
    
    for (int i = 0; i < a.length; i++) {
        a[i] = new int[i + 1];
        
        for (int m = 1; m < a[i].length; m++) {
            
            a[i][m] = (i + 1) * (m + 1);
        }
    }
    
    for (int k = 0; k < a.length; k++) {
        for (int h = 0; h <a[k].length; h++) {
            System.out.print(a[k][h] + " ");
        }
        System.out.println("");
            
    }
    
    
    }
    
}
