package capgemini.firstproject.welcome;

import java.util.HashMap;
import java.util.Scanner;

public class Lab7Ex2 {
	int size;
	Scanner mScan = new Scanner(System.in);

	public static void main(String[] args) {
		Lab7Ex2 lab = new Lab7Ex2();
		System.out.println("Enter the size of array: ");
		lab.size = lab.mScan.nextInt();
		char[] arr = new char[lab.size];
		System.out.println("Enter the Elements of a array: ");
		for (int i = 0; i < lab.size; i++) {
			arr[i] = lab.mScan.next().charAt(0);
		}
		System.out.println(lab.countCharacter(arr));
	}

	public HashMap<Character, Integer> countCharacter(char[] arr) {
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		for (int i = 0; i < arr.length; i++) {

			if (hm.containsKey(arr[i])) {
				hm.put(arr[i], hm.get(arr[i]) + 1);
			} else {
				hm.put(arr[i], 1);
			}

		}
		return hm;

	}
}
