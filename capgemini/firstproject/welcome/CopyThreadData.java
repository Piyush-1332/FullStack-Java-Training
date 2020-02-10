package capgemini.firstproject.welcome;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyThreadData extends Thread {
	BufferedReader br;
	FileReader fr;
	FileWriter fw;

	CopyThreadData(BufferedReader br, FileReader fr, FileWriter fw) {
		this.br = br;
		this.fr = fr;
		this.fw = fw;
	}
//
//	CopyThreadData() {
//		System.out.println("10 Characters Copied");
//		// TODO Auto-generated constructor stub
//	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
//		Thread.sleep(10000);int s;
		int s;
		int count = 0;
		try {
			while ((s = br.read()) != -1) { // read a line
				if (count < 10) {
					count++;
					fw.write((char) s); // write to output file
					if(count==9) {
						fw.write("\n");
					}
					fw.flush();
				} else {
					count = 0;
					try {
						
						Thread.sleep(5000);
						System.out.println("10 Chars");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
//					try {
//					Thread.sleep(5000);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
