/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rep;

import java.util.*;

/**
 *
 * @author riste
 */
public class nummerJamnt {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        int num; 

        System.out.println("Skriv ett nummer");
        num = sc.nextInt();
        
        if (num % 2 == 0) {
            System.out.println("1");
        }else{
            System.out.println("0");
        }

    }
}
