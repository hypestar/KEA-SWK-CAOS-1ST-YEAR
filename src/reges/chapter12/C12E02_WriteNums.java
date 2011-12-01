package reges.chapter12;

public class C12E02_WriteNums {

	public static void main(String[] args) {
		new C12E02_WriteNums().writeNums(10);
	}
	
	public C12E02_WriteNums() {
	
	}
	
	public void writeNums(int n){
		
		if (){
			System.out.print("1");
		}else{
		System.out.print((n-(n-1)) + ", ");
		writeNums(n-1);
		}
		
	}

}
