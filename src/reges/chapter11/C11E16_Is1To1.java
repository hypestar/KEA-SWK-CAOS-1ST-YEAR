package reges.chapter11;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class C11E16_Is1To1 {

	public C11E16_Is1To1() {
	
	}
	
	public boolean is1to1(Map<String, String> m){
		Set<String> aux = new HashSet<String>(); 
		
		for (String value : m.values()){
			aux.add(value);
		}
		
		if (m.size() != aux.size()) return false;
		
		return true;
	}
	
	public static void main(String[] args) {
		C11E16_Is1To1 test = new C11E16_Is1To1();
		Map<String, String> m = new HashMap<String, String>();
		
		m.put("Egon", "555-4545");
		m.put("Peter", "555-4545");
		m.put("Hans", "555-6969");
		System.out.println(test.is1to1(m));
	}
}
