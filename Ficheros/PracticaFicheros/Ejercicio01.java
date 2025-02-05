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
                    bwNumPrimos.write(String.valueOf(i));
                }else if (i == 2) {
                    bwNumPrimos.write(String.valueOf(i));;
                }else{
                    boolean esPrimo = true;
                    for (int j = 2; j <= 500 ; j++) {
                        if (i % j == 0) {
                            esPrimo = false;
                            break;                       
                        }
                    }
                    if (esPrimo) {
                    bwNumPrimos.write(String.valueOf(i));
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
    }
}