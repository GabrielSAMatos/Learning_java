/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package function01;

import javaclass.Factorial;

/**
 *
 * @author Matos
 */
public class Function01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Factorial f = new Factorial();
        f.setValue(5);
        System.out.print(f.getFormule());
        System.out.println(f.getFactorial());

    }
    
}
