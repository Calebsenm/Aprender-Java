// frograma la sucecion de fibonaci
// 0,1,1,2,3,5,8,13,21,34

public class Fibonaci_14 {
    public static void main(String[] args) {
        System.out.println("Con ciclo for");

        int p = 10;      // numero de iteraciones
        int i = 0;        // pimer valor
        int j = 1;        // segundo valor
        int h = 0;        // guarda el valor anterior a la suma
       
        
        for(int l = 1; l <= p; l++){
            
            System.out.print(i + ", ");  // imprime el numero en 1
            
            h = i ;         // guarda el numero anterior 
            i = i + j;      // reasigna el primer valor de suma del primero con el egundo
            j = h;          // reasigna el segundo  valor  guardado
        }


        System.out.println();
        System.out.println("Con ciclo while");
        p = 10;       
        i = 0;
        j = 1;
        h = 0;

        int pt = 0;
        while(pt <= p){
            System.out.print(i + ", "); 
            h = i;
            i = i + j;
            j = h; 
            pt++;
            
        }


        System.out.println();
        System.out.println("Con ciclo do while");
        p = 10;       
        i = 0;
        j = 1;
        h = 0;

        pt = 0;
        do{
            System.out.print(i + ", "); 
            h = i;
            i = i + j;
            j = h; 
            pt++;
           
        } while(pt <= p);
    }
}
