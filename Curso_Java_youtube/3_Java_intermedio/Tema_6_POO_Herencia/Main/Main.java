package Tema_6_POO_Herencia.Main;
import Tema_6_POO_Herencia.Operaciones_.Clase_Resta;
import Tema_6_POO_Herencia.Operaciones_.Clase_Suma;


public class Main {
    public static void main(String[] args) {
        
        Clase_Suma mensajero = new Clase_Suma();
        mensajero.PedirDatos();
        mensajero.Sumar();

        System.out.print("El resultado de la suma es...");
        mensajero.MostrarResultado();

        // la resta
        Clase_Resta mensaje = new Clase_Resta();
        mensaje.PedirDatos();
        mensaje.Restar();
        System.out.print("El resultado de la resta es...");
        mensaje.MostrarResultado();

    }
}
