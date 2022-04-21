  
package Ejercicios;


public class Ejercicio5 {
    public static void main(String[] args) {
        
        /*5-. Un trabajador de la industria de la construcción gana $10 diarios en su 
jornada normal de trabajo. En ciertas ocasiones 
el empleado tiene que trabajar horas extras para cumplir con su trabajo. En el mes a 
acumulado 50 horas extras que se la 
pagan al 10% del valor del pago diario. ¿Cuánto ganara el trabajador al final de un
mes de trabajo? 
Tomar en consideración que al trabajador le descontaran el 10% en concepto de renta.*/
        
        int diario, horaExtra, renta,salario,salarioYhoras, salarioTotal;
        
       diario=10;
   
       
       salario= diario*30;
       horaExtra=50*1;
       salarioYhoras=salario+horaExtra;
       renta=10*salarioYhoras/100;
       
      salarioTotal= salarioYhoras-renta;
     
       
        System.out.println("Ganara el trabajador al final del mes: $"+salarioTotal);
       
    }
}
