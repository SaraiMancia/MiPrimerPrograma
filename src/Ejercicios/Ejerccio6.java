
package Ejercicios;


public class Ejerccio6 {
    public static void main(String[] args) {
        
        double parcial1,parcial2, parcial3, parcial4, parcial5,promedioFinal;
        
        parcial1=25*9.0/100;//25% primer examen.Nota del parcial: 9.0
        parcial2=15*7.5/100;//15% segundo examen.Nota del pacial: 7.5
        parcial3=15*9.0/100;//15% tercer examen.Nota del parcial: 9.0
        parcial4=20*8.0/100;//20% cuarto examen: Nota del parcial:8.0
        parcial5=25*9.0/100;//25% QUINTO EXAMEN: Nota del pacial: 9.0
        
        promedioFinal= parcial1+parcial2+parcial3+parcial4+parcial5;
        
        System.out.println("El promedio final del ciclo del estudiante es: "+promedioFinal);
    }
}
