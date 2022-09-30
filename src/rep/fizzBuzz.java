/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rep;

/**
 *
 * @author riste
 */
public class fizzBuzz {
    
    public static void main (String [] args) {
        
        for (int i = 1; i <= 100; i++) {
            
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            }else if (i % 3 == 0) {
                System.out.println("Fizz");
            }else if (i % 5 == 0) {
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }
            
        }
        
    }
    
}
