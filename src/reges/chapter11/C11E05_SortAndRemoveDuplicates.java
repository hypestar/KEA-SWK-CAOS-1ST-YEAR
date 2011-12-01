package reges.chapter11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class C11E05_SortAndRemoveDuplicates {
	
	public C11E05_SortAndRemoveDuplicates() {
	
	}
	
	void sortAndRemoveDuplicates(List<Integer> l){
		Set tree = new TreeSet<Integer>(); 
		
		tree.addAll(l);
		l.clear();
		l.addAll(tree);
		Collections.sort(l);
		
	}
	
	public static void main(String[] args) {
		
		List l = new ArrayList<Integer>();
		l.add(8);
		l.add(1);
		l.add(8);
		System.out.println(l);
		
		C11E05_SortAndRemoveDuplicates test = new C11E05_SortAndRemoveDuplicates();
		test.sortAndRemoveDuplicates(l);
		System.out.println(l);
	}

}
