package capgemini.firstproject.welcome;

import java.util.Scanner;

public class Lab3Ex2 {

	Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		Lab3Ex2 mLab = new Lab3Ex2();
		System.out.println("Enter the number of elements of Array");
		int n=mLab.s.nextInt();
		String[] names= new String[n];
		System.out.println("Enter all the String Objects:");
		for (int i = 0; i < n; i++) {
			names[i] = mLab.s.nextLine();
		}
		names=mLab.sortRev(names);
		for (int i = 0; i < n; i++) {
			System.out.println(names[i]);
		}
	}

	public String[] sortRev(String[] names) {
		String temp;
		int x;
		for (int i = 0; i <names.length; i++) {
			for (int j = i + 1; j < names.length; j++) {
				if (names[i].compareTo(names[j]) > 0) {
					temp = names[i];
					names[i] = names[j];
					names[j] = temp;
				}
			}
		}
		if(names.length%2==0) {
			x=names.length/2;
		}else {
			x=(names.length/2)+1;
		}
		for(int i=0;i<x;i++) {
			names[i]=names[i].toUpperCase();
		}
		for(int i=x;i<names.length;i++) {
			names[i]=names[i].toLowerCase();
		}
		return names;
	}

}
