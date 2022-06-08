import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args){

        Scanner N = new Scanner(System.in);

        System.out.print("Introduce los segundos > ");
        int segundos = N.nextInt();

        double Minuto = segundos * 0.01666667;
        double Hora = segundos * 0.00027778;
        
        System.out.println(segundos +"Segundos Equivalen a " + segundos+"Segundos");
        System.out.println(segundos +"Segundos Equivalen a " + Minuto +"Minutos");
        System.out.println(segundos +"Segundos Equivalen a " + Hora +"Horas");
    
    
    }
}