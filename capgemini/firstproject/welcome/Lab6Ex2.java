package capgemini.firstproject.welcome;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Lab6Ex2 {
	Scanner mScan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab6Ex2 lab = new Lab6Ex2();
		lab.readFile();
	}
	public void readFile() {
		int lineNnum=1;
		String line=null;
		String fname;
		System.out.println("Enter the name of the File with Extension : ");
		fname = mScan.nextLine();
		try {
			FileReader mfile = new FileReader("C:\\Users\\SAI\\Documents\\workspace-sts-3.9.11.RELEASE\\NietApplication\\src\\capgemini\\firstproject\\demo.txt");
			BufferedReader mb = new BufferedReader(mfile);
			try {
				while((line=mb.readLine())!=null) {
					System.out.println(lineNnum+" "+line);
					lineNnum++;
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Error reading File : "+fname);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
