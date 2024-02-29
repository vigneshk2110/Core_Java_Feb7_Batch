package methods;

public class MethodStatic {
	
//	Static Method   --> Doesn't need an object to execute the method
//	static void method_name(){ 
//	body // static area 
//	}
//	Void Method Doesn't return anything
	public static void myMethod1() {
		System.out.println("My Method1 is executed");
	}
	
	
//	Static & Parameterized Method
//	Has Parameters
	public static void addNumbers1(int a, int b) {
	    int sum = a + b;
	    System.out.println(sum);
	  }
	
//	Static & Parameterized Method
//	Has Parameters
//	Returns Value
	public static int subtractNumbers1(int a, int b) {
	    int diff = a - b;
	    return diff;
	  }
	
	public static int minFunction(int n1, int n2) {
		   int min;
		   if (n1 > n2)
		      min = n2;
		   else
		      min = n1;

		   return min; 
		}
	
	
	public static void main(String[] args) {

//		Calling Static Methods
		myMethod1();
		
		addNumbers1(10, 20);
		
		int result = subtractNumbers1(20, 10);
		
		System.out.println(result);
		
		result = minFunction(10, 20);
		
		System.out.println(result);

	}

}
