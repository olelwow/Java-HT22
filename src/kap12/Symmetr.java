/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kap12;

import java.util.*;

/**
 *
 * @author riste
 */
public class Symmetr {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Skriv in antal rader och kolumner som fältet skall ha.");
        int rader = sc.nextInt();
        int kolumner = sc.nextInt();
        int[][] f = new int[rader][kolumner];

        System.out.println("Skriv in värdena i fältet.");

        for (int i = 0; i < rader; i++) {
            for (int j = 0; i < f[i].length; j++) {
                int value = sc.nextInt();
                f[i][j] = value;
            }
        }

        for (int i = 0; i < f.length; i++) {
            for (int j = 0; i < f[j].length; j++) {
                System.out.print(f[i][j]);
            }
            System.out.println("");
        }
        sc.close();

    }

}
