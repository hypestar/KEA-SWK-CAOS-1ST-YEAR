package reges.chapter11;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C11E14_Intersect {

	public C11E14_Intersect() {
	
	}
	
	public Map <String, Integer> intersect(Map<String,Integer> m1, Map<String, Integer> m2){
		Map<String, Integer> intersect = new HashMap<String, Integer>();
		
		for (String key : m1.keySet()){
			if ( m2.containsKey(key) && m1.get(key) == m2.get(key) ){
				intersect.put(key, m1.get(key));
			}
		}
		return intersect;
	}
	
	public static void main(String[] args) {
		C11E14_Intersect test = new C11E14_Intersect();
		Map<String, Integer> m1 = new TreeMap<String, Integer>();
		Map<String, Integer> m2 = new TreeMap<String, Integer>();
		
		m1.put("Poul", 55);
		m1.put("Ole", 88);
		m1.put("Ingrid", 90);
		m1.put("Berit", 88);
		
		m2.put("Ingrid", 90);
		m2.put("Poul", 55);
		m2.put("Jørgen", 76);
		m2.put("Jan", 34);
		
		System.out.println(test.intersect(m1, m2));
	}
}
