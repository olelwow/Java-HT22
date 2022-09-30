/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kap12;

/**
 *
 * @author riste
 */
public class valjDel {

    public static int[][] valjDel(int[][] f, int r1, int r2, int k1, int k2) {

        int[][] falt = new int[r2 + 1][k2 + 1];
        // Skapar fält som har de två största heltalen som antal rader samt kolumner. 

        for (int i = r1; i < r2 + 1; i++) {
            for (int j = k1; j < k2 + 1; j++) {
                falt[i][j] = f[i][j];
            }
        }
        // Tilldelar innehåll till det nya fältet. 

        return falt;
    }

}
