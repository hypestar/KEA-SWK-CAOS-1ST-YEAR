package swk.animals;

public class DecoyDuck extends Duck {
	
	private String color = "Brown";
	
	public void sound(){
		System.out.println("Decoy Duck: >>> The Sound of Silence <<<");
	}

	public void move() {
		System.out.println("Decoy Ducck: I Can't move !!!");
	}
}
