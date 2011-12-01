package reges.chapter02;

public class C02E16_UpSideDownPyramidOfExclamationPoints {
	public static final int LINEWIDTH = 22;


	public static void main(String[] args) {

		int numSlash = -2; // numSlash is 2 in this case. Not 4!: \\!!!!!!!!!!!!!!!!!!!!!!//
		for (int line = 1;line <= 6;line++){
			numSlash = numSlash + 2;
			
			printSlash(numSlash, true);
			printExclamationPoint(numSlash);
			printSlash(numSlash, false);
			System.out.println();
			
		}

	}

	public static void printSlash(int numSlash, boolean isBackSlash){
		for(int i = 1; i <= numSlash; i++){
			if(!isBackSlash){
				System.out.print("/");
			}
			if(isBackSlash){
				System.out.print("\\");
			}
		}
	}

	public static void printExclamationPoint(int numSlash){
		int totalSlashNumOnLine = numSlash * 2;
		int numExclamationPoint = LINEWIDTH - totalSlashNumOnLine;
		
		for (int i = 1; i <= numExclamationPoint; i++){
			System.out.print("!");
		}
	}
}
