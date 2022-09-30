/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kap13;

/**
 *
 * @author riste
 */
public class rationellaTal {

    public static void main(String[] args) {

        ratTal tal1 = new ratTal();
        ratTal tal2 = new ratTal();
        ratTal tal3 = new ratTal();

        tal1.täljare = 5;
        tal1.nämnare = 9;

        tal2.täljare = 1;
        tal2.nämnare = 3;

        tal3.täljare = 12;
        tal3.nämnare = 12;

        int i = gemensamN.gemensam(tal3.täljare, tal3.nämnare);
        System.out.print(i);

    }
}
