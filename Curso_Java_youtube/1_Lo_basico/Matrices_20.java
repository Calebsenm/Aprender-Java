
// crear una matriz y llenarla 
import java.util.Scanner;
public class Matrices_20 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int A = 0, B = 0; 
        int Dato = 0;

        System.out.print("Ingrese la cantidad de filas -> ");
        A = in.nextInt();
        System.out.print("Ingrese la cantidad de colunas -> ");
        B = in.nextInt();

        int Arreglo[][] = new int[A][B];
        
        for (int i = 0; i < Arreglo.length;i++){
            for (int j = 0; j < Arreglo[0].length; j++){
                System.out.print("["+ i + "]" +"["+ j +"]"+"-> ");
                Dato = in.nextInt();
                Arreglo[i][j]= Dato; 

            }
        }

        for (int a = 0;a < Arreglo.length;a++){
            for (int b = 0; b <Arreglo[a].length;b++){
                System.out.print("[" + Arreglo[a][b] + "]");
            }
            System.out.println();
        }

    }
}
