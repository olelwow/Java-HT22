/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rep;

/**
 *
 * @author riste
 */
public class sorterat {

    public static void main(String[] args) {

        double[] k = new double[5];
        double[] f = new double[5];

        k[0] = 1.0;
        k[1] = 2.3;
        k[2] = 3.4;
        k[3] = 4.33;
        k[4] = 5.55;

        f[0] = 5.12;
        f[1] = 2.22;
        f[2] = 4.35;
        f[3] = 1.09;
        f[4] = 3.45;

        System.out.print(arSorterat(k));

    }

    public static boolean arSorterat(double[] f) {

        boolean s = false;

        for (int i = 1; i < f.length; i++) {
            // Går igenom hela fältet, med hjälp av for loop. Sätter i till 1 eftersom man senare använder sig av uttrycket i -1
            // För att kontrollera föregående värde.
            
            
            if (f[i] > f[i - 1]) {
                s = true;
                // ifall detta uttryck är sant sätts variabel s till true, och for loopen fortsätter.
                
            } else if (f[i] < f[i -1]) {
                return false;
                // Om detta uttryck blir sant så returneras false, och metoden avbryts. 
            }

        }

        return s;
        // Returnerar s i slutet, kommer endast hit om man har gått igenom hela fältet. 
    }
}
