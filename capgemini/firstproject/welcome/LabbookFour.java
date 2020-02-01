package capgemini.firstproject.welcome;

import java.util.Scanner;

public class LabbookFour {
	int number;
	Scanner mScanner = new Scanner(System.in);
	public static void main(String[] args) {
		LabbookFour mObject = new LabbookFour();
		mObject.number=mObject.mScanner.nextInt();
		System.out.println("Answer is "+mObject.checkPow(mObject.number));
	}
	public boolean checkPow(int number) {
		
		int temp=0;
		int flag=0;
		while(number>1) {
			if (number%2==0) {
				number=number/2;
				number=temp;
				flag=1;
			}
			else {
				flag=0;
				break;
			}
		}
		if(flag==1) {
			return true;
		}
		else {
			return false;
		}
	}
}
