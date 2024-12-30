package Poo.Gato;
public class Gato {
    //Atributos
    String color,raza,sexo;
    int edad;
    double peso;

    //Metodos

    //Constructor
    Gato(String c,String r,String s,int e,double p){
        this.color = c;
        this.raza = r;
        this.sexo = s;
        this.edad = e;
        this.peso = p;
    }
    //getter
    String getcolor(){
        return this.color;
    }
    String getraza(){
        return this.raza;
    }
    String getsexo(){
        return this.sexo;
    }
    int getedad(){
        return this.edad;
    }
    double getpeso(){
        return this.peso;
    }
    //Hacer que el gato maulle
    void maullar(){
        System.err.println("Miauuuuu, Miauuuuu");
    }
    //Hacer que el gato ronronee
    /*A los gatos les gusta solo el pescado*/
    void come(String comida){
        if (comida.equals("pescado")) {
            System.out.println("Ñam, Ñam!!!!!");
        } else {
            System.out.println("Guacala!!!!!");
        }
    }
    //Hacer que dos gatos se conoscan
    //Si el gato es macho se pelean, si es hembra ronronean juntos
    void peleaCon(Gato contrincante){
        if (this.sexo.equals("hembra")) {
            System.out.println("Vamos a ronrronear!!!!!");
        } else {
            if (contrincante.getsexo().equals("hembra")) {
                System.out.println("Vamos a ronrronear!!!!!");
            } else {
                System.out.println("Ven aqui te voy a moler a palos!!!!!");
            }
        }
    }
}
