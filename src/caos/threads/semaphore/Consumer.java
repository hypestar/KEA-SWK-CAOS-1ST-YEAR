package caos.threads.semaphore;

import java.util.concurrent.Semaphore;

public class Consumer extends Thread {
	private Semaphore semaphore;
	private String id;
	
	public Consumer(Semaphore semaphore, String name) {
		this.semaphore = semaphore;
		this.id = name;
	}
	
	@Override
	public void run() {
	
		try {
			semaphore.acquire();
			
		} catch (InterruptedException e) {
			System.out.println("Consumer" + id + ": bummer dude nothing left to consume");
		}
		consume();
		semaphore.release();
	}
	
	private void consume(){
		System.out.println("Consumer" + id + ": I'm consuming");
		/*try {
			sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}

}
