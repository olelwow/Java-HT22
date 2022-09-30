/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rep;

/**
 *
 * @author riste
 */
public class roteraArray {
    
    public static void main (String [] args) {
        int j = 2;
        int[] a = new int[3];
        
        a[0] = 30;
        a[1] = 40;
        a[2] = 60;
        
        System.out.println("Original:");
        
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
        
        for (int i = 2; i < a.length-1; i--) {
            a[i] = a[i];
            j--;
        }
        System.out.println("\nRoterad:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
        
        
        
    }
    
}
