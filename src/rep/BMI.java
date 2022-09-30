/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rep;

import java.awt.HeadlessException;
import javax.swing.*;
import java.io.*;

/**
 *
 * @author riste
 */
public class BMI {

    public static void main(String[] args) throws IOException {

        BufferedReader in;
        PrintWriter ut;
        String input = "";
        String output = "";

        String namnAdress = "";
        String nums = "";
        double BMI = 0.0;
        double hojd = 0.0;
        String[] numsArray = new String[3];
        int[] sifferArray = new int[3];

        try {
            input = JOptionPane.showInputDialog("Skriv in filnamnet på filen du vill läsa.");
            output = JOptionPane.showInputDialog("Skriv in filnamnet på filen du vill skriva till.");
            in = new BufferedReader(new FileReader(input));
            ut = new PrintWriter(new BufferedWriter(new FileWriter(output, true)));

        } catch (Exception e) {

            input = JOptionPane.showInputDialog("Skriv in filnamnet på filen du vill läsa i format \"Filnamn.txt\"");
            output = JOptionPane.showInputDialog("Skriv in filnamnet på filen du vill skriva till i format \"Filnamn.txt\"");
            in = new BufferedReader(new FileReader(input));
            ut = new PrintWriter(new BufferedWriter(new FileWriter(output, true)));
        }
        // Inläslning av filnamn.

        //Skapar in/utströmmar
        while (true) {
            namnAdress = in.readLine();
            nums = in.readLine();
            // Läser in namn och adress till namnAdress, och siffrorna till nums.

            if (namnAdress == null) {
                break;
            } else if (nums == null) {
                break;
            }
            // Om någon av dessa är null, avbryt läsningen

            numsArray = nums.split(" ");
            // Lägger in siffrorna i String array.
            for (int i = 0; i < sifferArray.length; i++) {
                sifferArray[i] = Integer.parseInt(numsArray[i]);
            }
            // Gör om siffrorna till Int, lägger dem i ny int array.

            hojd = (double) sifferArray[1] / 100;
            hojd = Math.pow(hojd, 2);
            // Uträkning av BMI

            BMI = sifferArray[2] / hojd;
            //Uträkning av BMI

            if (BMI >= 30) {
                ut.println(namnAdress);
                ut.println(nums);
            }
            // Ifall BMI överstiger 30, lägg in personernas uppgifter i ny fil. 

        }
        ut.close();
        // Stäng utström.

    }
}
