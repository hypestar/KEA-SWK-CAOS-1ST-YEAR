package reges.chapter11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C11E08_MaxLength {

	public C11E08_MaxLength() {

	}

	public int maxLength(Set<String> s){
		if (s.isEmpty()) return 0;

		List <String> l = new ArrayList<String>();
		l.addAll(s);
		Collections.sort(l, new StringLengthComparator());
		System.out.println(l);
		return l.get(l.size()-1).length();

	}

	public static void main(String[] args) {
		C11E08_MaxLength test = new C11E08_MaxLength();
		Set<String> s = new HashSet<String>();

		s.add("Johannes");
		s.add("Poul");
		s.add("Preben");
		s.add("Herman");
		

		System.out.println(test.maxLength(s));

	}

	class StringLengthComparator implements Comparator<String> {
		public int compare(String o1, String o2) {
			if (o1.length() < o2.length()) {
				return -1;
			} else if (o1.length() > o2.length()) {
				return 1;
			} else {
				return 0;
			}
		}
	}
}
