package Poo.Cubo;
public class Cubo {
    //Atributos
    int capacidad, contenido;
    //Capacidad = Litros maximos que caben en el cubo, Contenido = Litros actuales del cubo
    //Metodos
        //Constructor
    Cubo(int cap){
        this.capacidad = cap;
    }
        //Getter
    public int getcapacidad(){
        return this.capacidad;
    }
    public int getcontenido(){
        return this.contenido;
    }
        //Setter
    public void setcapacidad(int litros){
        this.capacidad = litros;
    }
    public void setcontenido(int litros){
        this.contenido = litros;
    }
        //Otros metodos
    public void vacia(){
        this.contenido = 0;
    }
    public void lleno(){
        this.contenido = capacidad;
    }
    public int faltante(int cap, int con){
        return cap-con;
    }
}
