package reges.chapter11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C11E02_Alternate {

	public C11E02_Alternate() {
		// TODO Auto-generated constructor stub
	}


	public List alternate(List l1, List l2){
		ArrayList<Object> list = new ArrayList<Object>();
		while (!l1.isEmpty() || !l2.isEmpty() ){
			if (!l1.isEmpty()){
				list.add(l1.get(0));
				l1.remove(0);
			}
			if (!l2.isEmpty()){
				list.add(l2.get(0));
				l2.remove(0);
			}
		};
		return list;
	}
	
	public static void main(String[] args) {
		List l1 = new ArrayList<Integer>();
		List l2 = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++){
			l1.add(new Integer(i));	
		}
		for (int i = 100; i < 105; i++){
			l2.add(new Integer(i));	
		}
		C11E02_Alternate test = new C11E02_Alternate();
		System.out.println(test.alternate(l1, l2));
		
		
		
	}
}


