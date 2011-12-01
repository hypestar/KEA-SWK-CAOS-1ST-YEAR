package reges.chapter11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class C11E03_RemoveInRange {

	public C11E03_RemoveInRange() {
	
	}
	
	public void removeInRange(LinkedList list, Integer elementValue, int startIndex, int endIndex){
				
		if(!(startIndex > 0 && startIndex < list.size())){
			
			
		}
		
		if(!(endIndex > 0 && endIndex > startIndex)){
			
			
		}
		
		
		int range = endIndex - startIndex;
		int index = startIndex;
		
		while (range > 0){
			if (list.get(index) == elementValue){
				list.remove(index);
				index--;
			}
			index++;
			range--;
		}
	}
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList<Integer>();
		
		Random ran = new Random();
		for (int i = 0; i < 10; i++){
			list.add(ran.nextInt(3)+1);
		}
		System.out.println(list);
		C11E03_RemoveInRange test = new C11E03_RemoveInRange();
		test.removeInRange(list, 2, 0, 5);
		System.out.println(list);
	}
	
}
