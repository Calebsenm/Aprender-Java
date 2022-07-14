
public class Tipos {
    static int Varible_Estatica;
    
    // no se tienen que inicialisar
    int Variable_Global;
    // varibles estaticas no nesecitan de una istancia para acceder a ellas
    public static int Variable_Estatica_ernesto = 555;

 
    void metodo(int Parametro){
        // se deben inicialisar
        int Variable_Local = 0;
        System.out.println(Parametro);

    }

    public void Text(){
        String VariableLocal = "";
        System.out.println("El valor de la variable local es " + VariableLocal );
    }
}
