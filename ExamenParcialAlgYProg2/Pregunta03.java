package ExamenParcialAlgYProg2;

import java.util.Scanner;

/*Pregunta 3: Crea una función que convierta un número entero n al sistema de "palotes" 
y devolver el resultado como una cadena de caracteres. Por ejemplo, el número 470213 en 
formato decimal se convertirá en||||-|||||||--||-|-||| en el sistema de palotes.En el 
programa principal, utiliza esta función para verificar su funcionamiento, mostrando el
resultado por pantalla. Ten en cuenta que, dentro de la función, no debe mostrarse nada
en pantalla; la salida debe realizarse únicamente en el programa principalmediante la 
instrucción print.*/
public class Pregunta03 {    
    public static void main(String[] args) {
        //Ingresar un numero
        System.out.print("Ingresa un número entero: ");
        int numero = Integer.parseInt(System.console().readLine());

        //Convertir al sistema de palotes
        String resultado = convertirAPalotes(numero);

        //Mostrar el resultado
        System.out.println("Número en sistema de palotes: " + resultado);
    }
    public static String convertirAPalotes(int numero) {
        StringBuilder resultado = new StringBuilder();
        String numeroStr = String.valueOf(numero);

        for (int i = 0; i < numeroStr.length(); i++) {
            int digito = Character.getNumericValue(numeroStr.charAt(i));

            // Agregar los palotes correspondientes al dígito
            for (int j = 0; j < digito; j++) {
                resultado.append("|");
            }
            //Agregar un separador si no es el último dígito
            if (i < numeroStr.length() - 1) {
                resultado.append("-");
            }
        }
        return resultado.toString();
    }

}
