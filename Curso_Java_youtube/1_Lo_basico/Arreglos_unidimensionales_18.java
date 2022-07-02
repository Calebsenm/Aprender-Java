import java.util.*;

public class Arreglos_unidimensionales_18 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int A = 0;
        System.out.print("Ingresa el numero del arreglo -> ");
        A = in.nextInt();
    
        int  numeros_1[] = new int[A];

        for (int i = 0; i < numeros_1.length; i++){
            System.out.print("Ingresa el  numero de la posiciocion " + i + " -> ");
            A = in.nextInt();
            numeros_1[i] = A;
        }

        for (int AB = 0;AB < numeros_1.length ;AB++){
            System.out.print("["+numeros_1[AB]+"]");
        }
    }
}
