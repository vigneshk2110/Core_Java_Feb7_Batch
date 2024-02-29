package strings;

public class String1Creation {

	public static void main(String[] args) {
		
//		room no 1100
		String s1 = "java is a good language"; // creating string by Java string literal
		System.out.println(s1);
	
//		room no 1100
		String s2 = "java is a good language";
		System.out.println(s2);
		
//		room no 1101
		String s3 = "Java"; // Stored in String constant pool
		System.out.println(s3);
		
//		room 5000
		String s4 = new String ("Java"); // Heap Space
		

//		Character Sequence
		char ch[] = { 's', 't', 'r', 'i', 'n', 'g', 's' };
		String s20 = new String(ch); // converting char array to string
		System.out.println(s20); // Strings

		String s30 = new String("example"); // creating Java string by new keyword
		System.out.println(s30); // example
		
		int num = 15;	
		
		String num1 = String.valueOf(num);
		System.out.println(num1); // 15
		
		double weight = 65.70;
		int weigh = (int) weight;
		String weight1 = String.valueOf(weight);
		System.out.println(weight1); //65.70	
		
		char character = 'a';
		String charac = String.valueOf(character);
		System.out.println(charac);

	}

}
