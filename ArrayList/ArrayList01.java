package ArrayList;

import java.util.ArrayList;

public class ArrayList01 {
    public static void main(String[] args) {
        //Inicializamos el arrayList
        ArrayList<String> myList = new ArrayList<String>();

        //Imprimimos la cantidad de elementos de la lista
        System.out.println("Mi lista inicial tiene " + myList.size() + " elementos");
        
        //Agregamos elementos a la lista
        myList.add("Rojo");
        myList.add("Verde");
        myList.add("Morado");
        myList.add("Azul");
        
        //Imprimimos la lista y la cantidad de elementos de la lista
        System.out.println(myList);
        System.out.println("Mi lista final tiene " + myList.size() + " elementos");

        //Imprimimos un elemento en especifico
        System.out.println("El segundo elemento es el color: " + myList.get(1));

        /*ArrayList que contenga numeros*/
        //Inicializamos el arrayList
        ArrayList<Integer> myListNumbers = new ArrayList<Integer>();

        //Agregamos elementos a la lista
        for (int i = 1 ; i <= 5; i++) {
            myListNumbers.add(i);
        }

        //Imprimir la lista
        System.out.println("La lista contiene los siguiente elementos: " + myListNumbers );
    }
}
