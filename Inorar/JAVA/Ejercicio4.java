import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args){

    Scanner cent = new Scanner(System.in);

    System.out.print("Introduce una medida en CM -> ");
    int  Numero = cent.nextInt();

    // 1 pulgada es 2,54 cm 

    double PUL =  Numero / 2.54;
    System.out.println(Numero+ " CM Equivalen a "+ PUL + " Pulgadas");
    }
}