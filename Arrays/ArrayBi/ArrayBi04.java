package Arrays.ArrayBi;
public class ArrayBi04 {
    /*Ejercicio 3 Realiza un programa que rellene un array de 6 filas por 10 columnas con números enteros
    positivos comprendidos entre 0 y 1000 (ambos incluidos). A continuación, el programa deberá dar la posición
    tanto del máximo como del mínimo. */
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
        System.out.println("El numero minimo es: " + minimo + " y se encuentra en la posiciòn: " );
    }
}
