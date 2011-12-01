package reges.chapter02;

public class C02E09_40CharactersWidePattern {
	public static void main(String[] args) {
		
		for(int i=0;i<40;i++){
			System.out.print("-");
		}

		System.out.println();


		for(int i=0;i<10;i++){
			System.out.print("_-^-");
		}

		System.out.println();

		for(int i=0;i<2;i++){
			for(int j=1;j<=10;j++){
				for(int k=0;k<2;k++){
					if(j==10){System.out.print("0");}
					else{System.out.print(j);}
				}

			}
		}

		System.out.println();

		for(int i=0;i<40;i++){
			System.out.print("-");
		}
	}

}
