package reges.chapter01;

public class C01E08_PrintCircle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
