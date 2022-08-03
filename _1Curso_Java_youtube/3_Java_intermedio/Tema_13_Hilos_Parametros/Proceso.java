public class Proceso extends Thread{

    int num_1;


    public Proceso(String NombreHilo){
        super(NombreHilo);
    }

    @Override
    public void run(){

        for(int i = 0; i <= num_1; i++){
            System.out.println(i +" "+ this.getName());
        }
    }
    public void Valor(int valor){
        this.num_1 = valor;
    }
}