// esta es una manera de escribir un hilo

public class Hilo_1 extends Thread{
 
    @Override
    public void run(){
        for(int i = 0; i <=5;i++){
            System.out.println("Proseso 1");
        }
    }
}
