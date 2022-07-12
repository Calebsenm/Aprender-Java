package Tema_5_POO_modificadores.Paquete2;

import Tema_5_POO_modificadores.Paquete1.Atributos_MT;

public class Clase_Dos {
    public static void main(String[] args) {
        
        Atributos_MT mensaje = new Atributos_MT();
        // por defecto
        // men.Valor_Uno;

        // public
        // men.Varible_1;
        // men.Metodo_cal();

        // //private
        // men.Numero_1;
        // men.Metodo_Sen();

        mensaje.set_ValorUno(10);
        System.out.println(mensaje.get_ValorUno());
        
    }
}
