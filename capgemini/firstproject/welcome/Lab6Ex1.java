package capgemini.firstproject.welcome;

import java.util.StringTokenizer;



public class Lab6Ex1 {
	int sum=0,temp;
	String s="1 2 3 4 5 6 7 8 9 10";
	public static void main(String[] args) {
		Lab6Ex1 lab = new Lab6Ex1();
		StringTokenizer tk = new StringTokenizer(lab.s, " ");
		while(tk.hasMoreTokens()) {
			lab.temp=Integer.parseInt(tk.nextToken());
			System.out.println(lab.temp);
			lab.sum=lab.sum+lab.temp;
		}
		System.out.println(lab.sum);
	}

}
