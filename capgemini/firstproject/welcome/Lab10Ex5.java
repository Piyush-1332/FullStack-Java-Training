package capgemini.firstproject.welcome;

public class Lab10Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab10Ex5 lab = new Lab10Ex5();
		Math math= lab::fact;
		
		math.fact(5);
	}
	
	 void fact(int num) {
		int fac = 1;
		while(num!=1) {
			fac=fac*num;
			num--;
		}
		System.out.println("Factorial "+fac);
	}
	
	
	interface Math{
		void fact(int i);
	}

}
