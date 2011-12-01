package reges.chapter05;

import java.util.Random;

public class C05E11_ThreeHeads {

	public static final int HEADS = 1;
	public static final int TAILS = 0;
	public static void main(String[] args) {
		threeHeads();
	}
	
	public static void threeHeads(){
		Random rand = new Random();
		int headsSequence = 0;
		int coin;
		
		while (headsSequence < 3){
			coin = rand.nextInt(2);
			
			if (coin == HEADS){
				System.out.print("H ");
				headsSequence++;
			}else if (coin == TAILS) {
				System.out.print("T ");
				headsSequence = 0;
			}
		}
		System.out.println();
		System.out.println("Three heads in a row");
	}
}
