package capgemini.firstproject.welcome;

public class Labbook_second {
	int natural_number=150;
	public static void main(String[] args) {
		Labbook_second mObject = new Labbook_second();
		System.out.println("Answer is "+mObject.calculateDifference(mObject.natural_number));
		
	}
	public int calculateDifference(int number) {
		int sum=0;
		int sq=0;
		/*for(int i=1;i<=number;i++) {
			sum=sum+i*i;
		}*/
		sum=(((number)*(number+1)*((2*number)+1))/6);
		sq=((number*(number-1))/2)*((number*(number-1))/2);
		return sum-sq;
	}

}
