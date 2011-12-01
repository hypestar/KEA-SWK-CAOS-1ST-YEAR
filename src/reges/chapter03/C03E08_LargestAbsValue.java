package reges.chapter03;

public class C03E08_LargestAbsValue {

	
	public static void main(String[] args) {
		quadratic(2, -4, -16);
	}

	public static void quadratic(int a, int b, int c){
		
		System.out.println("X1 = " + (-b + Math.sqrt( (Math.pow(b, 2) - 4 * a * c) ) ) / (2 * a) );
		System.out.println("X2 = " + (-b - Math.sqrt( (Math.pow(b, 2) - 4 * a * c) ) ) / (2 * a) );
		
	}
}
