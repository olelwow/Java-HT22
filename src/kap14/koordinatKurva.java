/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kap14;

import java.io.*;
import javax.swing.*;
import java.util.*;

/**
 *
 * @author riste
 */
public class koordinatKurva {

    public static void main(String[] args) throws IOException {

        Scanner sc;
        punkt[] falt = new punkt[11];
        int k = 0;
        File fil = new File("kurva.txt");
        sc = new Scanner(fil);

        // Skapar scanner, samt fält med plats för alla objekt av klassen punkt.
        for (int i = 0; i < falt.length; i++) {
            falt[i] = new punkt();
        }
        // Skapar nya objekt i fältet.

        while (sc.hasNextDouble()) {

            falt[k].x = sc.nextDouble();
            falt[k].y = sc.nextDouble();
            k++;
        }
        // Läser in koordinaterna från filen till fältet.

        for (int i = 0; i < falt.length; i++) {
            if (falt[i].x < 0 && falt[i].y < 0) {
                JOptionPane.showMessageDialog(null, falt[i].x + " " + falt[i].y);
                break;
            } 
            // Söker igenom fältet och ger meddelande när båda punkterna är negativa. 
        }

    }

}
