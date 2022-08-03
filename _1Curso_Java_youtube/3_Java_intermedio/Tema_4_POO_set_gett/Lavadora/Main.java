package Tema_4_POO_set_gett.Lavadora;

import java.util.Scanner;

import Tema_4_POO_set_gett.Libreria.Lavadora;

public class Main {
    public static void main(String[] args) {
        
        Scanner lava = new Scanner(System.in);

        System.out.print("Tipo de ropa -> ");
        int Tipo_Ropa = lava.nextInt();

        System.out.print("Ingresa el kilo de ropa ->");
        int Kilos =lava.nextInt();
        
        //Objeto
        Lavadora Ropas = new Lavadora(Kilos, Tipo_Ropa);

        // modificar el tipo de ropa con el valor setter
        Ropas.setTipoDeRopa(2);
        Ropas.setKilo(2);
        //obtener el tipo de ropa 
        System.out.println("El tipo de ropa es: " + Ropas.getTipoRopa());
        System.out.println("El kilo de la ropa es: " + Ropas.getKilo());
        Ropas.Ciclo_Completo();


    }
}
