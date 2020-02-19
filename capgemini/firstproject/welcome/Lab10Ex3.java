package capgemini.firstproject.welcome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab10Ex3 {
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader mBuff = new BufferedReader(isr);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab10Ex3 lab = new Lab10Ex3();

		lab.auth();

	}

	public void auth() {

		Auth a = (u, p) -> {
			if (u.equals("admin") && p.equals("admin")) {
				return true;
			}
			return false;
		};

		try {
			System.out.println("Enter the UserName : ");
			String u = mBuff.readLine();
			System.out.println("Enter the Password : ");
			String p = mBuff.readLine();
			if (a.auth(u, p) == true) {
				System.out.println("Access Granted");
			} else {
				System.out.println("Access Denied");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			mBuff.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	interface Auth {
		boolean auth(String u, String p);
	}

}
