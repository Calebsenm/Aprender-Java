import java.util.Scanner;

public class No_Constructor {
    
    private Scanner Entrada = new Scanner(System.in);
    String nombre = "";


    public void PedirNombre(){
        System.out.println("Cual es tu nombre -> ");
        nombre = Entrada.nextLine();

    }

    public void Imprimir(){
        System.out.println("Tu nombre es: " + nombre);
    }

}
