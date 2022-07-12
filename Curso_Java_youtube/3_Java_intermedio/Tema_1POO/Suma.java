package Tema_1POO;

public class Suma {

    private int V_uno,V_dos,Resultado;

    //contructor 
    public Suma (int Valor_Uno,int Valor_Dos){
        this.V_uno = Valor_Uno;
        this.V_dos = Valor_Dos;
    }

    //void hace referencia a que tiene que devolver un valor
    public void Operacion(){
        Resultado = V_uno + V_dos;

    }

    // metodo que imprime
    
    public void Imprimir() {
        //para utilizar activar la operacion de la operacion 
        // se activa invocandola 
        Operacion();
        System.out.println("El resultado de la suma es " + Resultado );
    }

}
    
