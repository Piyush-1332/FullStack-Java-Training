package capgemini.lab2.library;

import java.util.Scanner;

public class Books extends WrittenItem{

	@Override
	public void bookQuality() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void journalQuality() {
		// TODO Auto-generated method stub
		
	}
	public void showDetails(Scanner mScan) {
		System.out.println("Enter the details in following manner: Book Name -> Book Price -> Book Type -> Book ID ");
		String name=mScan.next();
		setBOOK_NAME(name);
		setBOOK_PRICE(mScan.nextInt());
		setBOOK_TYPE(mScan.next());
		setBOOK_ID(mScan.nextInt());
		System.out.println(getBOOK_NAME());
		System.out.println(getBOOK_PRICE());
		System.out.println(getBOOK_TYPE());
		System.out.println(getBOOK_ID());
	}

}
