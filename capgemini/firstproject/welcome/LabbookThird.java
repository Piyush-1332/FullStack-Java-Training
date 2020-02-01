package capgemini.firstproject.welcome;

public class LabbookThird {
	int number=12;
	public static void main(String[] args) {
		LabbookThird mObject = new LabbookThird();
		System.out.println("Answer is "+mObject.checkNumber(mObject.number));
	}
	
	public boolean checkNumber(int number) {
		int rem=0;
		int rem2=0;
		int flag=0;
		while (number>0) {
			rem=number%10;
			number=number/10;
			rem2=number%10;
			if (rem2>rem) {
				flag=1;
				break;
			}
		}
		if (flag==1){
			return false;
		}
		else {
			return true;
		}
			
	}

}
