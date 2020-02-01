package capgemini.firstproject.welcome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab5Ex3 {
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader mBuff = new BufferedReader(isr);
	int num;

	public static void main(String[] args) {
		Lab5Ex3 lab = new Lab5Ex3();
		lab.prime();
	}

	public void prime() {
		System.out.println("Enter the number of the prime number you want : ");
		try {
			num = Integer.parseInt(mBuff.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 2; i < num; i++) {
			int flag = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = 1;
				}
			}
			if (flag == 0) {
				System.out.println(i);
			}

		}

	}

}
