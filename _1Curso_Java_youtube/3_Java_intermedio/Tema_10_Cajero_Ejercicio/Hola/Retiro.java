package Hola;
public class Retiro extends Cajero{
    @Override
    public void Operations__(){

        Dinero_en_Cuenta -= Dinero_ingresado;
       
    
    }
    
}








// /////////////////////////////////////
// package Hola;

// public class Retiro extends Cajero{
//     @Override
//     public void Transacciones(){

//         System.out.println("Cuanto deseas retirar ");
//         Retiro();

//         if (Retiro <= get_saldo()){
//             Transacciones = get_saldo();
//             set_saldo(Transacciones - Retiro);

//             System.out.println("Retiraste -> "+ Retiro );
//             System.out.println("Tu saldo actuale es: " + get_saldo());
//         } else{
//             System.out.println("Saldo insuficiente ");
//         }
        
    
//     }
    
// }
