package reges.chapter11;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class C11E19_Rarest {

	public C11E19_Rarest() {

	}

	public int rarest(Map<String, Integer> m){

		if (m.isEmpty())
			try {
				throw new Exception("Map is empty");
			} catch (Exception e) {
				e.printStackTrace();
			}

		HashMap<Integer, Integer> statistic = new HashMap<Integer, Integer>();
		TreeSet<Integer> rarest = new TreeSet<Integer>(); 

		//populate statistic Map
		for(Integer num : m.values()){
			if (statistic.containsKey(num)){
				int count = statistic.get(num);
				statistic.put(num, ++count);
			}else{
				statistic.put(num, 1);
			}
		}

		//find the lowest num of occurrence
		int lowestNumOfOccurrence = Integer.MAX_VALUE;
		for(Integer numOfOccurrence : statistic.values()){
			if (numOfOccurrence < lowestNumOfOccurrence){
				lowestNumOfOccurrence = numOfOccurrence;
			}
		}

		//add the number(s) that occur the fewest times to a TreeSet 
		for(Integer num : statistic.keySet()){
			if (statistic.get(num) == lowestNumOfOccurrence){
				rarest.add(num);
			}
		}
		return rarest.first(); // the first is the smallest number ;-)
	}

	public static void main(String[] args) {
		C11E19_Rarest test = new C11E19_Rarest();
		Map<String, Integer> m = new HashMap<String, Integer>();

		m.put("Henning", 1);
		m.put("Egon", 56);
		m.put("Per", 1000);
		m.put("Sofus", 10);
		m.put("Preben", 56);
		m.put("Maj", 10);
		m.put("Ib", 1);
		m.put("Benjamin", 999);

		System.out.println(test.rarest(m));
	}
}
