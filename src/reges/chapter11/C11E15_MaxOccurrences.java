package reges.chapter11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class C11E15_MaxOccurrences {

	public C11E15_MaxOccurrences() {
	
	}
	
	public int maxOccurrences(List<Integer> l){
		
		if(l.isEmpty()) return 0;
		
		Map<Integer, Integer> aux = new HashMap<Integer, Integer>();
		Iterator<Integer> i = l.iterator();
				
		while (i.hasNext()){
			Integer num = new Integer(i.next());
			if (aux.containsKey(num)){
				aux.put(num, aux.get(num) + 1);
			}else{
				aux.put(num, 1);
			}
		}
		
		int maxOccurrence = 0;
		for (Integer value : aux.values()){
			if (value > maxOccurrence){
				maxOccurrence = value;
			}
		}
		return maxOccurrence;
	}
	
	public static void main(String[] args) {
		C11E15_MaxOccurrences test = new C11E15_MaxOccurrences();
		List<Integer> l = new ArrayList<Integer>();
		
		Random ranGen = new Random();
		for(int i = 0; i < 20;i++){
			l.add(ranGen.nextInt(10)+1);
		}
		
		System.out.println(l);
		System.out.println(test.maxOccurrences(l));
	}
}
