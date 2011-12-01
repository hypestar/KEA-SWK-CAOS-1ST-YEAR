package reges.chapter02;

public class C02E10_RotatingIncreasingList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i=0;i<6;i++){
			for (int j = 1;j <= 10;j++){
				if(j == 10) System.out.print("|");
				else System.out.print(" ");
			}

		}
		System.out.println();

		for (int i=0;i<6;i++){
			for (int k = 1;k <= 10;k++){
				if(k!=10){
				System.out.print(k);
				}else System.out.print(0);
			}
		}


	}

}
