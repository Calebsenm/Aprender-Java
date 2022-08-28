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
          System.out.println(Suma(numer1,numero2));
        } else if(E == 2){
          System.out.println("La resta es..");
           System.out.println(Resta(numer1, numero2));
          } else if(E == 3){
            System.out.println("la multiplicacion es..");
              System.out.println(Multiplicar(numer1, numero2));
            } else if(E == 4){
              System.out.println("La division es..");
              System.out.println(Dividir(numer1, numero2));
            }
      } else if(E == 5){
        Formula();

      } else if(E == 6){
        System.out.println("Ingresa un numero para saber si es primo ");
        int m = input.nextInt();
        Numero_primo(m);
        
      
      }
        
      return 0;
  
    }


    public static int Suma(int A, int B){
      return A + B;
    }

    public static int Resta(int A, int B){
      return A - B;
    }

    public static int Multiplicar(int A, int B){
      return A * B;
    } 

    public static int Dividir(int A, int B){
      return A / B;
    }

    public static double Formula(){
      Scanner input = new Scanner(System.in);

      System.out.print("Ingresa un numero");
        double n = input.nextDouble();
        
        System.out.print("Ingrese un numero -> ");
        double nm = input.nextDouble();
        
        System.out.print("Ingrese un numero -> ");
        double nmn = input.nextDouble();

        double temp = nm * nm - 4 * n * nmn;
        
        if(temp >= 0){
          if(2 * n != 0){
            double x1 = -nm - Math.sqrt(temp) / 2 * n;
            double x2 =  -nm + Math.sqrt(temp) / 2 * n;
            
            System.out.println("Las raices son ");
            System.out.println("x1 " + x1);
            System.out.println("x2 " + x2);

          } else{
            System.out.println("Error al dividir por cero");
          }

        } else{
          System.out.println("Error raiz negativa ");
        }

        return 0;
    }
    public static boolean Numero_primo(int m ){
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

      return Esprimo;
    }

  public static void main(String[] args){
      
    Scanner input = new Scanner(System.in);
    
    System.out.println("Que deseas ingresar");
    System.out.println("1. Sumar");
    System.out.println("2. Restar");
    System.out.println("3. Multiplicar");
    System.out.println("4. Dividir");
    System.out.println("5. Formula del Estudiante");
    System.out.println("6. Numeros Primos");

    System.out.print("Ingresa una eleccion -> ");
    int E = input.nextInt();
    
    Calcu.Inpu_numeros(E);
  

  }

}
