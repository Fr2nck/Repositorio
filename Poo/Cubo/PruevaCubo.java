package Poo.Cubo;
public class PruevaCubo {
    public static void main(String[] args) {
        Cubo cubo01 = new Cubo(10, 3);
        Cubo cubo02 = new Cubo(5, 1);
        Cubo cubo03 = new Cubo(15, 10);

        //Indicar el numero de cubo, su capacidad  y el contenido que ya contiene
        System.out.println("El primer cubo tiene una capacidad de : " + cubo01.capacidad + " Litros y contiene " + cubo01.contenido);
        System.out.println("El sgundo cubo tiene una capacidad de : " + cubo02.capacidad + " Litros y contiene " + cubo02.contenido);
        System.out.println("El tercer cubo tiene una capacidad de : " + cubo03.capacidad + " Litros y contiene " + cubo03.contenido);
    }
}
