/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rep;
import javax.swing.*;
/**
 *
 * @author riste
 */
public class objektRep {
    
    
    
    public static void main(String[] args) {
            
            Person p = new Person();
            Person q = new Person();
            
            p.fornamn = "Olle";
            p.efternamn = "Ristenstrand";
            p.föddÅr = 1998;
            p.stad = "Linköping";
            
            p.singel = true; 
            
            
            
            q.fornamn = "Jocke";
            q.efternamn = "Klassesson";
            q.föddÅr = 2007;
            q.stad = "Spörtköping";
            
            q.singel = false;
          
            
            String utskrift1 = "Hej " + p.fornamn + " " + p.efternamn + "." + "\n" + "Du är ";
            String utskrift2 = "Hej " + q.fornamn + " " + q.efternamn + "." + "\n" + "Du är ";
            
            if (!p.singel) {
                utskrift1 = utskrift1 + "inte ";
            } utskrift1 = utskrift1 + "singel";
            
            if (p.föddÅr <= 2005) {
                utskrift1 = utskrift1 + "\n" + "Du är vuxen!";
            }else {
                utskrift1 = utskrift1 + "\n" + "Du är inte vuxen!";
            }
            
            if (!q.singel) {
                utskrift2 = utskrift2 + "inte ";
            } utskrift2 = utskrift2 + "singel";
            
            if (q.föddÅr <= 2005) {
                utskrift2 = utskrift2 + "\n" + "Du är vuxen!";
            }else {
                utskrift2 = utskrift2 + "\n" + "Du är inte vuxen!";
            }
            
            
            
            
            JOptionPane.showMessageDialog(null, utskrift1);
            JOptionPane.showMessageDialog(null, utskrift2);
            
            
    }

    

    
}
