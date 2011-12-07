package caos.virtualmemory;

public class VirtualMemoryAddressConverter {
	private static final int NOT_IN_MEMORY = -1, PAGE_SIZE = 8192;
	private int[] pageTable = new int[10];
	private int numOfPageBits = (int)(Math.log(PAGE_SIZE) / Math.log(2));
	private int virtualAddress = 41044;
	
	
	public VirtualMemoryAddressConverter() {
		initPageTable();
		virtualAddress2PhysicalAddress(virtualAddress);
		
	
	}
	
	public void virtualAddress2PhysicalAddress(int virtualAddressInDecimalFormat){
		String pageNumInBinaryFormat = getPageNumInBinaryFormat(virtualAddress, 32);
		getFrameAddressInBinaryFormat(pageNumInBinaryFormat);
		//return "";
	}
	
	private String getFrameAddressInBinaryFormat(String pageNumInBinaryFormat){
		int frameNumber = pageTable[Integer.parseInt(pageNumInBinaryFormat, 2)];
		System.out.println(frameNumber);
		return "";
	}
	
	
	private String getPageNumInBinaryFormat(int virtualAddressInDecimalFormat, int addressBitLength){
		String virtualAddressBinaryFormat = Integer.toBinaryString(virtualAddressInDecimalFormat);

		System.out.println(virtualAddressBinaryFormat);
		
		virtualAddressBinaryFormat = zeroPadding(virtualAddressBinaryFormat, addressBitLength); 
		System.out.println(virtualAddressBinaryFormat);
		
		virtualAddressBinaryFormat = virtualAddressBinaryFormat.substring(0, addressBitLength - numOfPageBits);
		
		
		return virtualAddressBinaryFormat;
	}
	
	private void initPageTable() {
		// Clear page table 
		for(int page = 0;page < pageTable.length;page++){
			pageTable[page] = NOT_IN_MEMORY;
		}
		//Recreate page table from the exercise
		pageTable[1] = 2;
		pageTable[3] = 1;
		pageTable[5] = 3;
		pageTable[6] = 0;
	}
	
	//Make sure that the binaryNum has the same length as 
	//bitSize by prepending it with zeros
	private String zeroPadding(String binaryNum, int bitSize){
		StringBuilder paddedBinaryNum = new StringBuilder(binaryNum);
		while (paddedBinaryNum.length() < bitSize){
			paddedBinaryNum.reverse();
			paddedBinaryNum.append("0");
			paddedBinaryNum.reverse();
		}
		return paddedBinaryNum.toString();
	}

	public static void main(String[] args) {
		new VirtualMemoryAddressConverter();
	}
}
