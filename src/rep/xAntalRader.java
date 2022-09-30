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
public class xAntalRader {

    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("Hur många rader skall tabellen ha?");
        String input2 = JOptionPane.showInputDialog("Hur många kolumner skall tabellen ha?");

        int num1 = Integer.parseInt(input);
        int num2 = Integer.parseInt(input2);

        int[][] falt = new int[num1][num2];

        for (int i = 0; i < falt.length; i++) {
            for (int j = 0; j < falt[i].length; j++) {
                falt[i][j] = (i + 1) * (j + 1);
            }
        }

        for (int i = 0; i < falt.length; i++) {
            for (int j = 0; j < falt[i].length; j++) {
                System.out.print(falt[i][j] + "\t");
            }
            System.out.println("");
        }

    }

}
