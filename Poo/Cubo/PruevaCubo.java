package Poo.Cubo;
public class PruevaCubo {
    public static void main(String[] args) {
        Cubo cubo01 = new Cubo(10);
        Cubo cubo02 = new Cubo(5);
        Cubo cubo03 = new Cubo(15);

        //Indicar el numero de cubo, su capacidad  y el contenido que ya contiene
        System.out.println("El primer cubo tiene una capacidad de : " + cubo01.capacidad);
        System.out.println("El sgundo cubo tiene una capacidad de : " + cubo02.capacidad);
        System.out.println("El tercer cubo tiene una capacidad de : " + cubo03.capacidad);
        //Indicar si el cubo esta lleno o vacio
        System.out.println("El primer cubo esta: ");
    }
}
