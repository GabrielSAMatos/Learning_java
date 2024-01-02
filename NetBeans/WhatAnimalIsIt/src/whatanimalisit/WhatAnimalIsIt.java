/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package whatanimalisit;



/**
 *
 * @author Matos
 */
public class WhatAnimalIsIt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int total = 0;
        int c[] = new int[13];
        for (int i = 0; i<c.length; i++) {
                c[i] = i + i;
        }
        for (int i = 0; i<c.length; i++) {
                total += c[i];
        }
        System.out.println(total);

    }
    
}
