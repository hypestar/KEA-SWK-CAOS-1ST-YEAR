package reges.chapter01;

public class C01E09_PrintTextPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		drawTop();
		drawBottom();
		System.out.println();
		drawCenter();
		System.out.println();
		drawTop();
		drawBottom();
		System.out.println();
		drawCenter();
		drawBottom();
		System.out.println();
		drawTop();
		drawCenter();
		drawBottom();
		
	}

	static void drawTop(){
		System.out.println("  -------  ");
		System.out.println(" /       \\");
		System.out.println("/         \\");
	}
	
    static void drawCenter(){
    	System.out.println("-\"-'-\"-'-\"-");
	}
    
    static void drawBottom(){
    	System.out.println("\\         /");
    	System.out.println(" \\       / ");
    	System.out.println("  -------  ");
	}
}
