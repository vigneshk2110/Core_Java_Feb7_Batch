package strings;

public class String2Comparison {
	
//	String Comparison
	
	public static void main(String[] args) {
//		 String Constant Pool & Heap Memory

		String str = "I am a String"; // as a String literal
		System.out.println(str);

		String str11 = "I am a " + "String"; // as a constant expression
		System.out.println(str11);

		System.out.println(str == str11);

		String str2 = new String("I am a String"); // as a String Object using the constructor

		System.out.println(str == str2);
		System.out.println(str.equals(str2));
	}
}
