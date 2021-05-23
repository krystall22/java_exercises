package main;

public class Exercise7 {

	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = "hello";
		String str3 = str1;
		String str4 = new String("hello");
		String str5 = new String("hello");
		String str6 = str4;
		boolean x = str1 == str2; // true
		boolean x1 = str3 == str1; // true
		boolean x2 = str4 == str5; // false
		boolean x3 = str1 == str4; //false
		boolean x4 = str1.equals(str4); //true
		boolean x5 = str6 == str3; //false
		boolean x6 = str6.equals(str3); //true
	}

}
