package Tema_2POO_AreaRectangulo;

import java.util.Scanner;

import Tema_1POO.Suma;

public class Main {
    public static void main(String[] args) {
        Scanner INPUTS = new Scanner(System.in);

        System.out.println("Ingrese la altura-> ");
        int altura_1 = INPUTS.nextInt();

        System.out.println("ingresa la base");
        int base_1 = INPUTS.nextInt();

        //Los objetos
        Area Uno = new Area(altura_1,base_1);
        Uno.Resultado();

    
    }
}
