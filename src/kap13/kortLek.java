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
public class kortLek {

    public static void main(String[] args) {

        Kort kort1 = new Kort();
        Kort kort2 = new Kort();
        int färgKort1;
        int färgKort2;
        // Skapar två nya kort, samt varsin int för deras färg. 
        
        kort1.dam = true;
        färgKort1 = Kort.SPADER;

        kort2.kortNummer = 7;
        färgKort2 = Kort.KLÖVER;

        String kort1Ut = "Kortet är ";
        String kort2Ut = "Korter är ";

        if (färgKort1 == 3) {
            if (kort1.dam) {
                kort1Ut = kort1Ut + "spader " + "dam";
            } else if (kort1.knekt) {
                kort1Ut = kort1Ut + "spader " + "knekt";
            } else if (kort1.kung) {
                kort1Ut = kort1Ut + "spader " + "kung";
            } else if (kort1.ess) {
                kort1Ut = kort1Ut + "spader " + "ess";
            }
        }
        
        if (färgKort2 == 0) {
            kort2Ut = kort2Ut + "klöver " + kort2.kortNummer;
        }
        
        
        

        JOptionPane.showMessageDialog(null, kort1Ut);
        JOptionPane.showMessageDialog(null, kort2Ut);

    }

}
