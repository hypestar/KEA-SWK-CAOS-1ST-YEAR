package reges.chapter12;

public class C12E01_StarString {

	public static void main(String[] args) {
		new C12E01_StarString().starString(4);
	}
	
	public C12E01_StarString() {
	
	}
	
	public void starString(int n){
		
		if (n == 1){
			System.out.print("*");
		}else{
			
			starString(n-1);
		}
		
	}
	
}
