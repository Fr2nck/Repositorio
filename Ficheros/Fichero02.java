package Ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Fichero02 {
    public static void main(String[] args) {
        try {
            BufferedReader brNotas = new BufferedReader(new FileReader("C:\\Users\\FRANCK\\Desktop\\Algoritmos y Programacion 2\\Ficheros\\Notas.txt"));
            
            String linea = "0";
            int i = 0;
            double suma = 0;

            while (linea != null ) {
                i++;
                suma += Double.parseDouble(linea);
                linea = brNotas.readLine();
            }
            i--;
            brNotas.close();

            System.out.println("El alumno tiene " + i + " notas");

            System.out.println("%.2f"+"El promedio es: " + suma/(double)i);

        } catch (FileNotFoundException fnfe) {
            System.out.println("No se encontro el fichero Notas.txt");
        }

        // Error (no se pudo leer el fichero)
        catch(IOException ioe){
            System.out.println("No se puede leer el fichero Notas.txt");
        } 
    }
}
