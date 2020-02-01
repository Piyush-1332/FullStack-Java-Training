/*
 *@Author Capgemini 
* @Developer Piyush Srivastava
* @Description This class is performing the banking process
* @Created 29/01/2020
* @Version 1.0
* 
*/
package capgemini.firstproject.welcome;

import java.util.Scanner;

public class Lab3Ex1 {
	int num = 0;

	public static void main(String[] args) {
		Lab3Ex1 mLab = new Lab3Ex1();
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
		int temp = 0;

		// Displaying elements of original array
//		System.out.println("Elements of original array: ");
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}

		// Sort the array in ascending order
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}


		// Displaying elements of array after sorting
		System.out.println("Elements of array sorted in ascending order: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		// returning the second largest element of the array
		return arr[arr.length - 2];
	}
}