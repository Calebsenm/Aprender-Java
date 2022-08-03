
public class Main {

    public static void main(String[] args) {
     
        
        Thread_1 thread_1 = new Thread_1();
        Thread_2 thread_2 = new Thread_2();
        Thread_3 thread_3 = new Thread_3();
        Thread_4 thread_4 = new Thread_4();


        thread_1.start();

        //thread one
        try {
            thread_1.sleep(10);

        } catch (InterruptedException e) {
            System.out.println("Error XD" + e);
        }
        thread_2.start();
        //thread two
        try {
            thread_2.sleep(10);

        } catch (InterruptedException e) {
            System.out.println("Error XD" + e);
        }
        thread_3.start();
        //thread three
        try {
            thread_3.sleep(10);

        } catch (InterruptedException e) {
            System.out.println("Error XD" + e);
        }
        thread_4.start();

        //thread four
        try {
            thread_4.sleep(10);

        } catch (InterruptedException e) {
            System.out.println("Error XD" + e);
        }
    }
}