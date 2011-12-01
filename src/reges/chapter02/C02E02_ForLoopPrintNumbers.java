package reges.chapter02;

public class C02E02_ForLoopPrintNumbers {

	/**
	 * @param args 1 4 9 16 25 36 49 64 81 100
	 *             1 3 5  7  9 11 13 15 17  19 
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int increaseNum = -1;
		int num = 0;
		
		for (int i = 1; i<11; i++){
			increaseNum+= 2;
			System.out.println(num += increaseNum);
		}
	}

}
