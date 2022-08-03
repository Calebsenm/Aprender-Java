// Escribe la siguiente serie de numeros con los tres ciclos
// 1,2,3,4,5,6,7,8,9,10

public class Ejercicios_ciclos_12{
    public static void main(String[] args) {
        
        for (int i = 1; i <= 10; i++){
            if (i < 10){
                System.out.print(i+",");
            } else{
                System.out.print(i);
            }
        }

        System.out.println("");
        int h1 = 1;
        while(h1 <= 10){
            if (h1 < 10){
                System.out.print(h1+",");
            } else{
                System.out.print(h1);
            }
            h1++;
        }

        System.out.println("");
        int u = 1;
        do{
            if (u < 10){
                System.out.print(u + ",");
            } else{
                System.out.print(u);
            }
            u++;
        }while (10 >= u); 

    }
}

