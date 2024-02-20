package strings;

public class String1Creation {

	public static void main(String[] args) {

		String s1 = "java"; // creating string by Java string literal
		System.out.println(s1);

//		Character Sequence
		char ch[] = { 's', 't', 'r', 'i', 'n', 'g', 's' };
		String s2 = new String(ch); // converting char array to string
		System.out.println(s2);

		String s3 = new String("example"); // creating Java string by new keyword
		System.out.println(s3);
		
		int num = 15;		
		String num1 = String.valueOf(num);
		System.out.println(num1);
		
		double weight = 65.70;
		String weight1 = String.valueOf(weight);
		System.out.println(weight1);		

	}

}
