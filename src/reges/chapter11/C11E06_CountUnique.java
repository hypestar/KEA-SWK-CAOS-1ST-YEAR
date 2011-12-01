package reges.chapter11;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class C11E06_CountUnique {

	public C11E06_CountUnique() {
	
	}
	
	public int countUnique(List<Integer> l){
		Set<Integer> aux = new TreeSet<Integer>();
		aux.addAll(l);
		return aux.size();
	}


	public static void main(String[] args) {
		List<Integer> l = new LinkedList<Integer>();
		
		l.add(1);
		l.add(1);
		l.add(1);
		l.add(2);
		l.add(2);
		l.add(2);
		l.add(5);
		
		C11E06_CountUnique test = new C11E06_CountUnique();
		System.out.println(test.countUnique(l));
	}

}

