
package Ejercicios;


public class Ejercicio4 {
    public static void main(String[] args) {
        /*4-. Si un trabajador de la empresa privada está afiliado a las AFP y los 
        porcentajes que se paga a las AFP es de 6% por parte del 
trabajador y 6.5% por parte del empleador, si el empleado gana $500 al mes, 
        ¿Cuánto está pagando a la AFP el trabajador en 
concepto de empleado y de empleador?*/
        
       double  empleador;
       int empleado,salario;
       
       
       salario = 500;
       
       empleado= 6*salario/100;
       
       empleador= 6.5*salario/100;
       
        System.out.println("Esta pagando al AFP lo siguiente: ");
        System.out.println("Empleado: $"+empleado);
        System.out.println("empleador: $"+empleador);
    }
}
