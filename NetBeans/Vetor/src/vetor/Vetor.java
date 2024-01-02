/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor;

import java.util.Arrays;

/**
 *
 * @author Matos
 */
public class Vetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  
        int n[] = {3,2,8,7,5,4};
        Arrays.sort(n);
        Arrays.fill(n, 6);
        for(int i:n){
            System.out.println(i);
        }
        int p = Arrays.binarySearch(n, 7);
        System.out.println(p);
    }
    
}
