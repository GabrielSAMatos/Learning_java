/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package function01;

/**
 *
 * @author Matos
 */
public class Factorial {
    
    private int num = 0;
    private int fat = 1;
    private String formule = "";
    
    public void setValue(int n){
        num = n;
        int f = 1;
        String s = "";
        for(int c = n; c > 1; c--){
            f *= c;
            s += c + "x";
        }
        s += "1= ";
        fat = f;
        formule = s;
    }
    
    public int getFactorial(){
        return fat;
    }
    
    public String getFormule(){
        return formule;
    }
}
