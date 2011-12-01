package reges.chapter03;



public class C03E03_PrintPowersOfN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPowersOfN(4, 3);
		printPowersOfN(5, 6);
		printPowersOfN(-2, 8);
	}

	public static void printPowersOfN(int baseNum, int exponentMax){
		
		for(int n = 0; n <= exponentMax; n++){
			System.out.print((int)java.lang.Math.pow(baseNum, n) + " ");
		}
		System.out.println();
	}
}
