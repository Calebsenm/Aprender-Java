package T2_Factorial;

public class Factorial {
    
    private int Resultado;

    public int  Factorial(int A){

        if ( A > 0){
            int valor = A * Factorial( A -1);
            return valor;
        }   
        return 1;
        
    
    }
}
