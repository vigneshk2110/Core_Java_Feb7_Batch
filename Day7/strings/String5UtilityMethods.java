package strings;

public class String5UtilityMethods {
	
	public static void main(String[] args) {
		
//		toUpperCase && toLowerCase
		String str="Java";    
		System.out.println(str.toUpperCase());//JAVA   
		System.out.println(str.toLowerCase());//java    
		System.out.println(str);//Java(no change in original)   
		
//		equalsIgnoreCase()
		String s10="java";
		s10 = "Java";
		String s20="java";  
		String s30="JAVA";  
		String s40="python";  
		System.out.println(s10.equalsIgnoreCase(s20));//true because content and case both are same  
		System.out.println(s10.equalsIgnoreCase(s30));//true because case is ignored  
		System.out.println(s10.equalsIgnoreCase(s40));//false because content is not same		
		
		
//		Trim
		String s1="  java program  ";    
		System.out.println(s1);//  java program   
		System.out.println(s1.trim());//java program    
		
//		startsWith && endsWith
		String s2="Program";    
		 System.out.println(s2.startsWith("Prog"));//true    
		 System.out.println(s2.endsWith("am"));//true  
		 System.out.println(s2.endsWith("m"));//true
		 
//       intern		 
		 String s3 = new String("Java Program");    
		 String s4=s3.intern();   // = "Java Program"
		 System.out.println(s4);//Java Program 
		 System.out.println(s3 == s4); // false
		 
		 String s5= "Java Program";    
		 String s6=s5.intern();   // = "Java Program"
		 System.out.println(s6);//Java Program 
		 System.out.println(s6 == s5); // true
		 
//		 valueOf()
		 int n=10;    
		 String str1=String.valueOf(n);    
		 System.out.println(str1+10);    //1010
		 
//		 Replace
		 String str2="Java is a programming language. Java is a platform. Java is an Island.";     
		 System.out.println(str2);
		 
		 String replacedString=str2.replace("Java","python");//replaces all occurrences of "Java" to "Python"      
		 System.out.println(replacedString); 		    
		
		
	}
}
