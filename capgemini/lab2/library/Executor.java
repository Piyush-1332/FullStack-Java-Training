package capgemini.lab2.library;

import java.util.Scanner;

public class Executor {
	Books mBook=new Books();
	Jpaper mJpaper =  new Jpaper();
	CD mCD = new CD();
	Video mVideo = new Video();
	Scanner mScan = new Scanner(System.in);

	public static void main(String[] args) {
		Executor mExe = new Executor();
		mExe.selectItem();
	}

	public void selectItem() {
		while (true) {
			System.out.println("Welcome to Library\nEnter the Selction of the Book to be inserted: ");
			System.out.println("1.Book\n2.Journal Paper\n3.Music CD\n4.Video\n");
			int choice = mScan.nextInt();
			switch (choice) {
			case 1:
				mBook.showDetails(mScan);
				break;
			case 2:
				mJpaper.showDetails(mScan);
				break;
			case 3:
				mCD.showDetails(mScan);
				break;
			case 4:
				mVideo.showDetails(mScan);
				break;
			default:
				System.out.println("Wrong Input Entered");
			}
		}
	}

}
