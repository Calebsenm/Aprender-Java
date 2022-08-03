import java.util.Scanner;

public class Constructor {
    

    public Constructor(){

        Scanner Entrada = new Scanner(System.in);
        String nombre = "";

        System.out.println("Cual es tu nombre -> ");
        nombre = Entrada.nextLine();

        System.out.println("Tu nombre es: " + nombre);
    }
}
