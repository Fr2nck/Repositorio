package Ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Fichero01 {
    public static void main(String[] args) {

        try {            
            // Almacena la informacion (caracter por caracter) en tiempo real
            BufferedReader brAbancay =new BufferedReader(new FileReader("C:\\Users\\FRANCK\\Desktop\\Algoritmos y Programacion 2\\Ficheros\\Abancay.txt"));
            String linea = "";

            // Estructura para leer las lineas del archibo
            while (linea != null) {
                System.out.println(linea);
                linea = brAbancay.readLine();
            }
            
            // Cerrar la estructura
            brAbancay.close();

        // Mostrar errores
        // Error (no se encontro el fichero)
        } catch (FileNotFoundException fnfe) {
            System.out.println("No se encontro el fichero Abancay.txt");
        }

        // Error (no se pudo leer el fichero)
        catch(IOException ioe){
            System.out.println("No se puede leer el fichero Abancay.txt");
        }

    }
}
