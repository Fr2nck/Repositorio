package EjerciciosArrayList;

import java.util.ArrayList;

/*Ejercicio 3 Escribe un programa que ordene 10 números enteros introducidos por teclado 
y almacenados en un objeto de la clase ArrayList.*/
public class Ejercicio03 {
    public static void main(String[] args) {

        //Inicializamos el arrayList
        ArrayList<Integer> ListNumbers = new ArrayList<Integer>();

        //Agregamos elementos a la lista
        System.out.println("Ingresa 10 numeros para agregarlos a la lista: ");
        for (int i = 1 ; i <= 3; i++) {
            int numero = Integer.parseInt(System.console().readLine());
            ListNumbers.add(numero);
        }

        // Mostrar todos los elementos del ArrayList
        System.out.println("El ArrayList contiene los siguientes elementos: ");
        for (Integer numeros:ListNumbers){
            System.out.println(numeros);
        }
    }
}
