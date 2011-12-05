package caos.virtualmemory;

public class MMU {

	public MMU() {
		new PageTable(2048, 8192);
	}

	public static void main(String[] args) {
		new MMU();
	}
	
	

}
