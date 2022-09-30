/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author riste
 */
public class kopiaText {

    public static void main(String[] args) throws IOException {

        BufferedReader in;
        PrintWriter ut;
        String input, output, rad;
        Scanner sc;
        
        // När try catch används så deklareras allt här uppe, utan att tilldela några värden från början.
        

        try {
            input = JOptionPane.showInputDialog("Skriv in filnamnet som du vill läsa ifrån.");
            output = JOptionPane.showInputDialog("Skriv in filnamnet som du vill skriva till.");
            in = new BufferedReader(new FileReader(input));
            ut = new PrintWriter(new BufferedWriter(new FileWriter(output, true)));

            sc = new Scanner(in);
        } catch (Exception e) {
            input = JOptionPane.showInputDialog("Skriv in filnamnet som du vill läsa ifrån i formatet \"filnamn.txt\"");
            output = JOptionPane.showInputDialog("Skriv in filnamnet som du vill skriva till i formatet \"filnamn.txt\"");
            in = new BufferedReader(new FileReader(input));
            ut = new PrintWriter(new BufferedWriter(new FileWriter(output, true)));
            sc = new Scanner(in);
            // DEKLARERA SCANNER MED INSTRÖMMEN SOM PARAMETER!!
            // Try catch kräver att allt som har med varandra att göra ligger i blocket. 
            
            
        }

        while (sc.hasNextLine()) {
            rad = sc.nextLine();

            if (rad == null) {
                break;
            }
            if (rad.contains("Det var en gång")) {
                // Boolean uttryck i parenteserna, som kollar om raden innehåller given String. 
                ut.println(rad);
            }
            if (rad.contains("General")) {
                ut.println(rad);
            }
        }
        ut.close();
        // GLÖM INTE ATT STÄNGA UTSTRÖM!!!!!
    }

}
