package reges.chapter02;

public class C02E14_NumberPatternVer3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		for (int i=0; i<3;i++){
			for (int j=9; j>0;j--){
				for (int k=0; k<j;k++){
					System.out.print(j);
				}
			}
			System.out.println();
		}

	}

}
