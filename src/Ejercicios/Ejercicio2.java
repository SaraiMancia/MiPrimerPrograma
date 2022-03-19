
package Ejercicios;

import java.text.DecimalFormat;
import java.text.NumberFormat;


public class Ejercicio2 {
    public static void main(String[] args) {
        
 
  NumberFormat formato=new DecimalFormat("#0.00");
        /*Nos piden hacer un programa que calcule el valor de la moneda para los siguientes países: Europa, Reino Unido, 
Australia y Canadá. El programa tiene declarada una variable con el valor $100.00 de tipo double y tenemos que 
realizar la conversión de dólares a las monedas solicitadas. A continuación se muestra los valores de conversión:
1 USD 0.70 Europa 0.61 Reino Unido 0.95 Australia 0.97 Canadá*/
        
        double dolar, USD, EUR, GBP, AUD,CAD,cv1,cv2, cv3,cv4, cv5;
        
        
        dolar= 100.00;
         USD= 1;
         EUR=0.70;
         GBP=0.61;
         AUD=0.95;
         CAD=0.97;
         
         cv1=100.00/USD;
         cv2=100.00/EUR;
         cv3=100.00/GBP;
         cv4=100.00/AUD;
         cv5=100.00/CAD;
         
         System.out.println("Conversion de $100.00 a: ");
         System.out.println("USD: "+formato.format(cv1));
         System.out.println("EUR: "+formato.format(cv2));
         System.out.println("GBP: "+formato.format(cv3));
         System.out.println("AUD: "+formato.format(cv4));
         System.out.println("CAD: "+formato.format(cv5));
    } 
    
}
