//2. Práctica las diferentes formas de pedir datos al usuario 
//en la consola realizando un programa que lea un número entero 
//e imprima:

// "Feliz día", si el número es mayor a cero.
// "Vamos muy bien" si es igual a cero.
// "Para atrás ni para coger impulso", si el número es menor a cero.


import java.util.Scanner;

public class Programa_2 {
    public static void main(String[] args) {
        Scanner inpu = new Scanner(System.in);

        System.out.print("ingresa un numero ");
        int numero_1 = inpu.nextInt();

        if (numero_1 == 0){
            System.out.println("Vamos muy bien");
        }   
        else if (numero_1 < 0) {
            System.out.print("Para atras ni para cojer inpulso");
        } 
        else{
            System.out.print("Feliz Dia");
        }

    }
}


