package capgemini.firstproject.welcome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.Period;

public class Lab6Ex9 {
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader mb = new BufferedReader(isr);

	public static void main(String[] args) {
		Lab6Ex9 lab = new Lab6Ex9();
		try {
			System.out.println("Enter Date in this format DD/MM/YYYY ");
			lab.printInfo(lab.mb.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void printInfo(String info) {
		String ar[] = info.split("/");
		LocalDate pdate = LocalDate.of(Integer.parseInt(ar[2]), Integer.parseInt(ar[1]), Integer.parseInt(ar[0]));
		LocalDate now = LocalDate.now();

		Period diff = Period.between(pdate, now);

		System.out.printf("\nDifference is %d years, %d months and %d days old\n\n", diff.getYears(), diff.getMonths(),
				diff.getDays());

	}

}
