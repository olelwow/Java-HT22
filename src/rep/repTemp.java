/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rep;

import javax.swing.*;
import java.io.*;
import java.util.*;

/**
 *
 * @author riste
 */
public class repTemp {

    public static void main(String[] args) throws IOException {

        String input;
        String rad = "";
        int varde = 0;
        int resultat = 0;
        int min = 0;
        int max = 0;

        try {
            input = JOptionPane.showInputDialog("Skriv in namnet på filen som skall läsas.");

        } catch (Exception e) {
            input = JOptionPane.showInputDialog("Skriv in namnet på filen som skall läsas, i formatet filnamn.txt");

        }
        BufferedReader in = new BufferedReader(new FileReader(input));

        while (true) {
            rad = in.readLine();

            if (rad == null) {
                break;
            }
            varde = Integer.parseInt(rad);
            
            if (varde >= max) {
                max = varde;
                min = varde;
            }
            if (varde < min) {
                min = varde;
            }
            
            resultat = resultat + varde;
            
            

        }

        JOptionPane.showMessageDialog(null, "Medeltemperatur: " + resultat / 31 + " Maxtempereatur: " + max + " Mintemperatur: " + min);
    }
}
