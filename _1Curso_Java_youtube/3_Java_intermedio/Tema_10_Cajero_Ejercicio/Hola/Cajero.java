// package Hola;

// import java.util.Scanner;

// public abstract class Cajero {

//     protected int Transacciones;
//     protected int Retiro;
//     protected int deposito;
//     private static int saldo;
//     int desicion;
  

//     Scanner entrada = new Scanner(System.in);

//     public void Operations__(){
//         int Bandera = 0;
//         int seleccion = 0;

//         String Datos[] = new String[4];
//         Datos[0] = "1> Consultar saldo";
//         Datos[1] = "2> Registro de efectivo";
//         Datos[2] = "3> Deposito de efectivo";
//         Datos[3] = "4> Salir";

//         do {
//             do{    
//                 for(int i = 0; i < Datos.length; i++){
//                     System.out.println(Datos[i]);
//                 }
//                 System.out.print("Ingresa una Opcion > ");
//                 desicion = entrada.nextInt();

//                 if (desicion >= 1 && desicion <= 4){
//                     Bandera = 1;
//                 } else{
//                     System.out.println("No sea pendejo");
//                 }

//             } while(Bandera == 0);

//             if (desicion == 1){
//                 Cajero mensajero = new Consult_pay();
//                 mensajero.Transacciones();

//             }   else if(desicion == 2) {
//                 Cajero mensajero = new Retiro();
//                 mensajero.Transacciones();

//                 }   else if (desicion == 3){
//                     Cajero mensajero = new Input_money();
//                     mensajero.Transacciones();

//                     }  else if (desicion == 4){
//                         System.out.print("Gracias Buelve pronto");
//                         Bandera = 2;
//                     }

//         } while (Bandera != 2);
        
//     }

//     // moetodo solicitar cantidad de retiro
//     public void Retiro(){
//         Retiro = entrada.nextInt();
//     }

//     // para el deposito
//     public void Deposito(){
        
//         deposito = entrada.nextInt();
//     }
  
//     //Metodo abstracto
//     public abstract void Transacciones();

//     // setters y getter
//     public int get_saldo(){
//         return saldo;
//     }

//     public void set_saldo(int saldo){
//         this.saldo = saldo;
//     }

// }


package Hola;
public abstract  class Cajero{

    public static int Dinero_ingresado;
    public static int Dinero_en_Cuenta = 100;

   
    public  abstract void Operations__();

    public void set__Sueldo(int Retirar__1){
        this.Dinero_ingresado = Retirar__1;

    }
    public int get__Sueldo(){
        return Dinero_en_Cuenta;
    }  

}
