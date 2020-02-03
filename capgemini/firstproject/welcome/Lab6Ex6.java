package capgemini.firstproject.welcome;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Lab6Ex6 {
	Scanner mScan = new Scanner(System.in);

	public static void main(String[] args) {
		Lab6Ex6 lab = new Lab6Ex6();
		lab.dislplayInfo();
	}

	public void dislplayInfo() {
		int lineNum = 0, chrcount = 0,word=0;
		String line = null;
		System.out.println("Enter the file location with extension : ");
		String fname = mScan.nextLine();
		try {
			FileReader mfile = new FileReader(
					"C:\\Users\\SAI\\Documents\\workspace-sts-3.9.11.RELEASE\\NietApplication\\src\\capgemini\\firstproject\\demo.txt");
			BufferedReader mb = new BufferedReader(mfile);
			try {
				while ((line = mb.readLine()) != null) {
					lineNum++;
					chrcount = chrcount+line.length();
					String ar[]=line.split(" ");
					word=word+ar.length;

				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Number of lines : "+lineNum);
		System.out.println("Number of characters : "+chrcount);
		System.out.println("Number of words : "+word);
	}

}
