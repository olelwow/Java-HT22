/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rep;

import javax.swing.*;
import java.util.*;
import java.io.*;

/**
 *
 * @author riste
 */
public class repFalt {

    public static void main(String[] args) throws IOException {
        String[][] S = new String[3][3];
        int[][] I = new int[3][3];
        // skapar utrymme i de två fälten.
        

        Scanner sc = new Scanner(new FileReader("provRes.txt"));
        
       // skapar scanner för läsning av filen

        if (sc.hasNextInt()) {
            for (int i = 0; i < I.length; i++) {
                for (int j = 0; j < I[i].length; j++) {
                    I[i][j] = sc.nextInt();
                }
            }
        }
        // Lägger in värden från filen.
        
        sc = new Scanner(new FileReader("namn.txt"));

        if (sc.hasNext()) {
            for (int i = 0; i < S.length; i++) {
                for (int j = 0; j < S[i].length; j++) {
                    S[i][j] = sc.next();
                }
            }
        }
        // Läser in namn

        
        
        for (int i = 0; i < I.length; i++) {

            for (int j = 0; j < I[i].length; j++) {

                System.out.print("Prov " + (j + 1) + ":" + "\t" + I[i][j] + "\t");
            }
            System.out.println("");
        }
        // Utskrift. 
    }
}
