package reges.chapter11;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class C11E18_Reverse {

	public C11E18_Reverse() {
	
	}
	
	public Map<String, HashSet<String>> reverse(Map<String, String> m){
		Map<String, HashSet<String>> reverse = new HashMap<String, HashSet<String>>();
		
		for (String key : m.keySet()){
			if(reverse.containsKey(m.get(key))){
				reverse.get(m.get(key)).add(key);
			}else{
				reverse.put(m.get(key), new HashSet<String>());
				reverse.get(m.get(key)).add(key);
			}
		}
		return reverse;
	}
	
	public static void main(String[] args) {
		C11E18_Reverse test = new C11E18_Reverse();
		Map<String, String> m = new HashMap<String, String>();
		
		m.put("42", "Marty");
		m.put("81", "Sue");
		m.put("17", "Ed");
		m.put("31", "Dave");
		m.put("56", "Ed");
		m.put("3", "Marty");
		m.put("29", "Ed");
	
		System.out.println(test.reverse(m));
	}
}
