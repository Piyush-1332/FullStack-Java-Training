package capgemini.firstproject.welcome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab10Ex2 {
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader mBuff = new BufferedReader(isr);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab10Ex2 lab = new Lab10Ex2();

		lab.format();

	}

	public void format() {

		Format f = (s) -> {
			String n = "";
			for (int i = 0; i < s.length(); i++) {
				n = n + s.charAt(i);
				n = n + " ";
			}
			return n;
		};
		String s;
		try {
			s = mBuff.readLine();
			System.out.println("Old String " + s);
			System.out.println("New String " + f.str(s));	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

	interface Format {
		String str(String s);
	}

}
