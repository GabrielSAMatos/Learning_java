/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primitivetypes;

import java.util.Scanner;

/**
 *
 * @author Matos
 */
public class PrimitiveTypes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter the studant's name: ");
        String name = keyboard.nextLine();
        System.out.print("Enter the studant's grade: ");
        float grade = keyboard.nextFloat();
        
        System.out.println("The grade is: " + grade);
        System.out.printf("The grade of %s is: %.1f \n", name, grade);
        System.out.format("The grade of %s is: %.1f \n", name, grade);
               
    }
    
}
