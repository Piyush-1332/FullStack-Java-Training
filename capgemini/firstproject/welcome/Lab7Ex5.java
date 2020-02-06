/*
 *@Author Capgemini 
* @Developer Piyush Srivastava
* @Description This class is performing the banking process
* @Created 29/01/2020
* @Version 1.0
* 
*/
package capgemini.firstproject.welcome;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Lab7Ex5 {
	int num = 0;

	public static void main(String[] args) {
		Lab7Ex5 mLab = new Lab7Ex5();
		Scanner mScan = new Scanner(System.in);
		System.out.print("Enter the length of Array\n");
		mLab.num = mScan.nextInt();
		int[] arr = new int[mLab.num];
		for (int i = 0; i < mLab.num; i++) {
			arr[i] = mScan.nextInt();
		}
		System.out.print("The 2nd Largest element in the array is " + mLab.getSecondSmallest(arr));
		mScan.close();
	}

	public int getSecondSmallest(int[] arr) {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			ar.add(arr[i]);
		}
		Set<Integer> set = new LinkedHashSet<>();
		set.addAll(ar);
		ar.clear();
		ar.addAll(set);
		Collections.sort(ar);
		return ar.get(1);
	}

}