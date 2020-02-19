package capgemini.firstproject.welcome;

public class Lab10Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Creation crt = Lab10Ex4::make;
		crt.make();

	}

	public static void make() {
		System.out.println("Instance Creation");
	}

	interface Creation {
		void make();
	}

}
