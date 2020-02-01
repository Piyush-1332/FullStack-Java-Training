/*
 * @Author Capgemini 
 * @Developer Piyush Srivastava
 * @Description This class is performing the banking process
 * @Created 24/01/2020
 * @Version 1.0
 * @Status release Beta
 * 
 */

package capgemini.firstproject.welcome;

import java.util.Scanner;

public class Banking {
	int minBalance = 1000, count = 0, countw = 0, carryInterest = 0;
	Scanner mScanner = new Scanner(System.in);

	public static void main(String[] args) {
		Banking mObject = new Banking();
		mObject.welcome();
		mObject.mScanner.close();
	}

	public void welcome() {
		System.out.println("Welcome to Indian Banking System");
		System.out.println("Select Your Bank\n1.ICICI \n2.HDFC \n3.SBI \n4.AXIS\n");
		int choice = mScanner.nextInt();
		switch (choice) {
		case 1:
			icici();
			break;
		case 2:
			hdfc();
			break;
		case 3:
			sbi();
			break;
		case 4:
			axis();
			break;
		default:
			System.out.println("Wrong input Entered\n");
		}

	}

	public void icici() {
		System.out.println("Select Operation\n1.Add\n2.Withdraw\n");
		int op = mScanner.nextInt();
		switch (op) {
		case 1:
			add();
			break;
		case 2:
			withdraw();
			break;
		default:
			System.out.println("Wrong operation selected");

		}
	}

	public void hdfc() {
		System.out.println("Select Operation\n1.Add\n2.Withdraw\n3.Show Balance\n");
		int op = mScanner.nextInt();
		switch (op) {
		case 1:
			add();
			break;
		case 2:
			withdraw();
			break;
		default:
			System.out.println("Wrong operation selected");
		}
	}

	public void sbi() {
		System.out.println("Select Operation\n1.Add\n2.Withdraw\n3.Show Balance\n");
		int op = mScanner.nextInt();
		switch (op) {
		case 1:
			add();
			break;
		case 2:
			withdraw();
			break;
		default:
			System.out.println("Wrong operation selected");
		}
	}

	public void axis() {
		System.out.println("Select Operation\n1.Add\n2.Withdraw\n3.Show Balance\n");
		int op = mScanner.nextInt();
		switch (op) {
		case 1:
			add();
			break;
		case 2:
			withdraw();
			break;
		default:
			System.out.println("Wrong operation selected");
		}
	}

	public void add() {
		int deposit = 0;
		System.out.println("Enter the amount to be added ");
		deposit = mScanner.nextInt();
		if (count <= 3) {
			minBalance = minBalance + deposit;
			count = count + 1;
		} else {
			minBalance = minBalance + deposit + ((15 * deposit) / 1000);
			count = count + 1;
		}
		System.out.println(minBalance);
		icici();

	}

	public void withdraw() {
		int deduct = 0;
		System.out.println("Enter the amount to deducted ");
		deduct = mScanner.nextInt();
		if (minBalance - deduct < 1000 && countw > 3) {
			countw = countw + 1;
			System.out.print("Transaction Failed : Not Enough Balance");
			carryInterest = 1;
		} else if (minBalance - deduct < 1000 && countw <= 3) {
			countw = countw + 1;
			System.out.print("Transaction Failed : Not Enough Balance");
		} else {
			if (countw <= 3) {
				minBalance = minBalance - deduct;
				countw = countw + 1;
			} else {
				if (carryInterest == 1) {
					minBalance = minBalance - deduct - ((5 * deduct) / 100);
					countw = countw + 1;
					carryInterest = 0;
				} else {
					minBalance = minBalance - deduct - ((25 * deduct) / 1000);
					countw = countw + 1;
				}
			}
		}
		System.out.println(minBalance);
		icici();
	}

}
