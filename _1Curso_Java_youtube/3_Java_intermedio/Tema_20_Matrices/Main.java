import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random R1 = new Random();
        Random R2 = new Random();

        int Matris_1 [][] = new int [3][3];
        int Matris_2 [][] = new int [3][3];
        int Matris_3 [][] = new int [3][3];
        int Number_1,Number_2;

        for (int i  = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                Number_1 = R1.nextInt(10);
                Number_2 = R2.nextInt(10);

                Matris_1[i][j] = Number_1; 
                Matris_2[i][j] = Number_2;
            }
        }

        for (int i  = 0; i < 3; i++){
            for (int j  = 0; j < 3; j++){
                Matris_3[i][j] = Matris_1[i][j] +  Matris_2[i][j];
            }
           
        }

        for (int i = 0; i < 3; i++){

            for (int j = 0; j < 3; j++){

               System.out.print("[" + Matris_1[i][j] + "]");
            }
                if (i == 1){
                    // para hacer tabulaciones  /t
                    System.out.print(" + ");
                }   else{
                        System.out.print("   ");
                    }
          
            for (int a = 0; a < 3; a++){
                System.out.print("[" + Matris_2[i][a] + "]");
            }
                if (i == 1){
                    // para hacer tabulaciones  /t
                    System.out.print(" = ");
                }   else{
                        System.out.print("   ");
                    }
            

            for (int b = 0; b < 3; b++){
                System.out.print("[" + Matris_3[i][b] + "]");
            }

            System.out.println();
         
        }

    

    }
}