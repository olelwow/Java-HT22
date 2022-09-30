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
public class kolSum {
    
    public static void main (String [] args) {
        
        double [][] falt = new double [5][4];
        
        falt[0][3] = 1.0;
        falt[1][3] = 0.1;
        falt[2][3] = 0.01;
        falt[3][3] = 0.001;
        
        double sum = kolSumm(falt, 3);
        
        System.out.println(sum);
        
        
    }
    
    public static double kolSumm (double [][] f, int k) {
        double sum = 0;
        
        for (int i = 0; i < f.length; i++) {
            sum = sum + f[i][k];
             }
        return sum;
    }
    
}
