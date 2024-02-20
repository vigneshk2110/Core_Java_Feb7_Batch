package methods;

public class InstanceMethod1 {
//	Instance Method  --> needs an object to execute the method
//	void method_name(){ 
//	body // instance area 
//	}
//	Void Method Doesn't return anything
	public void myMethod() {
		System.out.println("My Method is executed");
	}
	
//	Instance & Parameterized Method
//	Has Parameters
	public void addNumbers(int a, int b) {
	    int sum = a + b;
	    System.out.println(sum);
	  }
	
//	Instance & Parameterized Method
//	Has Parameters
//	Returns Value
	public int subtractNumbers(int a, int b) {
	    int diff = a - b;
	    return diff;
	  }
	
	public int maxFunction(int n1, int n2) {
		   int max;
		   if (n1 < n2)
			   max = n2;
		   else
			   max = n1;

		   return max; 
		}
	
	public static void main(String[] args) {
		
//		Calling Instance Method by creating object
		
		InstanceMethod1 obj = new InstanceMethod1();
		
		obj.myMethod();
		
		obj.addNumbers(20, 10);
		
		int result1 = obj.subtractNumbers(20, 10);
		System.out.println(result1);
		
		result1 = obj.maxFunction(10, 100);
		System.out.println(result1);
		
	}
	


}
