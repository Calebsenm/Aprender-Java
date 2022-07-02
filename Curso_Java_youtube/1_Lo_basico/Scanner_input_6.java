import java.util.Scanner;

public class Scanner_input_6 {
    public static void main(String[] args) {

        Scanner A  = new Scanner(System.in);
    
        String Hola = "";
        int Uno = 0;
        int Two = 0;
        int Thre = 0;
        
        System.out.println("input tour name ");
        Hola = A.nextLine();

        System.out.println("input a number ");
        Uno = A.nextInt();

        System.out.println("input tour name ");
        Two = A.nextInt();

        Thre = Uno + Two;
        System.out.println("hola " + Hola + "El resultado de tu suma es " + Thre);

    }
}
