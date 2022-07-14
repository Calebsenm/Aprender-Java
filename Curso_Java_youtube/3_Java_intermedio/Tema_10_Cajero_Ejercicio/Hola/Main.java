package Hola;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        
     


        Scanner in = new Scanner(System.in);

        String Datos[] = new String[4];
        Datos[0] = "1> Consultar saldo";
        Datos[1] = "2> Registro de efectivo";
        Datos[2] = "3> Deposito de efectivo";
        Datos[3] = "4> Salir";

        
        while (true){
            for(int i = 0; i < Datos.length; i++){
                System.out.println(Datos[i]);
            }
            System.out.print("Ingresa una Opcion > ");
            int desicion = in.nextInt();


            // consultar dinero
            if( desicion == 1){
              
                Cajero moneda = new Consult_pay();
               
                System.out.println("EL dinero de la cuenta es__  " + moneda.get__Sueldo());
               
            }
            //Retirar dinero 
            else if(desicion == 2){
                
                Cajero money = new Retiro();
               

                
                System.out.print("Cuanto deseas retirar ->");
                int Retiro__ = in.nextInt();
                money.set__Sueldo(Retiro__);
                money.Operations__();

                System.out.println("EL dinero de la cuenta es__  " + money.get__Sueldo());

            }
            // Ingresar dinero 
            else if (desicion == 3){

               
                Cajero money_1 = new Input_money();

              
                System.out.print("Ingrese el dinero que vas a ingresae -> ");
                int Retiro__ = in.nextInt();

                money_1.set__Sueldo(Retiro__);
                money_1.Operations__();

                System.out.println("EL dinero de la cuenta es__  " + money_1.get__Sueldo());
            }
            // salir 
            else if (desicion == 4){
                
                break;

            }
            else{
                System.out.println("No sea pendejo no exista tal opcion");
            }

        }
        
    }
}















//package Hola;

// public class Main{
//     public static void main(String[] args) {
        
//         Cajero mensajero = new Consult_pay();
//         mensajero.set_saldo(100);

//         mensajero.Operations__();
//     }
// }