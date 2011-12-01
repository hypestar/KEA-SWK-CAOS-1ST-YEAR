package reges.chapter02;

public class C02E15_PyramidOfNumbers {

	public static final int LINEWIDTH = 11;

	public static void main(String[] args) {
		printDesign();
	}
	
	public static void printDesign(){
		int num = -1;

		for(int line = 1; line <= 5;line++){
			num += 2;

			printDashes(num); // print predashes 

			// print numbers
			for(int pos = 1; pos <= num; pos++){
				System.out.print(num);
			}

			printDashes(num); // print postdashes

			System.out.println();
		}
	}

	public static void printDashes(int num){
		int blanks = (LINEWIDTH - num) / 2;
		// print predashes
		for(int pos = 1; pos <= blanks; pos++){
			System.out.print("-");
		}
	}
}
