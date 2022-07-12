package Tema_5_POO_modificadores.Paquete1;

public class Atributos_MT {
    
    // cundo no se coloca nada es el modificador de acceso por defecto
    // solo estarán disponibles  en el atraves de la misma clase dentro del
    // paquete 
    int Valor_Uno;
    int Valor_Dos;
    String Valor_Tres;

    // public permite habilitar hacia otros paquetes
    public int  Varible_1;
    public String Varible_2;
    public void Metodo_cal(){

    }

    // private se pueden acceder solo desde la clase actual 
    // para acceder a ello solo se puede atraves delos metodos getter y setter
    private int Numero_1;
    private void Metodo_Sen(){

    }


    public int get_ValorUno(){
        return Numero_1;
    }
    public void set_ValorUno(int number_one){
        this.Numero_1 = number_one;
    }
}
