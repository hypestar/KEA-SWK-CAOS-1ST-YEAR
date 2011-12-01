package reges.chapter02;

public class C02E11_RotatingIncreasingListVer2 {

	public static final int MAGIC_NUM=5;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i=0;i<6;i++){
			for (int j = 1;j <= MAGIC_NUM;j++){
				if(j == MAGIC_NUM) System.out.print("|");
				else System.out.print(" ");
			}

		}
		System.out.println();

		for (int i=0;i<6;i++){
			for (int k = 1;k <= MAGIC_NUM;k++){
				if(k!=MAGIC_NUM){
				System.out.print(k);
				}else System.out.print(0);
			}
		}


	}

}
