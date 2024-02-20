package strings;

public class String4Methods {

	public static void main(String[] args) {

//		Basic Method - Length		
		String palindrome = "Dot saw I was Tod";
		int len = palindrome.length();
		System.out.println("String Length is : " + len);

//		Basic Method - CharAt
		char c = palindrome.charAt(0);
		System.out.println(c);

		for (int i = 0; i < palindrome.length(); i++) {
			System.out.println(palindrome.charAt(i));
		}

//		SubString

		String s = "Java Program";
		System.out.println("Original String: " + s);
		System.out.println("Substring starting from index 6: " + s.substring(5));// Program
		System.out.println("Substring starting from index 0 to 6: " + s.substring(0, 5)); // Java
		
		String str = "Java is one of the high level programming Language";
		String[] strArray = str.split(" ");
		
		for (String string : strArray) {
			System.out.println(string);
		}

	}
}
