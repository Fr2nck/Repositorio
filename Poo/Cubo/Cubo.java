package Poo.Cubo;
public class Cubo {
    //Atributos
    int capacidad, contenido;
    //Capacidad = Litros maximos que caben en el cubo, Contenido = Litros actuales del cubo
    //Metodos
        //Constructor
    Cubo(int cap, int con){
        this.capacidad = cap;
        this.contenido = con;
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
}
