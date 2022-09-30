/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kap12;

import java.io.*;
import java.util.*;

/**
 *
 * @author riste
 */
public class provResultat {

    public static void main(String[] args) throws IOException {

        int radNr = 0;
        int prov = 0;
        int resultatRad = 0;
        int summa = 0;
        int snitt = 0;

        String[] namn = new String[30];
        // fält för namn
        int[][] resultat = new int[30][5];
        //fält för provresultat

        Scanner fil = new Scanner(new File("prov.txt"));
        // Ny scanner för fil.

        while (fil.hasNext()) {
            if (!fil.hasNextInt()) {
                namn[radNr] = fil.next();
                namn[radNr] = namn[radNr] + " " + fil.next();

                // Lägger förnamn och efternamn i string array, ökar radNr med ett.
            }
            if (fil.hasNextInt()) {

                for (int i = 0; i < resultat[0].length; i++) {
                    resultat[resultatRad][i] = fil.nextInt();
                    // Läser in provresultat till fältet resultat.

                    summa = summa + resultat[resultatRad][i];
                    // Summa för elev.

                }
                System.out.println(namn[radNr] + ": " + summa / 5);
                //Skriver ut genomsnitt för elev.
                resultatRad++;
                radNr++;
                summa = 0;
                // Återställer summa till 0. 
            }

        }

        for (int k = 0; k < resultat[0].length; k++) {
            for (int h = 0; h < resultat[k].length; h++) {
                snitt = snitt + resultat[h][k];

                // Räkna ut snittpoäng per prov.
            }
            prov++;
            System.out.println("Prov " + prov + ": " + snitt / 5);
            snitt = 0;
            // Återställ snitt till 0 för varje varv.

        }

    }
}
