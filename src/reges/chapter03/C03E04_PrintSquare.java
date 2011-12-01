package reges.chapter03;

public class C03E04_PrintSquare {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSquare(1, 9);
	}

	public static void printSquare(int startNum, int endNum){
		int numPerLine = endNum - startNum + 2; // +2 include both start and end numbers
		int lines = numPerLine; 
		int currentNum = startNum;

		// lines loop
		for (int line = 1; line < lines; line++){

			// column loop
			for (int i = 1; i <= numPerLine; i++){
				System.out.print(currentNum);
				if(currentNum == endNum){
					currentNum = startNum;
				}else {
					currentNum++;
				}
			}
			System.out.println();		
		}




	}
}
