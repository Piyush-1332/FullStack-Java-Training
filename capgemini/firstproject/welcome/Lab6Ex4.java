package capgemini.firstproject.welcome;

public class Lab6Ex4 {
	String str = "JAVA";
	String vov = "aeiouAEIOU";

	public static void main(String[] args) {
		Lab6Ex4 lab = new Lab6Ex4();
		lab.alterString(lab.str);
	}

	public void alterString(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (isvowel(str.charAt(i))) {
				System.out.print(str.charAt(i));
			}else {
				char temp = str.charAt(i);
				temp++;
				System.out.print(temp);
			}
		}
	}

	public boolean isvowel(char ch) {
		for(int i = 0;i<vov.length();i++) {
			if(ch==vov.charAt(i)) {
				return true;
			}
		}
		return false;
	}
}
