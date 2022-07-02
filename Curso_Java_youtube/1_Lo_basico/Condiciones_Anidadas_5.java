public class Condiciones_Anidadas_5 {
    public static void main(String args[]){
        
        int O = 10;

        int A = 4;
        int B = 5;

        int R = 0;

        if (O == 1){
            R = A + B;
            System.out.println("El resultado de la suma es " + R);
        } else if (O == 2){
            R = A - B;
            System.out.println("El resultado de la resta es " + R);
        } else if (O == 3){
            R = A * B;
            System.out.println("El resultado de la Multiplicacion es " + R);
        } else if (O == 4){
            R = A / B;
            System.out.println("El resultado de la division es " + R);
        } else{
            System.out.println("El resultado no existe");
        }

    }
}
