package com.cg.eis.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab5Ex6 {
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader mb = new BufferedReader(isr);

	public static void main(String[] args) {
		Lab5Ex6 lab= new Lab5Ex6();
		try {
			lab.validateSal();
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("Not Allowed for goa : "+e);
		}
	}
	
	//validate fun
	
	public void validateSal() throws EmployeeException{
		int sal=0;
		System.out.println("Enter the Salary");
		try {
			sal = Integer.parseInt(mb.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (sal<3000) {
			throw new EmployeeException("Low Salary");
		}
		else {
			System.out.println("Good to Go");
		}
		
	}

}
