/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package swingrepeat;

import javax.swing.JOptionPane;

/**
 *
 * @author Matos
 */
public class SwingRepeat {
    
    public static void main(String[] args) {
        int n, totalVal, totalEven, overHundred, sum;
        totalVal = totalEven = overHundred = sum = 0;

        do{
           n = Integer.parseInt(JOptionPane.showInputDialog(null, 
                   "<html>For stop, enter <em>0</em>.<br>Enter a number: </html>"));
           totalVal++;
           if(n%2==0) totalEven++;
           if(n > 100) overHundred++;
           sum += n;
        }while (n != 0);
        JOptionPane.showMessageDialog(null, 
                "<html>Total Values: " + totalVal+
                "<br>Total Even: " + totalEven+
                "<br>Total Odd: " + (totalVal-totalEven)+
                "<br>Over a Hundred: "+ overHundred+
                "<br>Avarage of Values"+ (sum/totalVal) +"</html>");
    }
    
}
