package capgemini.firstproject.welcome;

import java.util.HashMap;
import java.util.Scanner;

public class Lab7Ex3 {
	int size;
	Scanner mScan = new Scanner(System.in);

	public static void main(String[] args) {
		Lab7Ex3 lab = new Lab7Ex3();
		System.out.println("Enter the size of array: ");
		lab.size = lab.mScan.nextInt();
		int[] arr = new int[lab.size];
		System.out.println("Enter the Elements of a array: ");
		for (int i = 0; i < lab.size; i++) {
			arr[i] = lab.mScan.nextInt();
		}
		System.out.println(lab.countCharacter(arr));
	}

	public HashMap<Integer, Integer> countCharacter(int[] arr) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {

			if (hm.containsKey(arr[i])) {
				
			} else {
				hm.put(arr[i], arr[i]*arr[i]);
			}

		}
		return hm;

	}
}
