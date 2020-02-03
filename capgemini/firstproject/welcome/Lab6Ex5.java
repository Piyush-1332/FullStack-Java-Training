package capgemini.firstproject.welcome;

import java.util.Scanner;

public class Lab6Ex5 {
	Scanner mScan = new Scanner(System.in);

	public static void main(String[] args) {
		Lab6Ex5 lab = new Lab6Ex5();
		lab.modifyNum(lab.mScan.nextInt());
	}

	public void modifyNum(int num) {
		int temp;
		String n = Integer.toString(num);
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < n.length(); i++) {
			if (i != n.length() - 1) {
				temp = Character.getNumericValue(n.charAt(i + 1)) - Character.getNumericValue(n.charAt(i));
				if (temp < 0) {
					temp = -1 * temp;
					sb.append(temp);
				} else {
					sb.append(temp);
				}
			} else {
				sb.append(n.charAt(i));
			}

		}
		System.out.println(sb);
	}
}
