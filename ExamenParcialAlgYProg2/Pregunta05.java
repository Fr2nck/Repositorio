package ExamenParcialAlgYProg2;

/*Pregunta 5: Crea una función que convierta cada dígito de un número n en su palabra 
correspondiente y devuelva el resultado como una cadena de caracteres. Por ejemplo, 
el número 470213 se convertiría en: "cuatro, siete, cero, dos, uno, tres". Ten en cuenta
 que las palabras deben estar separadas por comas, pero no debe haber una coma al final
  de la última palabra. Utiliza esta función en un programa para comprobar su correcto 
  funcionamiento. Recuerda que no se debe mostrar nada desde la función; la salida debe 
  generarse exclusivamente en el programa principal utilizando la instrucción print.*/
public class Pregunta05{
      public static void main(String[] args) {
        //Ingresar un numero
        System.out.print("Ingresa un número entero: ");
        int numero = Integer.parseInt(System.console().readLine());
        // Convertir el número a palabras
        String resultado = convertirAPalabras(numero);
        // Mostrar el resultado
        System.out.println("Número en palabras: " + resultado);
    }
    // Función que convierte un número en palabras
    public static String convertirAPalabras(int numero) {
      // Tabla de palabras para los dígitos del 0 al 9
      String[] palabras = {"cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};

      StringBuilder resultado = new StringBuilder();
      String numeroStr = String.valueOf(numero);

      for (int i = 0; i < numeroStr.length(); i++) {
          int digito = Character.getNumericValue(numeroStr.charAt(i));
          resultado.append(palabras[digito]);

          // Agregar una coma si no es el último dígito
          if (i < numeroStr.length() - 1) {
              resultado.append(", ");
          }
      }
      return resultado.toString();
  }
}
