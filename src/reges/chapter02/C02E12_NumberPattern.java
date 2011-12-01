package reges.chapter02;

public class C02E12_NumberPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		for (int i=0; i<5;i++){
			for (int j=9; j>0;j--){
				for (int k=0; k<5;k++){
					System.out.print(j);
				}
			}
			System.out.println();
		}

	}

}
