/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kap10;
import java.io.*;
/**
 *
 * @author riste
 */
public class LasFil {
    
    public static void main (String [] args) throws IOException {
        BufferedReader in = new BufferedReader (new FileReader("lista.txt") );
        
        int radNr = 0;
        
        while (true) {
            String rad = in.readLine();
            if (rad == null) {
                break;
            }
            radNr++;
            System.out.println(radNr + ": " + rad);
            
        }
    }
    
   
    
}
