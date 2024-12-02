package Arrays.ArrayBi;
public class ArrayBi03 {
    /*Ejercicio 2 Escribe un programa que pida 20 números enteros. Estos números se deben
    introducir en un array de 4 filas por 5 columnas. El programa mostrará las sumas 
    parciales de filas y columnas igual que si de una hoja de cálculo se tratara. 
    La suma total debe aparecer en la esquina inferior derecha. */
    public static void main(String[] args) {
        int[][] numeros = new int[5][6];
        int fila, columna;
        for (fila = 0; fila < 4; fila++) {
            for (columna = 0; columna < 5; columna++) {
                System.out.print("Ingresa un valor para la posicion " +fila+","+columna + ": ");
                numeros[fila][columna] = Integer.parseInt(System.console().readLine()) ;
            }
        }
        for (int i = 0; i < numeros.length; i++) {
            
        }
        //Imprimir el señalizador de columnas
        System.out.print("        ");
        for (columna = 0; columna < 5; columna++) {
            System.out.print("   Columna " + columna);
        }
        System.out.println();
        //Imprimir el señañizacor de filas
        for (fila = 0; fila < 5; fila++) {
            System.out.print("Fila: " + fila + "|");
            for (columna = 0; columna < 6; columna++) {
                System.out.printf("%10d", numeros[fila][columna]);
            }    
            System.out.println();
        }          
    }
}
