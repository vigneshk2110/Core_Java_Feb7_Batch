package strings;

public class StringBuffer1 {
	public static void main(String args[]) {
		
//		Diff btw String Builder & String Buffer --> 
//		StringBuffer is thread Safe & StringBuilder is Not
		
		StringBuffer sb = new StringBuffer("Hello ");
		System.out.println(sb);
		
//		Append
		sb.append("Java");// now original string is changed
		System.out.println(sb);// prints Hello Java
		
//		Insert
		StringBuffer sb1=new StringBuffer("Hello ");  
		sb1.insert(1,"Java");//now original string is changed  
		System.out.println(sb1);//prints HJavaello  
		
//		replace()
		StringBuffer sb2=new StringBuffer("Hello");  
		sb2.replace(1,3,"Java");  
		System.out.println(sb2);//prints HJavalo  
		
//		Delete
		StringBuffer sb3=new StringBuffer("Hello");  
		sb3.delete(1,3);  
		System.out.println(sb3);//prints Hlo 
	}
}
