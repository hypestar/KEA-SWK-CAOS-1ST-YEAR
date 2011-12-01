package reges.projects;

/*
       R!
  -----------
  N! x (R-N)!
 */

public class C04P07_PascalsTriangle {

	public static final String NUMBERWIDTH = "%4d";
	public static final String INDENTION = "  ";

	public static void main(String[] args) {
		printPascalTriangel(20, true);

	}

	public static void printPascalTriangel(int rows,boolean sierpinski) {
		int columns = -1; // number of columns in the current row
		long cellValue = 0;
		for (int row = 0; row < rows; row++) {

			for (int indent = 1; indent <= rows-row; indent++) {
				System.out.print(INDENTION);
			}
			columns++;
			for (int currentColumn = 0; currentColumn <= columns; currentColumn++) {
				cellValue = factorial(row) / (factorial(currentColumn) * factorial(row - currentColumn));
				if(!sierpinski){
					System.out.printf(NUMBERWIDTH, cellValue);
				}else if(cellValue%2 != 0){
					System.out.print("\u25B2   ");
				}else if(cellValue%2 == 0){
					System.out.print("    ");
				}

			}
			System.out.println();
		}
	}

	public static long factorial(int i) {
		long fac = 1;
		for (int x = 1; x <= i; x++) {
			fac *= x;
		}
		return fac;
	}

}
