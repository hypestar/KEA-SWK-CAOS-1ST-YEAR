package caos.threads.semaphore;

import java.util.ArrayList;
import java.util.concurrent.Semaphore;

public class SemaphoreProgram {
	
	
	public static void main(String[] args) {
		ArrayList<Consumer> consumers = new ArrayList<Consumer>();
		
		
		Semaphore semaphore = new Semaphore(1,true);
		for (int con = 0; con < 1000; con++){
			consumers.add(new Consumer(semaphore, Integer.toString(con)));
			consumers.get(con).start();
		}
		
	}

}
