package reges.chapter03;

public class C03E05_PrintGrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printGrid(20, 20);

	}

	public static void printGrid(int rows, int columns){
		int currentNum = 1;
		
		for (int row = 1; row <= rows; row++){
			
			for (int column = 1; column <= columns; column++){
				if(column == 1){
					currentNum = row; // the num in the 1st col is always equal to the row num
				}else {
					currentNum += rows; //num increases with the number of rows
				}
				
				System.out.print(currentNum + " ");
				
			}
			System.out.println();
			
		}
	}
}
