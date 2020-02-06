package capgemini.firstproject.welcome;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Lab7Ex6 {
	Scanner mScan = new Scanner(System.in);

	public static void main(String[] args) {
		Lab7Ex6 lab = new Lab7Ex6();
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		System.out.println("Enter Number of Citizen");
		int size = lab.mScan.nextInt();
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the Voter ID");
			int id = lab.mScan.nextInt();
			System.out.println("Enter Date of Birth in this format DD/MM/YYYY");
			String age = lab.mScan.next();
			hm.put(id, lab.getAge(age));
		}
		System.out.println(lab.votersList(hm));
	}

	public ArrayList<Integer> votersList(HashMap<Integer, Integer> hm) {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		Iterator<?> itr = hm.entrySet().iterator();
		while (itr.hasNext()) {
			@SuppressWarnings("unchecked")
			Map.Entry<Integer, Integer> me = (Map.Entry<Integer, Integer>) itr.next();
			if (me.getValue() >= 18) {
				ar.add(me.getKey());
			}
		}
		return ar;

	}

	public int getAge(String info) {
		String ar[] = info.split("/");
		LocalDate pdate = LocalDate.of(Integer.parseInt(ar[2]), Integer.parseInt(ar[1]), Integer.parseInt(ar[0]));
		LocalDate now = LocalDate.now();

		Period diff = Period.between(pdate, now);
		return diff.getYears();

	}

}
