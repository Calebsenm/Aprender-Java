public class Matrices_19 {
    public static void main(String[] args) {
        
        int numeros [][] = new int[2][2];

        numeros[0][0] = 5;
        numeros[0][1] = 2;
        numeros[1][0] = 2;
        numeros[1][1] = 5;

        for(int i = 0; i < numeros.length;i++){
            for(int j = 0; j < numeros[0].length;j++){
                System.out.print("["+numeros[i][j] +"]");
            }
            System.out.println();
        }
    }
}
