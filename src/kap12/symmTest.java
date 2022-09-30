/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kap12;

/**
 *
 * @author riste
 */
public class symmTest {

    public static void main(String[] args) {
        int[][] a = new int[3][];
        a[0] = new int[3];
        a[1] = new int[2];
        a[2] = new int[3];

        int[][] f = new int[4][4];

        int[][] h = new int[4][4];

        for (int i = 0; i < h.length; i++) {
            for (int j = 0; j < h[i].length; j++) {
                h[i][j] = (i + 1) * (j + 1);
            }
        }

        System.out.println(Symmetri.symmetrisk(f));
        System.out.println(Symmetri.symmetrisk(a));

    }
}
