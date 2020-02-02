/*
 * COunt OCurenCes
 * 
 */

package capgemini.firstproject.welcome;

public class Lab3Ex4 {
	char arr[] = { 'a', 'a', 'b', 'c', 'e', 'g', 'b' };//sample array
	char test[] = new char[arr.length];//Test array

	public static void main(String[] args) {
		Lab3Ex4 lab = new Lab3Ex4();
		lab.fun(lab.arr);
	}

	public void fun(char[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			if (isdone(arr[i],test)) { //Check if the char is already counted or not
				test[i] = arr[i];
				for (int j = 0; j < arr.length; j++) {
					if (arr[i] == arr[j]) {
						count++;
					}
				}
				System.out.println("Count of "+arr[i]+" is "+count);
			}
		}
	}
	//Check function so that printing of char which is traversed can be handled
	public boolean isdone(char ch,char[] check) {
		for(int i = 0;i<test.length;i++) {
			if (ch==check[i]) {
				return false;
			}
		}
		return true;
	}

}
