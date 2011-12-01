package reges.chapter11;

import java.util.HashMap;
import java.util.Map;

public class C11E17_SubMap {

	public C11E17_SubMap() {
	
	}

	public boolean subMap(Map<String, String> m1, Map<String, String> m2){
		for (String key : m1.keySet()){
			if (!(m1.get(key) == m2.get(key))){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		C11E17_SubMap test = new C11E17_SubMap();
		Map<String, String> m1 = new HashMap<String, String>();
		Map<String, String> m2 = new HashMap<String, String>();
	
		m1.put("Bent", "555-6969");
		m1.put("Berit", "555-6868");
		
		m2.put("Bent", "555-6969");
		m2.put("Berit", "555-6868");
		m2.put("Hans", "555-8008");
		m2.put("Yrsa", "555-0880");
		
		System.out.println(test.subMap(m1, m2));
	}
}
