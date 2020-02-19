package capgemini.firstproject;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		ArrayList < String > list = new ArrayList <> ( ) ;
		list.add("SE") ;
		list.add("EE") ;
		list.add("ME") ;
		list.add ("SE") ;
		list.add ("EE") ;
		list.remove("SE") ;
		System. out. print (":Values are : " + list ) ;
	}
}
