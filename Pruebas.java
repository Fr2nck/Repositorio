import java.util.ArrayList;

public class Pruebas {
    public static void main(String[] args) {

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
