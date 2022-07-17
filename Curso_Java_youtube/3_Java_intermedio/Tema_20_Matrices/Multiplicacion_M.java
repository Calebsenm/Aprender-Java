public class Multiplicacion_M {
    public static void main(String[] args) {

        int numero_1[][] = new int[2][3];
        int numero_2[][] = new int[3][2];
        int Restultado[][] = new int[2][2];

        for (int i = 0; i < numero_1.length; i++) {
            for (int j = 0; j < numero_1[i].length; j++) {

                numero_1[i][j] = (int) (Math.random() * 10);
                System.out.print("[" + numero_1[i][j] + "]");
            }
            System.out.println();
        }
        System.out.println();

        for (int a = 0; a < numero_2.length; a++) {
            for (int c = 0; c < numero_2[a].length; c++) {

                numero_2[a][c] = (int) (Math.random() * 10);
                System.out.print("[" + numero_2[a][c] + "]");
            }
            System.out.println();
        }


        for (int p = 0; p < 4;p++){
            if (Restultado[0][0] == 0){
                int Tenporal = (numero_1[0][0] * numero_2[0][0])
                             + (numero_1[0][1] * numero_2[1][0])
                             + (numero_1[0][2] * numero_2[2][0]);

                Restultado[0][0] = Tenporal;
            }
            if (Restultado[1][0] == 0){
                int Tenporal = (numero_1[1][0] * numero_2[0][0])
                             + (numero_1[1][1] * numero_2[1][0])
                             + (numero_1[1][2] * numero_2[2][0]);

                Restultado[1][0] = Tenporal;
            }
            if (Restultado[0][1] == 0){
                int Tenporal = (numero_1[0][0] * numero_2[0][1])
                             + (numero_1[0][1] * numero_2[1][1])
                             + (numero_1[0][2] * numero_2[2][1]);

                Restultado[0][1] = Tenporal;
            }
            if (Restultado[1][1] == 0){
                int Tenporal = (numero_1[1][0] * numero_2[0][1])
                             + (numero_1[1][1] * numero_2[1][1])
                             + (numero_1[1][2] * numero_2[2][1]);

                Restultado[1][1] = Tenporal;
            }
        }


        System.out.println();
        for (int uso = 0; uso < Restultado.length; uso++) {
            for (int ol = 0; ol < Restultado[uso].length; ol++) {

                System.out.print("[" + Restultado[uso][ol] + "]");
            }
        System.out.println();

        }
    }
}





        
// int numero_Suma_1 = 0;

// int numero_Suma_2 = 0;
// // flecha que identifica las columnas
// int w = 0;
// // flecha de fila de la matris resultado
// int u = 0;
// // columna
// int uu = 0;

// for (int i = 0; i < numero_1.length; i++) {

//     for (int l = 0; l < numero_2.length; l++) {

//         numero_Suma_1 += numero_1[i][i] * numero_2[l][w];

//     }

//     w += 1;

//     for (int c = 0; c < numero_2.length; c++) {

//         numero_Suma_2 += numero_1[i][i] * numero_2[c][w];
//     }

//     w -= 1;

//     Restultado[u][uu] = numero_Suma_1;
//     uu += 1;
//     Restultado[u][uu] = numero_Suma_2;
//     u += 1;
//     uu -= 1;
//     numero_Suma_1 = 0;
//     numero_Suma_2 = 0;

// }
// System.out.println();

// // imprimir la matris resultante
// for (int uso = 0; uso < Restultado.length; uso++) {
//     for (int ol = 0; ol < Restultado[uso].length; ol++) {

//         System.out.print("[" + Restultado[uso][ol] + "]");
//     }
//     System.out.println();
// }


