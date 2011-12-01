package reges.chapter11;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class C11E09_HasOdd {

	public C11E09_HasOdd() {
	
	}
	
	public boolean hasOdd(Set<Integer> s){
		Iterator<Integer> i = s.iterator();
		
		while(i.hasNext()){
			if(i.next() % 2 != 0){
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		C11E09_HasOdd test = new C11E09_HasOdd();
		Set<Integer> s = new TreeSet<Integer>();
		
		s.add(8);
		s.add(2);
		s.add(4);
		s.add(6);
		
		System.out.println(test.hasOdd(s));
	}
	
}
