package Tema_7_POO_polimorfismo;

import java.util.Scanner;

public abstract class Operaciones {
    
    // recomendacion utilizar protected 
    protected int num_1,num_2,res_1;

    Scanner input = new Scanner(System.in);
    public void PedirDatos(){
        System.out.print("Dame el primer valor -> ");
        num_1 = input.nextInt();

        System.out.print("Dame el segundo valor -> ");
        num_2 = input.nextInt();
    }

    // este es el polimorfismo
    public abstract void Operaciones__();

    public void MostrarResultado(){
        System.out.println("El resultado es ->" + res_1);
    }

}
