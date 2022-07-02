import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){

        System.out.println(" Hello word !!!");
        Scanner Hola = new Scanner(System.in);

        System.out.print("Porfavor ingresa una milla marina > ");
        int Milla = Hola.nextInt();

        int MillaMetros = Milla * 1852;

        System.out.println(Milla +" Milla equivale " + MillaMetros + " Metros ");




    }
}
