/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rep;

/**
 *
 * @author riste
 */
public class repSymmetri {

    public static void main(String[] args) {

        int[][] f = new int[4][4];
        // Symmetriskt med symmetriskt innehåll.
        int[][] f2 = new int[4][4];
        // Symmetriskt med icke symmetriskt innehåll.
        int[][] f3 = new int[4][];
        // Icke symmetriskt.
        f3[0] = new int[2];
        f3[1] = new int[3];
        f3[2] = new int[5];
        f3[3] = new int[2];

        for (int i = 0; i < f.length; i++) {
            for (int j = 0; j < f[i].length; j++) {
                f[i][j] = 1;
            }
        }

        for (int i = 0; i < f2.length; i++) {
            for (int j = 0; j < f2[i].length; j++) {
                f2[i][j] = i+1;
            }
        }

        for (int i = 0; i < f3.length; i++) {
            for (int j = 0; j < f3[i].length; j++) {
                f3[i][j] = (i + 1) * (j + 1);
            }
        }

        System.out.print(arSymmetrisk(f2));

    }

    public static boolean arSymmetrisk(int[][] f) {

        for (int i = 0; i < f.length; i++) {
            for (int j = 0; j < f[i].length; j++) {
                if (f.length != f[i].length) {
                    return false;
                }
            }
        }
        //Denna loop undersöker antal rader och kolumner i fältet, och ger false ifall dessa är olika.
        for (int i = 0; i < f.length; i++) {
            for (int j = 0; j < f[i].length; j++) {
                if (f[i][j] != f[j][i]) {
                    return false;
                }
            }
        }
        // Denna loop undersöker innehållet i fältet, och ger false ifall det inte är samma innehåll i hela fältet.
        return true;
    }

}
