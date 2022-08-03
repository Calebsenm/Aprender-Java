package Tema_3_POO_encapsulamiento.Lavadora;

import java.util.Scanner;

import Tema_3_POO_encapsulamiento.Libreria.Lavadora;

public class Main {
    public static void main(String[] args) {
        
        Scanner lava = new Scanner(System.in);

        System.out.print("Tipo de ropa -> ");
        int Tipo_Ropa = lava.nextInt();

        System.out.print("Ingresa el kilo de ropa ->");
        int Kilos =lava.nextInt();
        
        //Objeto
        Lavadora Camisas_1 = new Lavadora(Kilos, Tipo_Ropa);
        Camisas_1.Ciclo_Completo();


    }
}
