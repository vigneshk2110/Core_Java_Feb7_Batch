package methods;

public class MethodExe3 {
	
//	Static void methods --> Parameterized
	public static void main(String[] args) {
		
//		greetings("Arnold"); 
//		
//		greeting();
		
//		int num1 = 10;
//		int num2 = 20;
//		
//		sum2Nums(num1, num2);
		
		int side = 10;
		
		printSquarewithSide(side);
		
	}

	private static void greeting() {
		System.out.println("This is a NON parameterized Method");
		
	}

	private static void printSquarewithSide(int side) {
		
		for (int i = 0; i < side; i++) {
			for (int j = 0; j < side; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void sum2Nums(int num1, int num2) {
		
		int result = num1 + num2;
		
		System.out.println("result is " + result);
		// TODO Auto-generated method stub
		
	}

	private static void greetings(String str) {
		System.out.println(str + ", Welcome to the party");
	}

}
