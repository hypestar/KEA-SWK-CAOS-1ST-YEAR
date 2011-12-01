package reges.chapter02;

public class C02E08_TriangleOfNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1;i<=5;i++){
		
			for (int j = 5; j>i; j--){
				System.out.print(" ");
			}
			
			for (int k=1; k<= i;k++){
				System.out.print(i);
			}
			
			
		//System.out.print(i);
		System.out.println();
		}
	}
}
