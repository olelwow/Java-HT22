/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kap13;

/**
 *
 * @author riste
 */
public class gemensamN {

    public static int gemensam(int m, int n) {

        double r;

        r = m % n;

        r = (int) r;

        if (r == 0) {
            return n;
        } else if (r != 0) {
            m = n;
            n = (int) r;

        }
        return n;
    }

}
