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
public class BilTest {
    
    public static void main (String [] args) {
        
        Bil a = new Bil();
        Bil b = new Bil();
        Person p = new Person();
        Person q = new Person();
        
        double skatt1, skatt2;
        
        
       
        
        
        a.Ägare = new Person();
        a.Ägare.förnamn = "Olle";
        a.Ägare.efternamn = "Ristenstrand";
        a.Ägare.född = 1998;
        a.arsModell = 1998;
        a.fab = "Fiat";
        a.regNrText = "ABC";
        a.regNr = 123;
        a.motorEffekt = 175;
        a.tjansteVikt = 2500;
        skatt1 = a.tjansteVikt * Bil.skatt;
        // Tilldelning av värden samt uträkning av årsskatt.
        
        b.Ägare = new Person();
        b.Ägare.förnamn = "Danne";
        b.Ägare.efternamn = "Persson";
        b.Ägare.född = 1998;
        b.arsModell = 2005;
        b.fab = "Kia";
        b.regNrText = "NTO";
        b.regNr = 512;
        b.motorEffekt = 150;
        b.tjansteVikt = 1500;
        skatt2 = b.tjansteVikt * Bil.skatt;
        // Tilldelning av värden samt uträkning av årsskatt.
        
        String bil1 = a.Ägare.förnamn + " " + a.Ägare.efternamn + "s " +a.fab + ":\n" + "Årsmodell: " + a.arsModell + "\n" + "Regnr: " + a.regNrText + " " + a.regNr +
                                    "\nMotoreffekt(HK): " + a.motorEffekt + "\nTjänstevikt: " + a.tjansteVikt + "\nÅrsskatt: " + skatt1 + " kr";
        String bil2 = b.Ägare.förnamn + " " + b.Ägare.efternamn + "s " + b.fab + ":\n" + "Årsmodell: " + b.arsModell + "\n" + "Regnr: " + b.regNrText + " " + b.regNr +
                                    "\nMotoreffekt(HK): " + b.motorEffekt + "\nTjänstevikt: " + b.tjansteVikt + "\nÅrsskatt: " + skatt2 + " kr";
        
        JOptionPane.showMessageDialog(null, bil1);
        JOptionPane.showMessageDialog(null,bil2);
    }
    
}
