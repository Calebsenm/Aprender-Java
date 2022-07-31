// crea una calculadora con 
// suma,resta,multiplicion,division,residuo y salir
import java.util.Scanner;

public class Calculadora{

	public static void main(String args[]){

		Scanner input = new Scanner(System.in);
		System.out.println("Bienvenido");
		
		int numero = 0;
 		int llave  = 0;

		while(llave == 0){
			System.out.println("1 Suma ");
      		System.out.println("2 Resta ");
			System.out.println("3 Multipliccion ");
			System.out.println("4 Division ");
			System.out.println("5 residuo");
			System.out.println("6 Salir");

			System.out.print("Que deseas elegir");
			numero = input.nextInt();
			
			System.out.print("Ingresa el primer numero -> ");
			int A = input.nextInt();
			System.out.print("Ingresa el segundo valor -> ");
			int B = input.nextInt();

			switch (numero){
				case 1:
					System.out.println("El la suma de dos numero es " + (A + B));
					break;
				case 2:
					System.out.println("La resta es "+ (A - B));
					break;
				case 3:
					System.out.println("La Multipliccion es "+ (A * B));
					break;
				case 4:
					System.out.println("La division es " + (A / B));
					break;
				case 5:
					System.out.println("El modolo es "+ (A % B));
					break;
				case 6:
					llave = 1;
					break;
				default:
					break;
			}

		}


		
	}
}
