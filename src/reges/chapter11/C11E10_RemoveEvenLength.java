package reges.chapter11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C11E10_RemoveEvenLength {

	public C11E10_RemoveEvenLength() {
	
	}

	public void removeEvenLength(Set<String> s){
		Iterator<String> i = s.iterator();
		
		while(i.hasNext()){
			if(i.next().length() % 2 == 0){
				i.remove();
			}
		}
	}
	
	public static void main(String[] args) {
		C11E10_RemoveEvenLength test = new C11E10_RemoveEvenLength();
		Set<String> s = new HashSet<String>();
	
		s.add("ostemad");
		s.add("Poul");
		s.add("Jacob");
		s.add("færge");
		s.add("mc");
		s.add("cykel");
		s.add("gummiged");
		s.add(":-)");
		
		test.removeEvenLength(s);
		System.out.println(s);
	}
}
