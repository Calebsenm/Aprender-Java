package Tema_6_POO_Herencia.Operaciones_;
import java.util.Scanner;



public class Clase_padre {
    
    protected int Valor_1,Valor_2,Valor_3;
    Scanner input = new Scanner(System.in);


    // metodo que pide 
    public void PedirDatos(){
        System.out.print("Dame el primer valor -> ");
        Valor_1 = input.nextInt();

        System.out.print("Dame el segundo valor -> ");
        Valor_2 = input.nextInt();


    }
    // metodo que inprime el resultado
    public void MostrarResultado(){
        System.out.println(Valor_3);
    }
}
