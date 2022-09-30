/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rep;

/**
 *
 * @author riste
 */
public class division {
    
    public static void main (String [] args) {
        
        
        System.out.print("Divided by 3:\n");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.print("\nDivided by 5:\n");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.print("\nDivided by 3 and 5:\n");
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.print(i + ", ");
            }
        }
        
        
        
    }
    
}
