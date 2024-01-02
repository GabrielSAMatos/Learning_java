/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package condtionalsstructures;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Matos
 */
public class CondtionalsStructures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        /*System.out.print("Enter a first number: ");
        float n1 = k.nextFloat();
        System.out.print("Enter a second number: ");
        float n2 = k.nextFloat();
        float avarage = (n1 + n2)/2;
        if (avarage > 7){
            System.out.println("U passed");
        }else{
            System.out.println("U didn't passed");
        }*/
        Calendar cy = Calendar.getInstance();
        int currentYear = cy.get(Calendar.YEAR);
        System.out.print("Digit your year of birth: ");
        int yearOfBirth = k.nextInt();
        int age = currentYear - yearOfBirth;
        boolean legal = age >= 18;
        if (legal){
            System.out.println("You are of legal age. You are "+age+" years old.");
        }else{
            System.out.println("You aren't of legal age.You are "+age+" years old.");
        }
    }
    
}
