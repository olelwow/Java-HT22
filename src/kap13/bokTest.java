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
public class bokTest {
        
        public static void main (String [] args) {
            
            Bok a = new Bok();
            Bok b = new Bok();
            // Skapa nya objekt
            
            a.titel = "Java steg för steg";
            a.forfattare = "Jan Skansholm";
            a.pris = 499.99;
            a.sidantal = 500;
            // Tilldela värden till objekten
            
            b.titel = "Arthas, rise of the Lich King";
            b.forfattare = "Christie Golden";
            b.sidantal = 416;
            b.pris = 83.71;
            
            String aUtskrift = a.titel + "\n" + "Skriven av " + a.forfattare + "\n" + a.sidantal + " sidor" +  "\nKostar " + a.pris + " kr";
            String bUtskrift = b.titel + "\n" + "Skriven av " + b.forfattare + "\n" + b.sidantal + " sidor" +  "\nKostar " + b.pris + " kr";
            
            JOptionPane.showMessageDialog(null, aUtskrift);
            JOptionPane.showMessageDialog(null, bUtskrift);
            
            //Utskrift
            
            
            
        }
}
