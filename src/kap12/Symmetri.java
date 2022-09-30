/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kap12;

import java.util.*;

/**
 *
 * @author riste
 */
public class Symmetri {

    public static void main(String[] args) {

        String k = "";
        String[] s = new String[4];
        int[] F = new int[4];
        int[][] f = new int[4][4];

        // Skapar fält.
        Scanner sc = new Scanner(System.in);
        

        try {
            System.out.println("Skriv in antal heltal som matchar fältet.");
            for (int i = 0; i < f.length; i++) {
                k = sc.nextLine();
                s = k.split(" ");
                // Läser in en hel rad i taget som String från kommandofönstret, splittar den i fyra.

                for (int j = 0; j < s.length; j++) {
                    F[j] = Integer.parseInt(s[j]);
                    // Konvertering till int för vart och ett av heltalen.
                    f[i][j] = F[j];
                    // Kopiering av fältet till 2d fält.

                }
                F = new int[4];
            }
        }catch (Exception e) {
            System.out.println("Skriv in antal heltal som matchar fältet.");
            for (int i = 0; i < f.length; i++) {
                k = sc.nextLine();
                s = k.split(" ", s.length);
                // Läser in en hel rad i taget som String från kommandofönstret, splittar den i fyra.

                for (int j = 0; j < s.length; j++) {
                    F[j] = Integer.parseInt(s[j]);
                    // Konvertering till int för vart och ett av heltalen.
                    f[i][j] = F[j];
                    // Kopiering av fältet till 2d fält.

                }
                F = new int[4];
            }
            
        }
        /*for (int g = 0; g < f.length; g++) {
            for (int h = 0; h < f[g].length; h++) {
                System.out.print(f[g][h] + " ");
            }
            System.out.println("");
            
        }
         */
        if (symmetrisk(f)) {
            System.out.println("Fältet är symmetriskt");
        } else {
            System.out.println("Fältet är inte symmetriskt");
        } 
    }

    public static boolean symmetrisk(int[][] f) {
        

        for (int g = 0; g < f.length; g++) {
            for (int h = 0; h < f[g].length; h++) {
                if (f[g].length != f.length) {
                    return false;
                    // Undersöker längd på fältet, returnerar false ifall de inte är symmetriska i längd.
                }
            }
        }
        {
            for (int i = 0; i < f.length; i++) {
                for (int j = 0; j < f[i].length; j++) {
                    if (f[i][j] != f[j][i]) {
                        return false;
                        //Undersöker innehållet i fältet.
                    } 
                }
            }
        }
        return true;
    }

}
