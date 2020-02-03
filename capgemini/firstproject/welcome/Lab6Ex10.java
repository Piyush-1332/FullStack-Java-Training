package capgemini.firstproject.welcome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab6Ex10 {
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader mb = new BufferedReader(isr);

	public static void main(String[] args) {
		String name;
		Lab6Ex10 lab = new Lab6Ex10();
		System.out.println("Enter the Applicant name");
		try {
			name = lab.mb.readLine();
			System.out.println(lab.validate(name));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public boolean validate(String name) {
		if ((name.length()-4)>8) {
			int j=0;
			String test = "_job";
			for(int i=name.length()-4;i<name.length();i++) {
				if (name.charAt(i)!=test.charAt(j)) {
					return false;
				}
				j++;
			}
		}
		else {
			return false;
		}
		return true;
	}

}
