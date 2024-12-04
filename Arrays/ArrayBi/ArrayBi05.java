package Arrays.ArrayBi;
public class ArrayBi05 {
    /*Ejercicio 4 Modifica el programa anterior de tal forma que no se repita ningún número en el array.*/
    public static void main(String[] args) {
        int[][] numeros = new int[6][10];
        int fila,columna;
        for (fila = 0; fila < 6 ; fila++) {
            for (columna = 0; columna < 10; columna++) {
                numeros[fila][columna] = (int)(Math.random() *1001); 
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
        //Maximo
        int maximo = 0;
        int minimo = 1000;
        for (fila = 0; fila < 6; fila++) {
            for (columna = 0; columna < 10; columna++) {
                if (numeros[fila][columna] > maximo) {
                    maximo = numeros[fila][columna];
                } 
            }          
        }
        System.out.println("El numero maximo es: " + maximo + " y se encuentra en la posiciòn: " );
        //Minimo
        for (fila = 0; fila < 6; fila++) {
            for (columna = 0; columna < 10; columna++) {
                if (numeros[fila][columna] < minimo) {
                    minimo = numeros[fila][columna];
                }
            }          
        }
        System.out.println("El numero minimo es: " + minimo + " y se encuentra en la posiciòn: "  );
    }
}