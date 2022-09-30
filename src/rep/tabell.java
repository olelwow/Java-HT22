/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rep;
import javax.swing.*;
import java.util.*;


/**
 *
 * @author riste
 */
public class tabell {

    public static void main (String [] args) {
        
        double[] p = new double[] {1,2,3,4,5,6,7,8,9,10,11,12};
        
        
        for (int i=0; i<p.length; i++) {
            System.out.println(p[i] + " ");
            for (int j=0; j<=1; j++) {
                System.out.print(Math.sqrt(p[i]) + " ");
                System.out.print(p[i] * p[i] * p[i]);
                
            }
            
            
        }
        
        
        
    }
    
}
