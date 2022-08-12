import java.util.Scanner;
 
  public class Calcu{

    public static int Inpu_numeros(int E){


      Scanner input = new Scanner(System.in);    
      
      if(E <= 4 && E >= 0){

        System.out.print("Ingresa el primer numero -> ");
        int numer1 = input.nextInt();

        System.out.print("Ingresa el siguiente numero -> ");
        int numero2 = input.nextInt();
    
        if(E == 1){
          System.out.println("La suma es..");
          System.out.println(numer1 + numero2);
        } else if(E == 2){
          System.out.println("La resta es..");
           System.out.println(numer1 - numero2);
          } else if(E == 3){
            System.out.println("la multiplicacion es..");
              System.out.println(numer1 * numero2);
            } else if(E == 4){
              System.out.println("La division es..");
              System.out.println(numer1 / numero2);
            }
      } else if(E == 5){
        System.out.print("Ingresa un numero");
        int n = input.nextInt();
        System.out.println(n);
        

      } else if(E == 6){
        System.out.println("Ingresa un nuemeo para saber si es primo ");
        int m = input.nextInt();
        boolean Esprimo = true;

        for(int i = 2; i < m;i++){
          if((m % i) == 0){
            Esprimo = false;
          }
        }
        if(Esprimo){
          System.out.println("El numero " + m + " es primo");
        } else{
          System.out.println("El numero " + m +" no es primo");
        }
      }
        
      return 0;
  
    }
    public static int Suma(int A, int B){
      return A + B;
    }

    public static int Resta(int A, int B){
      return A - B;
    }

  public static void main(String[] args){
      
    Scanner input = new Scanner(System.in);
    
    System.out.println("Que deseas ingresar");
    System.out.println("1. Sumar");
    System.out.println("2. Restar");
    System.out.println("3. Multiplicar");
    System.out.println("4. Dividir");
    System.out.println("5. Formula");
    System.out.println("6. Nuemeros Primos");

    System.out.print("Ingresa una eleccion -> ");
    int E = input.nextInt();
    
    Calcu.Inpu_numeros(E);
  

  }

}
