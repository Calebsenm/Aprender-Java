public class Thread_3 extends Thread {
    
    @Override
    public void run(){
        for(int i = 0; i <= 5; i++){
            System.out.print("E");


            try {
                Thread_1.sleep(100);
                
            } catch (InterruptedException e) {
                System.out.println("Error_XD");
            }
        }
    }
}
