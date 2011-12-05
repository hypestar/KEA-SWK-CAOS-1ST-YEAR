package caos.virtualmemory;

public class VirtualPage {

	private int pageNum, pageStart, pageFrameNum;
	
	public VirtualPage(int pageNum, int pageStart) {
		this.pageNum = pageNum;
		this.pageStart = pageStart;
	}

	public int getPageStart() {
		return pageStart;
	}
	
	
	
}
