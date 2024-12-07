package Funciones;
public class Funciones02 {
    public static void main(String[] args) {
        System.out.print("Ingresa el primero numero: ");
        int n1 = Integer.parseInt(System.console().readLine());
        System.out.print("Ingresa el segundo numero: ");
        int n2 = Integer.parseInt(System.console().readLine());
        //Imprimir las operaciones llamando a las funciones
        System.out.println("La suma es: " + (misuma(n1, n2)));
        System.out.println("La resta es: " + (miresta(n1, n2)));
        System.out.println("La multiplicaciòn es: " + (mimultiplicacion(n1, n2)));
        System.out.println("La diviciòn es: " + (midivicion(n1, n2)));
    }
    //Funciones para las operaciones
    public static int misuma(int x, int y) {
        return x + y; 
    }
    public static int miresta(int x, int y) {
        return x - y; 
    }
    public static int mimultiplicacion(int x, int y) {
        return x * y; 
    }
    public static double midivicion(int x, int y) {
        return (double)x / (double)y; 
    }
}
