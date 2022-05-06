// finickitado inicios de java   3/05/2022
// reto has que un un programa pyda un valor e inprimelo

import java.util.Scanner;

public class hello{
	public static void main(String Ars[]){
		Scanner nombre = new Scanner(System.in);
		System.out.print("Cual es tu nombre >> ");

		String Nombre = nombre.nextLine();
		System.out.println("TU nombre es: " + Nombre);
	}
}
