package reges.chapter11;

import java.util.HashMap;
import java.util.Map;

public class C11E13_IsUnique {

	public C11E13_IsUnique() {

	}

	public boolean isUnique(Map<String, String> m){
		Map<String, Integer> aux = new HashMap<String, Integer>();
		
		for (String value : m.values()){
			if(aux.containsKey(value)){
				int count = aux.get(value) + 1;	
				aux.put(value, count);
			}else{
				aux.put(value, 1);
			}
		}
		
		for (Integer i : aux.values()){
			if (i > 1){
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		C11E13_IsUnique test = new C11E13_IsUnique();
		Map<String, String> m = new HashMap<String, String>();
		
		m.put("Preben", "Jensen");
		m.put("Jesper", "Hansen");
		m.put("Rasmus", "Eriksen");
		m.put("Ingolf", "Jensen");
	
		System.out.println(test.isUnique(m));
	}
}
