
// Solo Permite dos tipos de datos un numero o una letra

public class Switch_Case_8 {
    public static void main(String[] args) {
        
        int numero1 = 7,numero2 = 10, numero3 = 0;
        int Parametro = 1;


        switch (Parametro){
            case 1: numero3 = numero1 + numero2;
                System.out.println("El resultado de la suma es: " + numero3);
                break;
            
            case 2: numero3 = numero1 - numero2;
            System.out.println("El resultado de la resta  es: " + numero3);
                break;

            case 3: numero3 = numero1 * numero2;
            System.out.println("El resultado de la Multiplicacin   es: " + numero3);
                break;
            
            case 4: numero3 = numero1 / numero2;
            System.out.println("El resultado de la division   es: " + numero3);
                break;
            
            default: System.out.println("La opcion no existe");
                break;
        }

    }
}
