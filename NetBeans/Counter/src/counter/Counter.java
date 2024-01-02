/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package counter;

/**
 *
 * @author Matos
 */
public class Counter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int c = 3, recp = 1;
        while (c>0) {
            recp *= c;
            c--;
            }
            System.out.println(recp);
        }
    
}
