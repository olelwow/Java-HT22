/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kap13;

import javax.swing.*;

/**
 *
 * @author riste
 */
public class positionTest {

    public static void main(String[] args) {

        position landvätter = new position();
        position lkpgBibliotek = new position();
        // Skapar två nya objekt

        landvätter.graderLatitud = 57;
        landvätter.minuterLatitud = 39;
        landvätter.sekunderLatitud = 47;
        landvätter.nord = true;
        landvätter.graderLongitud = 12;
        landvätter.minuterLongitud = 16;
        landvätter.sekunderLongitud = 58;
        landvätter.öst = true;

        lkpgBibliotek.graderLatitud = 58;
        lkpgBibliotek.minuterLatitud = 24;
        lkpgBibliotek.sekunderLatitud = 47;
        lkpgBibliotek.nord = true;
        lkpgBibliotek.graderLongitud = 15;
        lkpgBibliotek.minuterLongitud = 36;
        lkpgBibliotek.sekunderLongitud = 47;
        lkpgBibliotek.öst = true;
        
        // Tilldelning av värden.

        String landvätterUtskrift = ("Landvätters position är: " + landvätter.graderLatitud + "º " + landvätter.minuterLatitud + "\' "
        + landvätter.sekunderLatitud + "\" " + landvätter.graderLongitud + "º " + landvätter.minuterLongitud + "\' "
        + landvätter.sekunderLongitud + "\"");

        String lkpgBibliotekUtskrift = ("Linköpings Stadsbiblioteks position är: " + lkpgBibliotek.graderLatitud + "º " + lkpgBibliotek.minuterLatitud + "\' "
        + lkpgBibliotek.sekunderLatitud + "\" " + lkpgBibliotek.graderLongitud + "º " + lkpgBibliotek.minuterLongitud + "\' "
        + lkpgBibliotek.sekunderLongitud + "\"");
        
        // Skapa variabel för utskriften.

        if (landvätter.nord) {
            landvätterUtskrift = ("Landvätters position är: " + landvätter.graderLatitud + "º " + landvätter.minuterLatitud + "\' "
            + landvätter.sekunderLatitud + "\" " + "N " + landvätter.graderLongitud + "º " + landvätter.minuterLongitud + "\' "
            + landvätter.sekunderLongitud + "\"");

        } else if (landvätter.syd) {
            landvätterUtskrift = ("Landvätters position är: " + landvätter.graderLatitud + "º " + landvätter.minuterLatitud + "\' "
            + landvätter.sekunderLatitud + "\" " + "S " + landvätter.graderLongitud + "º " + landvätter.minuterLongitud + "\' "
            + landvätter.sekunderLongitud + "\"");
        }
        // If sats som kontrollerar ifall det är nord eller syd som är true för latituden.

        if (landvätter.öst) {
            landvätterUtskrift = landvätterUtskrift + " Ö";
        } else if (landvätter.väst) {
            landvätterUtskrift = landvätterUtskrift + " V";
        }
        // Ny if sats som lägger till öst eller väst på longituden beroende på vilken som är true.

        if (lkpgBibliotek.nord) {
            lkpgBibliotekUtskrift = "Linköpings Stadsbiblioteks position är: " + lkpgBibliotek.graderLatitud + "º " + lkpgBibliotek.minuterLatitud + "\' "
            + lkpgBibliotek.sekunderLatitud + "\" " + "N " + lkpgBibliotek.graderLongitud + "º " + lkpgBibliotek.minuterLongitud + "\' "
            + lkpgBibliotek.sekunderLongitud + "\"";

        } else if (lkpgBibliotek.syd) {
            lkpgBibliotekUtskrift = "Linköpings Stadsbiblioteks position är: " + lkpgBibliotek.graderLatitud + "º " + lkpgBibliotek.minuterLatitud + "\' "
            + lkpgBibliotek.sekunderLatitud + "\" " + "S " + lkpgBibliotek.graderLongitud + "º " + lkpgBibliotek.minuterLongitud + "\' "
            + lkpgBibliotek.sekunderLongitud + "\"";

        }
        // If sats som kontrollerar ifall det är nord eller syd som är true för latituden.

        if (lkpgBibliotek.öst) {
            lkpgBibliotekUtskrift = lkpgBibliotekUtskrift + " Ö";

        } else if (lkpgBibliotek.väst) {
            lkpgBibliotekUtskrift = lkpgBibliotekUtskrift + " V";
        }
         // Ny if sats som lägger till öst eller väst på longituden beroende på vilken som är true.

        JOptionPane.showMessageDialog(null, landvätterUtskrift);
        JOptionPane.showMessageDialog(null, lkpgBibliotekUtskrift);

    }
}

