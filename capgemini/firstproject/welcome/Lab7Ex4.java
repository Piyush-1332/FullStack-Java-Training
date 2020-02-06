package capgemini.firstproject.welcome;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Lab7Ex4 {
	Scanner mScan = new Scanner(System.in);

	public static void main(String[] args) {
		Lab7Ex4 lab = new Lab7Ex4();
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		System.out.println("Enter Number of Students");
		int size = lab.mScan.nextInt();
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the Reg Number");
			int num = lab.mScan.nextInt();
			System.out.println("Enter the Marks");
			int marks = lab.mScan.nextInt();
			hm.put(num, marks);
		}
		System.out.println(lab.getStudents(hm));
	}

	public HashMap<Integer, String> getStudents(HashMap<Integer, Integer> hm) {
		HashMap<Integer, String> out = new HashMap<Integer, String>();
		Iterator<?> itr = hm.entrySet().iterator();
		while (itr.hasNext()) {
			@SuppressWarnings("unchecked")
			Map.Entry<Integer, Integer> me = (Map.Entry<Integer, Integer>) itr.next();
			if (me.getValue() >= 90) {
				out.put(me.getKey(),"GOLD");
			}
			else if(me.getValue()>=80 && me.getValue()<90) {
				out.put(me.getKey(), "SILVER");
			}
			else if(me.getValue()>=70 && me.getValue()<80) {
				out.put(me.getKey(), "BRONZE");
			}
		}

		return out;

	}

}
