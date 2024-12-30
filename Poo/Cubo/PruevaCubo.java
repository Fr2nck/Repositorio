package Poo.Cubo;
public class PruevaCubo {
    public static void main(String[] args) {
        Cubo cubo01 = new Cubo(10);
        Cubo cubo02 = new Cubo(5);
        Cubo cubo03 = new Cubo(15);
        //Indicar el numero de cubo, su capacidad
        System.out.println("El primer cubo tiene una capacidad de : " + cubo01.capacidad);
        System.out.println("El sgundo cubo tiene una capacidad de : " + cubo02.capacidad);
        System.out.println("El tercer cubo tiene una capacidad de : " + cubo03.capacidad);
        //Ingresa contenido a los cubos
        System.out.println("Ingresa la cantidad de litros para el primer cubo: ");
        int  = Integer.parseInt(System.console().readLine());
        //Indicar si el cubo esta lleno o vacio
        System.out.println("Para llenar el primer cubo faltan: " + Cubo.faltante(cap, con));
    }
}
