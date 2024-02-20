package strings;

public class StringBuilder1 {
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Hello ");
		System.out.println(sb);
		
//		Append
		sb.append("Java!!!");
		System.out.println(sb);
		
//		insert
		StringBuilder sb1=new StringBuilder("Hello ");  
		sb1.insert(1,"Java");//now original string is changed  
		System.out.println(sb1);//prints HJavaello
		
//		Replace
		StringBuilder sb2=new StringBuilder("Hello");  
		sb2.replace(1,3,"Java");  
		System.out.println(sb2);//prints HJavalo  
		
//		Delete
		StringBuilder sb3=new StringBuilder("Hello");  
		sb3.delete(1,4);  
		System.out.println(sb3);//prints Ho
		
//		combination of Delete & Append
		StringBuilder sb4=new StringBuilder("Hello");  
		sb4.delete(1,4).append("w are you?");  
		System.out.println(sb4);//prints How are you?
		
//		Reverse
		StringBuilder sb5=new StringBuilder("Hello");  
		sb5.reverse();  
		System.out.println(sb5);//prints olleH  
	}

}
