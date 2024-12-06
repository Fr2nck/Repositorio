package Arrays.ArrayBi;

import java.util.HashSet;
import java.util.Set;

public class ArrayBi05{
    /*Ejercicio 3 Realiza un programa que rellene un array de 6 filas por 10 columnas con números enteros
    positivos comprendidos entre 0 y 1000 (ambos incluidos). A continuación, el programa deberá dar la posición
    tanto del máximo como del mínimo. */
    public static void main(String[] args) {
        int[][] numeros = new int[6][10];
        Set<Integer> generados = new HashSet<>();
        int fila,columna;
        int filamax = 0;
        int columnamax = 0;
        int filamin = 0;
        int columnamin = 0;
        //Llenar el arreglo con numeros aleatorios        
        for (fila = 0; fila < 6; fila++) {
            for (columna = 0; columna < 10; columna++) {
                int numero;
                do {
                    numero = (int)(Math.random() * 1001); // Generar un número aleatorio
                } while (generados.contains(numero)); // Repetir hasta que no esté en el conjunto
                numeros[fila][columna] = numero;
                generados.add(numero); // Agregar al conjunto
            }
        }
        //Señalizador de columnas
        System.out.print("        ");
        for (columna = 0; columna < 10; columna++) {
            System.out.print("   Columna " + columna);
        }
        System.out.println();
        //Imprimir el array
        for (fila = 0; fila < 6; fila++) {
            //Señañizacor de filas
            System.out.print("Fila: " + fila + "|");
            for (columna = 0; columna < 10; columna++) {
                System.out.printf("%12d", numeros[fila][columna]);
            }    
            System.out.println();        
        }
        //Declaracion de variables para maximo y minimo
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        //Maximo
        for (fila = 0; fila < 6; fila++) {
            for (columna = 0; columna < 10; columna++) {
                if (numeros[fila][columna] > maximo) {
                    maximo = numeros[fila][columna];
                    filamax = fila;
                    columnamax = columna;
                } 
            }          
        }
        //Minimo
        for (fila = 0; fila < 6; fila++) {
            for (columna = 0; columna < 10; columna++) {
                if (numeros[fila][columna] < minimo) {
                    minimo = numeros[fila][columna];
                    filamin = fila;
                    columnamin = columna;
                }
            }          
        }
        System.out.println("El numero maximo es: " + maximo + " y se encuentra en la posiciòn: " + "(" + filamax + "," + columnamax + ")");
        System.out.println("El numero minimo es: " + minimo + " y se encuentra en la posiciòn: " + "(" + filamin + "," + columnamin + ")");
    }
}
