package reges.chapter05;

public class C05E05_RandomLines {

	/**
	 * 'a'-'z'   ==  97-122  
	 */
	public static void main(String[] args) {
		randomLines();

	}

	public static void randomLines(){
		StringBuffer sb;
		int charNum;
		int numOfLines = (int) (Math.random() * 5 + 5);
		int stringLength;

		for (int i = 1; i <= numOfLines; i++){ //random lines (5-10)
			sb = new StringBuffer();
			stringLength = (int)(Math.random() * 80 + 1);
			for (int j = 1; j <= stringLength ;j++){ //random num of chars (1-80) 
				//sb.append((char)(Math.random()*122 + 97));  //'a'-'z'   ==  97-122
				charNum = (int)(Math.random()*26) + 97;
				sb.append((char)charNum);
			}
			System.out.println(sb);

		}
	}
}
