package capgemini.firstproject.welcome;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyThreadData extends Thread {

	FileInputStream bb;
	FileOutputStream fw;

	public CopyThreadData(FileInputStream fr) {
		// TODO Auto-generated constructor stub
		bb = fr;
		try {
			fw = new FileOutputStream(
					"C:\\\\Users\\\\SAI\\\\Documents\\\\workspace-sts-3.9.11.RELEASE\\\\NietApplication\\\\src\\\\capgemini\\\\firstproject\\\\welcome\\\\target.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		super.run();
		try {

			int ch;
			int count = 0;
			while ((ch = bb.read()) != -1) {
				if (count < 10) {
					++count;
					fw.write((char) ch);
					fw.flush();
//					Thread.interrupted();
				} else {
					count = 0;
					try {
						fw.write((char) ch);
						fw.flush();
						Thread.sleep(1000);
						System.out.println("\n10 Characters Copied");
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			bb.close();
			fw.close();
			System.out.println("\nFile Copied\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
