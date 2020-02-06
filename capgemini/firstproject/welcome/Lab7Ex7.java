package capgemini.firstproject.welcome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Lab7Ex7 {
	int[] arr = new int[5];
	int num = 5;

	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader mBuff = new BufferedReader(isr);

	public static void main(String[] args) {
		Lab7Ex7 mObject = new Lab7Ex7();
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
		System.out.println(mObject.getSorted(mObject.arr));

	}

	public ArrayList<Integer> getSorted(int[] arr) {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		StringBuilder sb = new StringBuilder();
		for(int i=0 ;i<arr.length;i++) {
			String s = Integer.toString(arr[i]);
			sb.append(s);
			sb.reverse();
			ar.add(Integer.parseInt(sb.toString()));
			sb.delete(0,sb.toString().length());
		}

		Collections.sort(ar);
		return ar;
	}

}
