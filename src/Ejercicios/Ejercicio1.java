
package Ejercicios;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Ejercicio1 {
    public static void main(String[] args) {
        
        /*Se tienen 4 resistencias en paralelo R1 = 5.1 ohm,
        R2 = 68 ohm, R3 = 75 ohm y R4 = 82 ohm; obtener la resistencia 
equivalente*/
        
          NumberFormat formato=new DecimalFormat("#0.00");
        
        double R1,R2,R3,R4, Req, Rdeno;
        R1=5.1;
        R2=68;
        R3=75;
        R4=82;
        
        Rdeno= ((1/R1)+(1/R2)+(1/R3)+(1/R4));
        Req = 1/Rdeno;
        
        System.out.println("La resistencia equivalente es: "+formato.format(Req));
    }
}
