/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package developer;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class AreaDeUnCirculo {
    public static void main(String[] args) {
        NumberFormat formato=new DecimalFormat("#0.00");
        
        double area, radio;
        final double pi=3.1416;
        
        area=145;
        radio=Math.sqrt(area/pi);
        System.out.println("Radio: "+formato.format(radio)+" cm");
    }
    
}
