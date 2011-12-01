package swk.ducks;

import java.util.ArrayList;
import java.util.Random;

public class MyKickAssDuckCollection {

	public ArrayList<Duck> myDucks = new ArrayList<Duck>();
	
	
	
	
	public MyKickAssDuckCollection() {
		Random randgen = new Random();
		
		for (int duck = 0; duck < 50;duck++){
			
			int ducktype = randgen.nextInt(3);
			
			if (ducktype == 0){
				myDucks.add(new DecoyDuck());
			}else if (ducktype == 1){
				myDucks.add(new BadeAnd());
			}else if (ducktype == 2){
				myDucks.add(new DanishDuck());
			}
		}
		
		listenToMyDucks();
	}
	
	private void listenToMyDucks() {
		for(int duck = 0;duck < myDucks.size();duck++){
			myDucks.get(duck).sound();
		}
		
	}

	public static void main(String[] args) {
		new MyKickAssDuckCollection();
	}
	
}
