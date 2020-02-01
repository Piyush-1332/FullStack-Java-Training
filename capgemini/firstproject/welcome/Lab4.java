package capgemini.firstproject.welcome;

import java.util.Scanner;

public class Lab4 {
	Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		Lab4 mLab = new Lab4();
		mLab.sumOfCubes();
	}
	
	public void sumOfCubes() {
		System.out.println("Enter the Number: ");
		int num = s.nextInt();
		int rem=0,sum=0;
		while(num>0) {
			rem=num%10;
			sum=sum+rem*rem*rem;
			num=num/10;
		}
		System.out.println("The sum of the Cubes is : "+sum);
	}

}
