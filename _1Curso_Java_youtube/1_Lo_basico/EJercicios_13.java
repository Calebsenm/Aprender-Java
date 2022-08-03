// Escribe la siguiente 


public class EJercicios_13 {
    public static void main(String[] args) {
        System.out.println("Ciclo for");
        int i = 0;
        int j = 99;

        for(i = 1; i <= 10;i++){
            if (i < 10){

                System.out.print(i + ",");
                System.out.print(j + ",");
            }   else{
                System.out.print(i+",");
                System.out.println(j);
            }
            
            j--;
        }

        System.out.println("Ciclo while");
        i = 1;
        j = 99;

        while (i <= 10){
            if (i < 10){

                System.out.print(i + ",");
                System.out.print(j + ",");
            }   else{
                    System.out.print(i+",");
                    System.out.println(j);
                    
                }
            i++;
            j--;
        }

        System.out.println("Ciclo  do while");
        i = 1;
        j = 99;

        do {
            if (i < 10){

                System.out.print(i + ",");
                System.out.print(j + ",");
            }   else{
                System.out.print(i+",");
                System.out.println(j);
            }
            i++;
            j--;
        }   while(i <= 10 );
    }
}
