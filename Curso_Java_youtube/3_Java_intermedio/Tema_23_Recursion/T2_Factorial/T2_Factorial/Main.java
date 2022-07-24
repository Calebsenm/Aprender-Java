package T2_Factorial;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el numero -> ");

        int nuemro = entrada.nextInt();
        Factorial recursividad = new Factorial();

        int factorial = recursividad.Factorial(nuemro);
        System.out.print(factorial);
    }
}
