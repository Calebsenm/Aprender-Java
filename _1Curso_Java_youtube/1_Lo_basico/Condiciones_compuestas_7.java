import java.util.Scanner;

public class Condiciones_compuestas_7 {
    public static void main(String[] args) {
     
        Scanner AB = new Scanner(System.in);
        
        String nombre = "";
        int clave = 0;
        int Antiguedad = 0;

        System.out.println("Vienvenido al sistema Vocacional ");

        System.out.print("Por favor ingresa un Nomber ");
        nombre = AB.nextLine();

        System.out.print("Por favor ingresa la clave ");
        clave = AB.nextInt();

        System.out.print("Cunatos años de servicion tiene ");
        Antiguedad = AB.nextInt();


        if (clave == 1){
            if (Antiguedad == 1){
                System.out.println(nombre+ " Tine derecho a 6 dias ");
            }   else if (Antiguedad >= 2 && Antiguedad <= 6) {
                System.out.println(nombre+ " Tine derecho a 14 dias ");

            } else if (Antiguedad == 7){
                System.out.println(nombre+ " Tine derecho a 20 dias ");
            } else{
                System.out.println(nombre + " Auno no tiene derecho");
            }

        } else if (clave == 2){
            if (Antiguedad == 1){
                System.out.println(nombre+ " Tine derecho a 7 dias ");
            }   else if (Antiguedad >= 2 && Antiguedad <= 6) {
                System.out.println(nombre+ " Tine derecho a 15 dias ");

            } else if (Antiguedad == 7){
                System.out.println(nombre+ " Tine derecho a 22 dias ");
            } else{
                System.out.println(nombre + " Auno no tiene derecho");
            }

            } else if (clave == 3) {
                if (Antiguedad == 1){
                    System.out.println(nombre+ " Tine derecho a 10 dias ");
                }   else if (Antiguedad >= 2 && Antiguedad <= 6) {
                    System.out.println(nombre+ " Tine derecho a 20 dias ");
    
                } else if (Antiguedad == 7){
                    System.out.println(nombre+ "T ine derecho a 30 dias ");
                } else{
                    System.out.println(nombre + " Auno no tiene derecho");
                }

                } else {
                    System.out.println("Error no existe");
                }

    }
}
