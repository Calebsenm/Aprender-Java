import java.util.Scanner;


public class Metodo_equals_15 {
    public static void main(String[] args) {
        // PARA INORAR LAS MAYUSCULAS DEBES INGRESAR equalsIgnoreCase

        //COMPARAR DOS CADENAS
        Scanner INPU = new Scanner(System.in);

        String nombre1 = "";
        String nombre2 = "";

        System.out.println("Ingresa un Valor -> ");
        nombre1 = INPU.nextLine();
        System.out.println("Imprime un Valor -> ");
        nombre2 = INPU.nextLine();

        System.out.println(nombre1.equals(nombre2));


        // SEGUNDO SIMULAR UN REGISTRO 
        String pasword = "12345";
        String news = "0";

        System.out.println("Ingrese una contraseña");
        news = INPU.nextLine();


        System.out.println(pasword.equals(news));
        
      
        
    }
}
