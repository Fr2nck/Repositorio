package Ficheros.PracticaFicheros;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;


public class Ejercicio01 {
    /*Pregunta 1 Escribe un programa que guarde en un fichero con nombre primos.dat
     los números primos que hay entre 1 y 500.*/
    public static void main(String[] args) {

        try {BufferedWriter bwNumPrimos = new BufferedWriter(new FileWriter("C:\\Users\\FRANCK\\Desktop\\Algoritmos y Programacion 2\\Ficheros\\EjerciciosConFicheros\\Primos.dat"));
            for (int i =10; i <= 500; i++) {
                if (i<= 1) {
                    bwNumPrimos.write(i);
                }else if (i == 2) {
                    bwNumPrimos.write(i);;
                }else{
                    boolean esPrimo = true;
                    for (int j = 2; j <= 500 ; j++) {
                        if (i % j == 0) {
                            esPrimo = false;
                            break;                       
                        }
                    }
                    if (esPrimo) {
                    bwNumPrimos.write(i);
                    }
                }
            }
            bwNumPrimos.close();

            System.out.println("Se agregaron correctamente los numeros primos que hay entre 1 y 500");
            
        } catch (FileNotFoundException fnfe) {
            System.out.println("No se encontro el fichero.");
        }

        // Error (no se pudo leer el fichero)
        catch(IOException ioe){
            System.out.println("No se puede leer el fichero.");
        }



        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*//Determinar si un numero es primo o no
        for (int i = 0; i < numeros.length; i++) {
            //Si un numero es menor o igual a 1 se determina que no es primo
            if (numeros[i]<= 1) {
                noprimos[indexnoprimos++] = numeros[i];
            //Si un numero es igual a 2 es un numero primo
            } else if (numeros[i] == 2) {
                primos[indexprimos++] = numeros[i];          
            } else {
                //Variable auxiliar
                boolean esPrimo = true;
                //verificar si el numero tiene mas divisores ademas de 1 y de si mismo
                for (int j = 2; j <= Math.sqrt(numeros[i]) ; j++) {
                    if (numeros[i] % j == 0) {
                        esPrimo = false;
                        break;                       
                    }
                }
                if (esPrimo) {
                    primos[indexprimos++] = numeros[i];
                } else{
                    noprimos[indexnoprimos++] = numeros[i];
                }              
            }
        } */
    }
}