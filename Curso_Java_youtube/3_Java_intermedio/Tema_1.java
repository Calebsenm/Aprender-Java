//cre un programa que pida un una frase y luego la imprima arreves asi
//hola como estas // satse omoc aloh

import java.util.Scanner;


public class Tema_1{
	public static void main(String args[]){
	

		String Palabra = "";
		Scanner hola = new Scanner(System.in);
		Palabra = hola.nexLine();

		int contador = hola.length();

		String Base[] = new Base [contador -1];

		for(int i = contador -1 ; i == 0;i--){
			
			Base[i] = Palabra.subString(i); 
		}

		for (int o = 0; o < contador -1;o++){
			System.out.print("-" + Base[o] + "");
		}




	}
}
