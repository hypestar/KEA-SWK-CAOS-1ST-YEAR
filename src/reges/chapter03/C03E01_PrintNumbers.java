package reges.chapter03;

public class C03E01_PrintNumbers {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNumbers(15);
		printNumbers(5);
		
	}

	public static void printNumbers(int maxNum){
		
		for (int i = 1; i <= maxNum; i++){
			System.out.print("[");
			System.out.print(i);
			System.out.print("] ");
		}
		System.out.println();
	}
}
