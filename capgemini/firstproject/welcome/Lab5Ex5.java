package capgemini.firstproject.welcome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab5Ex5 {
	String first, last;

	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader mBuff = new BufferedReader(isr);

	public static void main(String[] args) {
		Lab5Ex5 lab = new Lab5Ex5();
		try {
			lab.validateAge();
		} catch (MyException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("Exception Occured : "+e);
		}
	}
	
	public void validateAge() throws MyException{
		int age = 0;
		System.out.println("Enter the age to be validated : ");
		try {
			age=Integer.parseInt(mBuff.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (age<15) {
			throw new MyException("Minimum Age critera not Satisfied");
		}
		else {
			System.out.println("Valid Age");
		}
	}

}
