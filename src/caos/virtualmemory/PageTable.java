package caos.virtualmemory;

import java.util.HashMap;

public class PageTable {
private int pageSize, numOfPages; 
private HashMap<Integer, VirtualPage> table = new HashMap<Integer, VirtualPage>();
		
	public PageTable(int numOfPages, int pageSize) {
		this.pageSize = pageSize;
		this.numOfPages = numOfPages;
		initTable();
	}

	private void initTable() {
		int pageAddressStart = 0;
		for (int i = 0;i < numOfPages;i++){
			table.put(i, new VirtualPage(i, pageAddressStart));
			pageAddressStart += pageSize;
		}
		
		for (int j = 0; j < 2048; j++){
			System.out.println(table.get(j).getPageStart());
		}
	}
}
