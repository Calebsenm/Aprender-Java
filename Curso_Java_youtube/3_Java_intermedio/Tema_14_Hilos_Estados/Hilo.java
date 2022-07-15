public class Hilo extends Thread{


	@Override
	public void run(){

		for (int i = 0; i < 10 ; i++){

			System.out.println(i);

			try{
				Hilo.sleep(1000);
				
			} catch(InterruptedException e){
				System.out.println("EROR EROR EROR");
			}
			
		}

	}

}
