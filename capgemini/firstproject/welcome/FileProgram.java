package capgemini.firstproject.welcome;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileProgram {

	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader mBuff = null;
		FileWriter fw = null;
		try {
			fr = new FileReader("C:\\Users\\SAI\\Documents\\workspace-sts-3.9.11.RELEASE\\NietApplication\\src\\capgemini\\firstproject\\welcome\\source.txt");
			mBuff = new BufferedReader(fr);
			try {
				fw = new FileWriter("C:\\Users\\SAI\\Documents\\workspace-sts-3.9.11.RELEASE\\NietApplication\\src\\capgemini\\firstproject\\welcome\\target.txt",true);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CopyThreadData thread1 = new CopyThreadData(mBuff, fr, fw);
		thread1.start();
		
		CopyThreadData thread2 = new CopyThreadData(mBuff,fr,fw);
		
		thread2.start();
	}
}
