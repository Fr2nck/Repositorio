package ExamenParcialAlgYProg2;
/*Pregunta 6: Crea un programa que dibuje un triángulo relleno de asteriscos (*) 
o de cualquier otro carácter que elija el usuario, según la altura que este ingrese. 
Utiliza una función para hacer el código más sencillo y modular. Por ejemplo, puedes 
crear una función linea(char caracter, int repeticiones) que imprima una línea con el 
carácter especificado, repitiéndo el número de veces indicado. Luego, utiliza esta 
función dentro de un bucle para imprimir las líneas del triángulo, donde cada línea 
tendrá un número creciente de caracteres, según la altura especificada por el usuario.*/
public class Pregunta06{    
    public static void main(String[] args) {
        // Solicitar la altura del triángulo
        System.out.print("Ingrese la altura del triángulo: ");
        int altura = scanner.nextInt();

        // Solicitar el carácter para dibujar el triángulo
        System.out.print("Ingrese el carácter para dibujar el triángulo: ");
        char caracter = scanner.next().charAt(0);

        // Dibujar el triángulo
        dibujarTriangulo(caracter, altura);
    }
        // Función para imprimir una línea con un carácter repetido
        public static void linea(char caracter, int repeticiones) {
            for (int i = 0; i < repeticiones; i++) {
                System.out.print(caracter);
            }
            System.out.println();
        }
    
        // Función para dibujar un triángulo relleno
        public static void dibujarTriangulo(char caracter, int altura) {
            for (int i = 1; i <= altura; i++) {
                linea(caracter, i);
            }
        }
}
