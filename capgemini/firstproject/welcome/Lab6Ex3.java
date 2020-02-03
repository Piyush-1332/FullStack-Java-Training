package capgemini.firstproject.welcome;

public class Lab6Ex3 {
	String str="EARTH";
	public static void main(String[] args) {
		Lab6Ex3 lab = new Lab6Ex3();
		System.out.println(lab.str+" | "+lab.getImage(lab.str));
	}
	
//	public StringBuilder getImage(String str) {
////		String image=null;
//		StringBuilder sb = new StringBuilder();
//		sb.append(str);								Can be Easily done By any of the class 1. String Builder
//		sb=sb.reverse();																   2. String Buffer
////		image=sb;
//		return sb;
//	}
	public StringBuffer getImage(String str) {
		StringBuffer sb = new StringBuffer();
		sb.append(str);
		return sb.reverse();
	}
}
