package reges.chapter11;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class C11E12_Contains3 {

	public C11E12_Contains3() {
		// TODO Auto-generated constructor stub
	}


	public boolean contains3(List<String> l){
		Map<String, Integer> m = new TreeMap<String, Integer>();
		Iterator<String> i = l.iterator();
		
		while(i.hasNext()){
			String word = i.next().toLowerCase();
			if (m.containsKey(word)){
				int count = m.get(word) + 1;
				m.put(word, count);
			} else {
				m.put(word, 1);
			}
		}
		
		for (String word : m.keySet()){
			int count = m.get(word);
			if(count == 3){
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		C11E12_Contains3 test = new C11E12_Contains3();
		List<String> l = new LinkedList<String>();
		
		l.add("Ostemad");
		//l.add("ostemad");
		l.add("OstemAd");
		l.add("Peter");
		
		System.out.println(test.contains3(l));
		
	}
}
