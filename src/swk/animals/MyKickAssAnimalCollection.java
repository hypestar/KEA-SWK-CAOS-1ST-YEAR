package swk.animals;

import java.util.ArrayList;
import java.util.Random;

public class MyKickAssAnimalCollection {

	public ArrayList<Animal> myAnimals = new ArrayList<Animal>();
	
	
	
	
	public MyKickAssAnimalCollection() {
		Random randgen = new Random();
		
		for (int animal = 0; animal < 50;animal++){
			
			int animaltype = randgen.nextInt(6);
			
			if (animaltype == 0){
				myAnimals.add(new DecoyDuck());
			}else if (animaltype == 1){
				myAnimals.add(new BadeAnd());
			}else if (animaltype == 2){
				myAnimals.add(new DanishDuck());
			}else if (animaltype == 3){
				myAnimals.add(new Pitbull());
			}else if (animaltype == 4){
				myAnimals.add(new Bulldog());
			}else if (animaltype == 5){
				myAnimals.add(new GreyHound());
			}
		}
		
		listenToMyAnimals();
		moveMyAnimals();
	}
	
	private void listenToMyAnimals() {
		for(int animal = 0;animal < myAnimals.size();animal++){
			myAnimals.get(animal).sound();
		}
		
	}
	
	private void moveMyAnimals() {
		for(int animal = 0;animal < myAnimals.size();animal++){
			myAnimals.get(animal).move();
		}
		
	}

	public static void main(String[] args) {
		new MyKickAssAnimalCollection();
	}
	
}
