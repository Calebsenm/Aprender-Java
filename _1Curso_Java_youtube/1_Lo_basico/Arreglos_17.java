import java.util.Scanner;
public class Arreglos_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero = 0;

        int Vector[] = new int[5];
        for (int i = 0; i <= 4; i++){
            System.out.print("Ingresa el numero -> ");
            numero = input.nextInt();

            Vector[i] = numero;
            System.out.println(Vector[i]);
        }
        
        for (numero = 0;numero <5 ;numero++){
            System.out.print("["+Vector[numero]+"]");
        }
        
    }
}
