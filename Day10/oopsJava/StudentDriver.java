package oopsJava;

public class StudentDriver {

	public static void main(String[] args) {
		int num = 10;
		num = 20;
		System.out.println(num); //20
		
		Student s1 = new Student();
		s1.name = "Siva";
		s1.age = 19;
		s1.gender= 'M';
		
//		System.out.println(s1);  // ???
		
		System.out.println(s1.name);
		s1.age = 21;
		System.out.println(s1.gender);
		System.out.println(s1.age);
		
		
//		Pass by value --> All the primitive variable are Pass by Value
//		Pass by reference --> All the Objects/User Defined Classess are pass by Reference
//		Reference --> Memory Location
		
		Student s2 = new Student();
		s2.name = "Sakthi";
		s2.age = 18;
		s2.gender = 'F';
		
//		System.out.println(s2.name + " " + s2.gender + " " + s2.age);
		
		System.out.println(s2.name);
		System.out.println(s2.gender);
		System.out.println(s2.age);
		
	}
}
