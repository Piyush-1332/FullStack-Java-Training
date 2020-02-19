package capgemini.firstproject.welcome;

import java.util.Scanner;

public class Lab10Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner mScan = new Scanner(System.in);

		Power p = (x, y) -> {
			System.out.println("Result " + Math.pow(x, y));
			return 0;
		};
		double x = mScan.nextDouble();
		double y = mScan.nextDouble();
		p.pow(x, y);

		mScan.close();
	}

	interface Power {
		int pow(double x, double y);
	}

}
