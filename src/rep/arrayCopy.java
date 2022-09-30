/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rep;

/**
 *
 * @author riste
 */
public class arrayCopy {
    
    public static void main (String [] args) {
        
        
        double[] k = new double[5];
        double[] g = new double[5];
        
        k[0] = 2.2;
        k[1] = 3.5;
        k[2] = 44.5;
        k[3] = 23.3;
        k[4] = 44.12;
        
        for (int i = 0; i < k.length; i++) {
            System.out.print(k[i] + "\t");
        }
        // Skriver ut fält k.
        
        
        arrayKopia(k, 2, g, 0, 2);
        // Anropar min metod arrayKopia för att kopiera valda värden från k till g.
        System.out.println("");
        
        for (int i = 0; i < g.length; i++) {
            System.out.print(g[i] + "\t");
        }
        //Skriver ut fält g.
       
        
        
        
    }
    
    public static double[] arrayKopia (double[] f, int sp1, double[] g, int sp2, int antal) {
        // Kopiera från f till g, från sp1 (startposition1) i f, till sp2 i g. Sista int anger antal element som ska kopieras. 
        
        for (int i = 0; i < antal; i++) {
             g[sp2] = f[sp1];
             //Kopia av valt värde.
             sp1++;
             sp2++;
             // Ökar båda dessa med 1 för att komma framåt i fältet. 
            
        }
        
        
        return g;
    }
    
}
