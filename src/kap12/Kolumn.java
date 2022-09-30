/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kap12;

/**
 *
 * @author riste
 */
public class Kolumn {
    
    public static void main (String [] args) {
        
        double[][] d2 = new double[5][5];
        double[] f1 = new double[4];
        
        for (int i = 0; i < d2.length; i++) {
            for (int j = 0; j < d2[i].length; j++) {
                d2[i][j] = i + j;
            }
        }
        // Ger värden till fältet
        
        f1 = valjRad(d2, 1);
        
        for (int h = 0; h < f1.length; h++) { 
            System.out.print(f1[h] + "\t");
        }
    }
    
    public static double[] valjRad (double [][] f, int k) {
        double[] kolumn = new double[f[k].length];
        // nytt endimensionell array, Integern specificerar vilken kolumn.
       
        for (int i = 0; i < f[k].length; i++) {
            //Här är värdet K fast, alltså kolumn nummer K. Värdet  i  ökar medans man arbetar sig neråt i kolumnen.
            kolumn[i] = f[k][i];
            }
        return kolumn;
        // Returnerar ett endimensionellt fält, en kopia av kolumn K.
    }
    
}
