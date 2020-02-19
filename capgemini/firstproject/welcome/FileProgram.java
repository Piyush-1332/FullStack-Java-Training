package capgemini.firstproject.welcome;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileProgram {

	public static void main(String[] args) {

		FileInputStream filer = null;

		try {
			filer = new FileInputStream(
					"C:\\\\Users\\\\SAI\\\\Documents\\\\workspace-sts-3.9.11.RELEASE\\\\NietApplication\\\\src\\\\capgemini\\\\firstproject\\\\welcome\\\\source.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		CopyThreadData thread1 = new CopyThreadData(filer);
		thread1.start();

	}
}
