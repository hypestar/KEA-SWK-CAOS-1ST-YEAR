package reges.chapter03;



public class C03E02_PrintPowersOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPowersOf2(3);
		printPowersOf2(10);
		
	}

	public static void printPowersOf2(int num){
		
		for(int n = 0; n <= num; n++){
			System.out.print((int)java.lang.Math.pow(2, n) + " ");
		}
		System.out.println();
	}
}
