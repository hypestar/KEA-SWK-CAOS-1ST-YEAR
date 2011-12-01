package reges.chapter11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class C11E04_Partition {

	public C11E04_Partition() {
		// TODO Auto-generated constructor stub
	}
	
	public void partition(List l1, int e){
		Collections.sort(l1);
	}


	public static void main(String[] args) {
		List l1 = new LinkedList<Integer>();
		l1.add(6);
		l1.add(1);
		l1.add(-6);
		System.out.println(l1);
		C11E04_Partition test = new C11E04_Partition();
		test.partition(l1, 2);
		System.out.println(l1);
	}
}
