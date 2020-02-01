package capgemini.firstproject.welcome;

public class CalculateSum {
	int natural_number=150;
	
	public static void main(String[] args) {
		CalculateSum mObject = new CalculateSum();
		mObject.showSum(mObject.natural_number);
	}
	
	public void showSum(int number) {
		int sum=0;
		for(int i=1;i<=number;i++) {
			if(i%3==0 || i%5==0) {
				sum=sum+i;
			}
		}
		System.out.println("Sum of N natural number which are divisible by 3 or 5 is "+ sum);
	}

}
