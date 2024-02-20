package strings;

import java.util.StringTokenizer;

public class StringTokenizer1 {
	public static void main(String args[]) {

//		break a String into tokens with a delimiter in place
		
		StringTokenizer st = new StringTokenizer("my name is Ajith", " ");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

		StringTokenizer st1 = new StringTokenizer("my,name,is,Ajith");
		System.out.println("Next token is : " + st1.nextToken(","));
		
		StringTokenizer st2 = new StringTokenizer("Hello Everyone Have a nice day"," ");    
        System.out.println("Total number of Tokens: "+st2.countTokens());    
		
		
	}
}
