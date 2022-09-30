/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kap12;

/**
 *
 * @author riste
 */
public class kopiaDel {

    public static void main(String[] args) {

        int[][] f = new int[4][4];

        for (int i = 0; i < f.length; i++) {
            for (int j = 0; j < f[i].length; j++) {
                f[i][j] = (i + 1) * (j + 1);
            }
        }
        // Tilldelar värden i fältet

        int[][] ny = valjDel.valjDel(f, 0, 1, 0, 3);
        // Nytt fält som innehåller endast de delarna som man själv väljer. t.ex från rad 0 till 1, kolumn 0 till 3.

        for (int i = 0; i < ny.length; i++) {
            for (int j = 0; j < ny[i].length; j++) {
                System.out.print(ny[i][j] + "\t");
            }
            System.out.println("");
        }
        // Skriv ut fält.

    }

}
