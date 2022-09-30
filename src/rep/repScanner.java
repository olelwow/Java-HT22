/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rep;

import java.util.*;
import javax.swing.*;

/**
 *
 * @author riste
 */
public class repScanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nums = 0;

        while (true) {
            if (sc.hasNextInt());
            {
                nums = nums + sc.nextInt();
            }
            if (!sc.hasNext()) {
                break;
            }
        System.out.print(nums);
        }
        
        
        
        

        

    }
}
