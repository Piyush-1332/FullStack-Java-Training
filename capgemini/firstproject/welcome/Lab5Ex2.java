package capgemini.firstproject.welcome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab5Ex2 {
	int num;
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader mBuff = new BufferedReader(isr);

	public static void main(String[] args) {
		Lab5Ex2 lab = new Lab5Ex2();
		System.out.println(lab.fib());
	}

	public int fib() {
		System.out.println("What is the value of n\n");
		try {
			num=Integer.parseInt(mBuff.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int first = 1;
		int sec = 1;
		int next;
		for(int i=2;i<num;i++) {
			next=first+sec;
			first=sec;
			sec=next;
			
		}
		return sec;
	}

}
