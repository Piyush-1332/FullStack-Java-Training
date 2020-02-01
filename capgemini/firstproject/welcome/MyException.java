package capgemini.firstproject.welcome;

//My custom Exception

@SuppressWarnings("serial")
public class MyException extends Exception{
	MyException(String message){
		super(message);
	}
}
