package reges.chapter05;

import java.util.Random;

public class C05E04_RandomX {


	public static void main(String[] args) {
		randomX();

	}

	public static void randomX(){
		Random rand = new Random();
		int xNum;
		while (true){
			xNum = rand.nextInt(15) + 5;
						 
			for (int i=0; i<xNum;i++){
				System.out.print("x");
			}
			System.out.println();
			
			if(xNum > 15)break;
		}
	}
}
