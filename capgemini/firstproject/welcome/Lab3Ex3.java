package capgemini.firstproject.welcome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab3Ex3 {
	int[] arr = new int[5];
	int num = 5;

	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader mBuff = new BufferedReader(isr);

	public static void main(String[] args) {
		Lab3Ex3 mObject = new Lab3Ex3();
		for (int i = 0; i < mObject.num; i++) {
			try {
				mObject.arr[i] = Integer.parseInt(mObject.mBuff.readLine());
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		mObject.getSorted(mObject.arr);

	}

	public int getSorted(int[] arr) {
		// reverse
		int r, temp;
		for (int i = 0; i < arr.length; i++) {
			int rev=0;
			while (arr[i] > 0) {
				r = arr[i] % 10;
				rev = rev * 10 + r;
				arr[i] = arr[i] / 10;
			}
			arr[i] = rev;
		}
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
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		return 0;
	}

}
