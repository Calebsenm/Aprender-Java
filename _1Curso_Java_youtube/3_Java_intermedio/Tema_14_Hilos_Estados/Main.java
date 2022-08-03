



public class Main{

	public static void main(String[] args){

		// this is the new estate
		Hilo hilo_1 = new Hilo();
		Hilo hilo_2 = new Hilo();

		hilo_1.start();

		// this is for sleep the threads
		// 1000 = 1 second 
		//
		try {

			hilo_1.sleep(1000);
		
		}catch(InterruptedException e){
		
			System.out.println("Erro -> " + e);
		}
		
		hilo_2.start();
		// this is for the death of the thread
		hilo_2.stop();

		
		try {
			hilo_2.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Error -> " + e);
		}






	}

}
