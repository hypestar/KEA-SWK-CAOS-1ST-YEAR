package reges.chapter05;

import java.util.Random;

public class C05E08_RandomWalk {

		public static final int NEGATIVE = 0;
	
		public static void main(String[] args) {
	
			randoWalk();
	}
		
		public static void randoWalk(){
			int min = 0;
			int max = 0;
			int pos = 0;
			Random rand = new Random();
			
			do {
				if(rand.nextInt(2) == NEGATIVE){
					--pos;
				}else{
					++pos;
				}
				
				if(pos > max)max = pos;
				if(pos < min)min = pos;
				
				System.out.println("position = " + pos);
			} while (pos > -3 && pos < 3);
			
			System.out.println("max position = " + max + "  min position = " + min);
			
		}

}
