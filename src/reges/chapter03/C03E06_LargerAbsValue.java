package reges.chapter03;

public class C03E06_LargerAbsValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          System.out.println(largerABSVal(-6, 5));
          System.out.println(largerABSVal(-6, -7));
	}

	public static int largerABSVal(int num1, int num2){
		
		if(Math.abs(num1) > Math.abs(num2)){
			return Math.abs(num1);
		}else {
			return Math.abs(num2);
		}
	}
	
}
