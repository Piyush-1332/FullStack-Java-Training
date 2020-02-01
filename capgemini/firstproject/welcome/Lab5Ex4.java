package capgemini.firstproject.welcome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab5Ex4 {

	String first, last;

	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader mBuff = new BufferedReader(isr);

	public static void main(String[] args) {
		Lab5Ex4 lab = new Lab5Ex4();
		System.out.println("Enter the FirstName : ");
		try {
			lab.first = lab.mBuff.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Enter the last Name : ");
		try {
			lab.last = lab.mBuff.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			lab.validateName(lab.first, lab.last);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Exception Occured : "+e);
			
		}
		

		
	}
	public void validateName(String a,String b) throws MyException {
		if(a.length()==0 && b.length()==0){
			throw new MyException("Both name should not be empty"); 
		}
		else if(b.length()==0) {
			throw new MyException("Last Name should not be Empty");
		}
		else if (a.length()==0) {
			throw new MyException("First Name field should not be Empty");
		}
		else {
			System.out.println("Valid Names Entered");
			
		}
	}

}
