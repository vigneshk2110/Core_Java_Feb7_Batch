package strings;

public class String3Concat {
	public static void main(String[] args) {
		
		String str = "Java " + "Programs" + 10;
		System.out.println(str); // Java Programs10

		String str1 = 10 + 5.30 + "Java" + 40.50 + 40;
		System.out.println(str1); // 15.3Java40.540

		String s1 = "Java";
		String s2 = "Programs";
		
		System.out.println(s1.concat(s2));  // Java Programs
		
		System.out.println(s1);
		System.out.println(s2);
		
		String s3 = s1.concat(s2);
		System.out.println(s3);
		
		String s4 = String.format("%s , %s",s1,s2);   //String s4 to store the result  
        System.out.println(s4);
        
        String s5 = String.join(" % ",s1,s2);   //String s5 to store the result  
        System.out.println(s5);

	}
}
