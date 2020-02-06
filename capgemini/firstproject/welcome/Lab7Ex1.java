package capgemini.firstproject.welcome;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Lab7Ex1 {

	public static void main(String[] args) {
		Lab7Ex1 lab = new Lab7Ex1();
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "John Doe");
		hm.put(2, "Tom Smith");
		hm.put(3, "Jane Baker");
		hm.put(4, "Tod Hall");
		hm.put(5, "Ralph Smith");

		System.out.println(lab.getValues(hm));

	}

	public ArrayList<String> getValues(HashMap<Integer, String> hm) {
		ArrayList<String> list = new ArrayList<String>();
		@SuppressWarnings("rawtypes")
		Set set = hm.entrySet();
		@SuppressWarnings("rawtypes")
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			@SuppressWarnings("rawtypes")
			Map.Entry me = (Map.Entry) itr.next();
			list.add((String) me.getValue());
		}
		hm.clear();
		Collections.sort(list);
		return list;
	}

}
