package strings;

import java.util.Arrays;

public class String4Methods {

	public static void main(String[] args) {
		
		int val = 10;

//		Basic Method - Length		
		String palindrome = "Dot saw I was Tod";
		int len = palindrome.length();
		System.out.println("String Length is : " + len);

//		Basic Method - CharAt
		char c = palindrome.charAt(1);
		System.out.println(c);

		for (int i = 0; i < palindrome.length(); i++) {
			System.out.println(palindrome.charAt(i));
		}

//		SubString

		String s = "Java$Program";
		System.out.println("Original String: " + s);
		System.out.println("Substring starting from index 6: " + s.substring(5));// Program
		System.out.println("Substring starting from index 0 to 6: " + s.substring(0, 6)); // Java
		
		String str = "Java is one of the high level programming Language";
		String[] strArray = str.split(" ");
		
		System.out.println(Arrays.toString(strArray));
		
		for (String string : strArray) {
			System.out.println(string);
		}
		
		String s111 = "Java";
		
		for (char c1 : s111.toCharArray()) {
			System.out.println(c1);
		}
		
		

	}
}
