package methods;

public class MethodExe5 {

//	Return Type Methods  --> Parameterized

	public static void main(String[] args) {
//		String greetingMessage = greetGuest("Thor");
//		System.out.println(greetingMessage);

		int ans = powerOf2(40);
		System.out.println(ans);

		int ans1 = powerOf3(54);
		System.out.println(ans1);
		
		int result = divide(10,5);
		System.out.println(result);

//		boolean examResult = isPass(45);

	}

	private static int divide(int first, int second) {
		int result = first/second; 
	// TODO Auto-generated method stub
	return result;
}

	private static int powerOf3(int number) {
		int result = 1;

		for (int i = 0; i < number; i++) {

			result *= 3;

		}
		return result;
	}

	private static boolean isPass(int i) {
		// TODO Auto-generated method stub
		return false;
	}

	private static int powerOf2(int num) {

		int result = 1;

		for (int i = 0; i < num; i++) {

			result *= 2;

		}
		return result;
	}

	private static String greetGuest(String guestName) {
		String greet = "Hi, " + guestName + "...";
		greet += "Welcome to the Party!!!";
		return greet;
	}
}
