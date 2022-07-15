
import java.util.Scanner;


public class Division {
    
    public static void main(String[] args) {
    
        try {
            int Valor_1, Valor_2,Valor_3;
            Scanner in = new Scanner(System.in);
            
            System.out.print("Ingresa un valor -> ");
            Valor_1 = in.nextInt();
        
            System.out.print("Ingresa el segundo Valor -> ");
            Valor_2 = in.nextInt();
            
            Valor_3 = Valor_1 / Valor_2;
            System.out.println("La division es " + Valor_3);
        }

        catch(Exception e){
            System.out.println("Error...." + e);
        }

        finally{
            System.out.println("Operacion Terminada");
        }
        
    } 
}
