package reges.chapter11;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class C11E11_SymmetricSetDifference<E> {

	public C11E11_SymmetricSetDifference() {

	}


	public Set<E> symmetricSetDifference(Set<E> s1, Set<E> s2){
		Set<E> difference = new HashSet<E>();
		Set<E> common = new HashSet<E>();
		Set<E> union = new HashSet<E>();
		
		union.addAll(s1);
		union.addAll(s2);
		
		common.addAll(s1);
		common.retainAll(s2);
		
		difference.addAll(union);
		difference.removeAll(common);
		
		return difference;
		
	}
	
	public static void main(String[] args) {
		C11E11_SymmetricSetDifference<Integer> test = new C11E11_SymmetricSetDifference<Integer>();
		
		Set<Integer> s1 = new HashSet<Integer>();
		Set<Integer> s2 = new TreeSet<Integer>();
		
		s1.add(1);
		s1.add(4);
		s1.add(7);
		s1.add(9);
		
		s2.add(2);
		s2.add(4);
		s2.add(5);
		s2.add(6);
		s2.add(7);
		
		System.out.println(test.symmetricSetDifference(s1, s2));
	}
}
