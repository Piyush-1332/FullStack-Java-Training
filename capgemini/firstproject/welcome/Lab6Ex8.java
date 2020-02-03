package capgemini.firstproject.welcome;

public class Lab6Ex8 {
	String test = "mad";

	public static void main(String[] args) {
		Lab6Ex8 lab = new Lab6Ex8();
		if (lab.checkString()) {
			System.out.println("Positive String");
		} else {
			System.out.println("Negative String");
		}
	}

	public boolean checkString() {
		test = test.toLowerCase();
		for (int i = 0; i < test.length() - 1; i++) {
			if (test.charAt(i) < test.charAt(i + 1)) {

			} else {
				return false;
			}
		}
		return true;
	}

}
