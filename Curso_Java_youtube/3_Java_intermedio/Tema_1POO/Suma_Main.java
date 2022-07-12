package Tema_1POO;
import java.util.Scanner;


public class Suma_Main{
    public static void main(String[] args) {
        
        Scanner INPUS = new Scanner(System.in);

        System.out.print("Ingresa un numero -> ");
        int Valor_Uno = INPUS.nextInt();

        System.out.print("Ingresa un numero -> ");
        int Valor_Dos = INPUS.nextInt();

        // pasa por parametro los valores de otra clase
        Suma Valores = new Suma(Valor_Uno,Valor_Dos);
        Valores.Imprimir();
    }
}