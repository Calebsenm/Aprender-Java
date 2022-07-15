// otra manera de implemerntar un hilo
public class Hilo_2 implements Runnable {
    
    @Override
    public void run(){

        for(int i = 0; i <=5;i++){
            System.out.println("Proceso 2");
        }
    }
}
