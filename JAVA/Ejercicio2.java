import java.util.Scanner;
public class Ejercicio2{
    public static void main(String[] args){Scanner Datos = new Scanner(System.in);
	System.out.print("Ingresa un numero > ");
	int Numero1 = Datos.nextInt();
	System.out.print("Ingresa un numero > ");
	int Numero2 = Datos.nextInt();int Suma = Numero1 + Numero2;
	int Resta = Numero1 - Numero2;int Multiplicacion = Numero1 *  Numero2;
	double Division = Numero1 / Numero2;double Residuo = Numero1 % Numero2;
	System.out.println("La Suma es -> " + Suma);System.out.println("La Resta es -> " + Resta);
	System.out.println("La Multiplicacion es -> " + Multiplicacion);
	System.out.println("La Division es -> " + Division);System.out.println("El Resto es -> "+ Residuo);
}

}
