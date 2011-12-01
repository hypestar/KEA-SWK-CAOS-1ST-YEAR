package caos.threads.dogs;

public class Dog implements Runnable {

	private String name = ""; 
	private int cycle = 1;
	private int sleepTime = 1000;
	
	Dog(String name) {
		this.name = name;
	}
	
	Dog(String name, int sleepTime) {
		this.name = name;
		this.sleepTime = sleepTime * 1000;
	}
	
	@Override
	public void run() {
		
		 while (cycle <= 5){
			try {
				System.out.println(name + ": is sleeping");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			bark();
			cycle++;
		}
	}

	private void bark() {
		System.out.print(name + ": ");
		for (int i = 1;i <= cycle; i++){
			System.out.print("Vov " );
		}
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new Dog("Fido"));
		Thread t2 = new Thread(new Dog("Rolf", 2));
		Thread t3 = new Thread(new Dog("Django", 4));
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}
