package Actividad_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner O = new Scanner(System.in);

        System.out.print("Ingresa La placa -> ");
        String Placa = O.nextLine();

        System.out.print("Ingresa los dias desde el ultimo mantenimiento -> ");
        int Dias = O.nextInt();

        System.out.print("Tiene Seguro -> ");
        boolean Seguro = O.nextBoolean();

        Auto auto = new Auto(Placa, Dias, Seguro);
        System.out.println(auto.NesecitaMantenimiento());
        System.out.println(auto.SePuedeRentar());

    }
}