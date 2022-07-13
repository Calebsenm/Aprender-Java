package Tema_7_POO_polimorfismo;

public class Main {
    public static void main(String[] args) {
        
        // se crea el objeto con la clase 
        //que se le aplica el polimorfismo

        
        Operaciones objeto = new Resta();
        objeto.PedirDatos();
        objeto.Operaciones__();
        objeto.MostrarResultado();

        // con la resta
        Operaciones Objeto_1 = new Suma();
        Objeto_1.PedirDatos();
        Objeto_1.Operaciones__();
        Objeto_1.MostrarResultado();

    
    }
}
