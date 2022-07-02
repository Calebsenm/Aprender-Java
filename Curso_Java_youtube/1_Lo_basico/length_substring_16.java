import java.util.*;

public class length_substring_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String Cadena = "";
        System.out.print("Ingrea una cadena -> ");
        Cadena = input.nextLine();

        int Cantidad = Cadena.length();
        int inicio = 0;
        int fin  = 0;

        System.out.print("la cadena tiene "+Cantidad+" caracteres"+"Desde que numero va a ingresar la cadena -> ");
        inicio = input.nextInt();

        System.out.print("la cadena tiene "+Cantidad+" caracteres"+"Hasta que numero va a ingresar la cadena -> ");
        fin = input.nextInt();
        
        System.out.println(Cadena.substring(inicio + -1, fin));
    }
}
