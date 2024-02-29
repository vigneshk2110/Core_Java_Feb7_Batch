package methods;

public class MethodExe1 {

//		The 5 methods parts in Java are mentioned below:
//
//			access_modifier
//		    Instance / Static
//			Return Type
//			Method Name
//			Parameters
//			Method Body

	
//		Non-Parameterized Method
//		<access_modifier> <return_type> <method_name>()
//		{
//		    //Method Body
//		}
	
//		Parameterized Method
//		<access_modifier> <return_type> <method_name>(int a, String b)
//		{
//	  		//Method Body
//		}
	
	public static void main(String[] args) {
		System.out.println("Main Method called by JVM");
		
		add(); // Method Calling		
		
		System.out.println("After add Method executed");
		
		add();
	
		
		
	}	
	
	public static void add() {
		System.out.println("Add method called by main Method");
		System.out.println("Add method called by main Method");
		System.out.println("Add method called by main Method");
		System.out.println("Add method called by main Method");
		System.out.println("Add method called by main Method");
	}

}
