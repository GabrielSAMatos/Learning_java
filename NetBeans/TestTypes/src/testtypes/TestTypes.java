/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testtypes;

/**
 *
 * @author Matos
 */
public class TestTypes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int age = 24;
        
        String value = Integer.toString(age);
        int valueInt = Integer.parseInt(value);
        float valueFloat = Float.parseFloat(value);
        
        System.out.println(value);
        System.out.println(valueInt);
        System.out.println(valueFloat);
        
        float num1 = (float) 2;
        float num2 = (float) 2;
        float res = num1 + num2;
        System.out.println(res);
    }
    
}
