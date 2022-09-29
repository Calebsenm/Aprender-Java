
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Scanner O = new Scanner(System.in);

            

            Auto auto = new Auto("DBZ 645",2 , true);

    
            Cliente Cliente1 = new Cliente("11111", 20, "Caleb");
            Cliente Cliente2 = new Cliente("134341", 24, "Carlos");
            Cliente Cliente3 = new Cliente("23231", 22, "Cal222eb");

            Alquiler alquileres[] = new Alquiler[5];

            alquileres[0] = new Alquiler(Cliente1, auto, LocalDate.parse("2021-06-12"), 48);
            alquileres[1] = new Alquiler(Cliente2, auto, LocalDate.parse("2021-07-12"), 30);
            alquileres[2] = new Alquiler(Cliente1, auto, LocalDate.parse("2021-07-14"), 25);
            alquileres[3] = new Alquiler(Cliente3, auto, LocalDate.parse("2021-07-14"), 12);
            alquileres[4] = new Alquiler(Cliente1, auto, LocalDate.parse("2021-07-16"), 8);

        
           Alquiler pan = new Alquiler(Cliente1, auto,LocalDate.parse("2021-07-19") , 124);


           System.out.println(pan.ObtenerDescuento(alquileres));
         

           System.out.println(pan.CalcularCosto(auto.SePuedeRentar()));
           System.out.println(pan.CalcularCosto(false));
    }
}