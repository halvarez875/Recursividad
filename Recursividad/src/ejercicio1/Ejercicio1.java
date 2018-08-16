/*1) (Visualización de la recursión ) Es interesante ver “en acción” a la recursión.Modifique el método factrn ( factorial ) 
para que imprima su variable local y el parámetro de llamada de la recursión. Por cada llamada recursiva, presente su salida
en una línea independiente y agregue un nivel de sangría. Haga su mejor esfuerzo por hacer que la salida sea clara, 
interesante y significativa. Su meta aquí es diseñar e implementar un formato de salida que ayude a la gente a entender 
mejor la recursión. Tal vez desee agregar estas capacidades de presentación a los otros ejercicios del práctico.*/

package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ejercicio1 FACTORIAL");
        System.out.print("Ingrese un numero:");
        int nro = scanner.nextInt();
        factorial(nro);
        System.out.println("El factorial es: " + factorial(nro));
        }
    
    public static int factorial(int n){
        int i;
        
        if(n == 1){
            return n;
        }
        
        i = n-1;
        System.out.println(""+n +"*"+i +"!");
        return  n*factorial(n-1);
        
    }
}
