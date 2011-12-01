package reges.chapter11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class C11E07_CountCommon {

	public C11E07_CountCommon() {

	}

	public int countCommon(List<Integer> l1, List<Integer> l2){
		List<Integer> ll1 = new ArrayList<Integer>();
		List<Integer> ll2 = new ArrayList<Integer>();
		
		ll1.addAll(l1);
		ll2.addAll(l2);
		
		ll1.retainAll(ll2);
		
		return ll1.size();
	}

	public static void main(String[] args) {
		C11E07_CountCommon test = new C11E07_CountCommon();
		List<Integer> l1 = new LinkedList<Integer>();
		List<Integer> l2 = new ArrayList<Integer>();
		
		l1.add(1);
		l1.add(2);
		l1.add(4);
		l1.add(5);
		l1.add(5);
		
		l2.add(1);
		l2.add(2);
		
		System.out.println(test.countCommon(l1, l2));
	}

}

