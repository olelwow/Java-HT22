/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kap13;

import javax.swing.*;
import java.util.*;

/**
 *
 * @author riste
 */
public class Koordinater {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        RPunkt a = new RPunkt();
        Punkt b = new Punkt();

        try {
            String s1 = JOptionPane.showInputDialog("Skriv in R");

            Scanner sc = new Scanner(s1);
            a.r = sc.nextDouble();
            //Inläsning av r

            String s2 = JOptionPane.showInputDialog("Skriv in vinkeln i grader.");

            sc = new Scanner(s2);

            a.Vinkel = sc.nextDouble();
            b = koordinat(a);
            // objektet som returneras av metoden hamnar i ny punkt b.
        } catch (Exception e) {
            String s1 = JOptionPane.showInputDialog("Skriv in R, endast decimaltal!");

            Scanner sc = new Scanner(s1);
            a.r = sc.nextDouble();
            //Inläsning av r

            String s2 = JOptionPane.showInputDialog("Skriv in vinkeln i grader, endast decimaltal");

            sc = new Scanner(s2);

            a.Vinkel = sc.nextDouble();
            b = koordinat(a);
            // objektet som returneras av metoden hamnar i ny punkt b.
        }

        JOptionPane.showMessageDialog(null, "X = " + b.x + " Y = " + b.y);
        // Skriver ut koordinater för b

    }

    public static Punkt koordinat(RPunkt p) {

        Punkt K = new Punkt();

        K.x = p.r * Math.cos(p.Vinkel);

        K.y = p.r * Math.sin(p.Vinkel);
        return K;
    }
}
