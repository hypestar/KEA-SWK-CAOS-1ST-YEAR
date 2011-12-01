package reges.chapter02;

public class C02E03_Fibonacci {
	/**
	 * @param args 
	 *              
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// x + y = z
		int x = 1;
		int y = 1;
		int z = 0;
		System.out.print("1 1 ");

		for (int i=1;i<50;i++){
			z = x + y;
			System.out.print(z + " ");
			x = y;
			y = z;
		}
		
	}
}
