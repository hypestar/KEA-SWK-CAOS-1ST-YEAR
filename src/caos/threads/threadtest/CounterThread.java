package caos.threads.threadtest;

import javax.swing.plaf.SliderUI;


public class CounterThread implements Runnable{

	static int tally = 0;
	

	public CounterThread() {
	
	}
	
	public void run(){
		count();
		
		
	}

	private void count(){
		for(int i = 0;i< 50;i++){
			tally++;
		}
	}

	public static void main(String[] args) {
	
		Runnable run1 = new CounterThread();
		Runnable run2 = new CounterThread();

		Thread thread1 = new Thread(run1);
		Thread thread2 = new Thread(run2);
		
		thread1.start();
		thread2.start();

		System.out.println("Tally = " + tally);
		
		


	}




}
